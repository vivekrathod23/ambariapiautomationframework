package com.hwx.ambariapilib.service;

import com.hwx.ambariapilib.AmbariItems;
import com.hwx.ambariapilib.common.IDConstants;
import com.hwx.ambariapilib.json.host.HostComponentJson;
import com.hwx.ambariapilib.json.service.ServiceComponentDetailJson;
import com.hwx.ambariapilib.json.service.ServiceComponentLongInfoJson;
import com.hwx.ambariapilib.json.upgrade.UpgradeRequestJson;
import com.hwx.clientlib.http.HTTPBody;
import com.hwx.clientlib.http.HTTPMethods;
import com.hwx.clientlib.http.HTTPRequest;
import com.hwx.clientlib.http.HTTPResponse;
import com.hwx.utils.FileUtils;
import com.hwx.utils.LinuxCommandExecutor;
import com.hwx.utils.WaitUtil;
import com.hwx.utils.validation.ValidationUtils;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ajain on 10/7/15.
 */
public class ServiceComponent extends AmbariItems{

    public enum ComponentUpgradeScripts {
        DATANODE("datanode_upgrade.py"),
        NODEMANAGER("nodemanager_upgrade.py");

        private String upgradeScript;

        private ComponentUpgradeScripts(String upgradeScript) {
            this.upgradeScript = upgradeScript;
        }

        public String getUpgradeScript() {
            return this.upgradeScript;
        }
    }

    public  String getUpgradeScriptName(String component) {
        for (ComponentUpgradeScripts c : ComponentUpgradeScripts.values()) {
            if(c.toString().equalsIgnoreCase(component))
                return c.getUpgradeScript();
        }
        return null;
    }

    private ServiceComponentDetailJson serviceComponentDetailJson;

    public ServiceComponentDetailJson getServiceComponentDetailJson() {
        return serviceComponentDetailJson;
    }

    public ServiceComponent(String serviceComponentAPIUrl){

        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, serviceComponentAPIUrl);
        HTTPResponse resp = rc.sendHTTPRequest(req);

        serviceComponentDetailJson = gson.fromJson(resp.getBody().getBodyText(),ServiceComponentDetailJson.class );
    }

    public String getName() {
        return serviceComponentDetailJson.getServiceComponentInfo().getComponent_name();
    }

    public List<String> getHosts() {
        List<String> hosts = new ArrayList<String>();

        HostComponentJson[] hostComponents = serviceComponentDetailJson.getHost_components();
        for(int i=0 ; i<hostComponents.length ; i++) {
            hosts.add(hostComponents[i].getHostRoles().getHost_name());
        }
        if(hosts.size() == 0)
            logger.logError("No hosts found that match the component");

        return hosts;
    }

    public boolean isMasterComponent() {
        return serviceComponentDetailJson.getServiceComponentInfo().getCategory().equalsIgnoreCase("MASTER");
    }

    public boolean isSlaveComponent() {
        return serviceComponentDetailJson.getServiceComponentInfo().getCategory().equalsIgnoreCase("SLAVE");
    }

    public boolean isClientComponent() {
        return serviceComponentDetailJson.getServiceComponentInfo().getCategory().equalsIgnoreCase("CLIENT");
    }

    public void injectFailure() {
        for (String host : getHosts()) {
            LinuxCommandExecutor.executeCommand(host, "root", String.format("for file in `find /var/lib/ambari-agent/ -name %s `; " +
                    "do  sed -i\".original\" '/def /a \\ \\ raise Fail(\"" + IDConstants.TEST_SERVICE_COMPONENT_INJECTED_FAILURE + "\")'  $file;  done;", getUpgradeScriptName(getName())));

        }
    }

    public void fixFailure() {
        for(String host : getHosts()) {
            LinuxCommandExecutor.executeCommand(host, "root", String.format("for file in `find /var/lib/ambari-agent/ -name %s.original `;" +
                    " do  mv -f \"$file\" \"${file//\\.original/}\" ;  done;", getUpgradeScriptName(getName())));
        }
    }

    public void restart() throws Exception {
        doStateChangeOperation("RESTART", getHosts());

    }

    private void doStateChangeOperation(String operation, List<String> hosts) throws Exception {
        String clusterEndpoint = getServiceComponentDetailJson().getHref().split("services")[0];
        String uri = clusterEndpoint + "requests";
        // TODO - find a better way to get the URI for the request, something like - clusterJson.getHref(); same thing for line #143

        ServiceComponentLongInfoJson serviceComponentInfo = getServiceComponentDetailJson().getServiceComponentInfo();

        Map<String, String> map = new HashMap<String, String>();
        map.put("{OPERATION}", operation);
        map.put("{COMPONENT_NAME}", getName());
        map.put("{CLUSTER_NAME}", serviceComponentInfo.getCluster_name());
        map.put("{SERVICE_NAME}", serviceComponentInfo.getService_name());
        map.put("{HOST_NAME}", convertListToCommaSeparatedValues(hosts));

        String requestBody = FileUtils.getJsonAsString("ComponentStateChange.json", map);
        logger.logInfo("Request body  : " + requestBody);

        HTTPRequest req = new HTTPRequest(HTTPMethods.POST, uri);
        req.setBody(new HTTPBody(requestBody));
        HTTPResponse resp = rc.sendHTTPRequest(req);

        if(ValidationUtils.validateResponseCode(resp, 202)) {

            UpgradeRequestJson upgradeRequestJson = gson.fromJson(resp.getBody().getBodyText(), UpgradeRequestJson.class);
            int requestId = upgradeRequestJson.getRequests().getId();

            WaitUtil.waitForRequestToBeCompleted(clusterEndpoint.substring(0,clusterEndpoint.length()-1), requestId);
        }
        else {
            String error = String.format("Error while doing component %s state change operation to %s." +
                    " API response code %s", getName(), operation, String.valueOf(resp.getStatusCode()));
            logger.logError(error);
            throw new Exception(error);
        }

    }

    private String convertListToCommaSeparatedValues(List<String> list) {
        StringBuilder commaSepValueBuilder = new StringBuilder();

        //Looping through the list
        for ( int i = 0; i< list.size(); i++){
            //append the value into the builder
            commaSepValueBuilder.append(list.get(i));

            if ( i != list.size()-1){
                commaSepValueBuilder.append(", ");
            }
        }
        return commaSepValueBuilder.toString();
    }
}
