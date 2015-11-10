package com.hwx.ambariapilib.host;

import com.hwx.ambariapilib.AmbariItems;
import com.hwx.ambariapilib.json.host.HostJson;
import com.hwx.ambariapilib.json.service.ServiceJson;
import com.hwx.ambariapilib.json.service.ServiceRequestJson;
import com.hwx.clientlib.http.HTTPBody;
import com.hwx.clientlib.http.HTTPMethods;
import com.hwx.clientlib.http.HTTPRequest;
import com.hwx.clientlib.http.HTTPResponse;
import com.hwx.utils.FileUtils;
import com.hwx.utils.config.ConfigProperties;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ajain on 9/23/15.
 */
public class Host extends AmbariItems{

    private HostJson hostJson;

	public Host() {
        super();
    }

    public Host(String hostAPIUrl){
        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, hostAPIUrl);
        HTTPResponse resp = rc.sendHTTPRequest(req);

        hostJson= gson.fromJson(resp.getBody().getBodyText(), HostJson.class);
    }


    /* ==================================================================================
                                Getters and Setters Methods
       ================================================================================== */

    public HostJson getHostJson() {
        return hostJson;
    }

    public void setHostJson(HostJson hostJson) {
        this.hostJson = hostJson;
    }



    /* ==================================================================================
                                Host Functionality Methods
       ================================================================================== */

    //Get all host components
    public ArrayList<HostComponent> getHostComponents(){
        ArrayList<HostComponent> hostComponents = new ArrayList<HostComponent>();
        int numHostComponents = hostJson.getHost_components().length;

        for(int i=0;i<numHostComponents;i++)
            hostComponents.add(new HostComponent(hostJson.getHost_components()[i].getHref()));

        return hostComponents;
    }


    //Create a host components
    public void createHostComponent(String hostComponentName){
        String clusterName = hostJson.getHosts().getCluster_name();
        String hostName = hostJson.getHosts().getHost_name();

        HTTPRequest req = new HTTPRequest(HTTPMethods.POST, "/clusters/"+clusterName+"/hosts/"+hostName+"/host_components/"+hostComponentName);
        HTTPResponse resp = rc.sendHTTPRequest(req);
    }


    public void startHostComponents(String hostComponent){
        changeHostComponents(hostComponent,"STARTED");
    }

    public void stopHostComponents(String hostComponent){
        changeHostComponents(hostComponent, "INSTALLED");
    }

    private void changeHostComponents(String hostComponent, String status) {
        String clusterName = hostJson.getHosts().getCluster_name();
        String hostName = hostJson.getHosts().getHost_name();

    	Map<String, String> map = new HashMap<String, String>();
		map.put("{STATUS}", status);
		logger.logDebug("Status: " +status);

		String requestBody = FileUtils.getJsonAsString("HostComponent.json", map);
		logger.logInfo("Request body  : " + requestBody);

        HTTPRequest req = new HTTPRequest(HTTPMethods.PUT, "/clusters/"+clusterName+"/hosts/"+hostName+"/host_components/"+hostComponent);
        req.setBody(new HTTPBody(requestBody));
        HTTPResponse resp = rc.sendHTTPRequest(req);

        ServiceJson serviceJson = gson.fromJson(resp.getBody().getBodyText(), ServiceJson.class);
        logger.logInfo("Response body : " + resp.getBody().getBodyText());
        String serviceUrl = serviceJson.getHref();
        logger.logInfo("Service URL : " +serviceUrl);

        waitForServiceCompletion(serviceUrl);
    }

    public String getServiceStatus(String serviceStatusAPIUrl){
        //Generate the GET request to get the status of service
        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, serviceStatusAPIUrl);
        HTTPResponse resp = rc.sendHTTPRequest(req);

        //Extract service status from returned JSON
        ServiceRequestJson requestJson = gson.fromJson(resp.getBody().getBodyText(), ServiceRequestJson.class);
        String requestStatus = requestJson.getRequests().getRequest_status();

        return requestStatus;
    }

    public void waitForServiceCompletion(String serviceStatusAPIUrl){
        //ToDo Move the counter to config file
        int counter = 0;
		try {
			counter = conf.getInt(ConfigProperties.POLLING_COUNTER.getKey());
		} catch (Exception e) {
			logger.logError(e.getCause().toString());
		}
		
		logger.logDebug("Polling Counter:" +counter);
        int interval = 1000*60; //in milli seconds
        
        while(counter-- > 0){
            if(getServiceStatus(serviceStatusAPIUrl).equals("COMPLETED"))
                break;

            waitForFixedInterval(interval);
        }
    }

    //ToDo Move to Utils + Add exception
    public void waitForFixedInterval(int waitTime){
        try{
            Thread.sleep(1000*60);
        }
        catch(Exception e){}
    }

    public String getHealthStatus(){
        return hostJson.getHosts().getHost_status();
    }

    public String getHealthState()
    {
        return hostJson.getHosts().getHost_state();
    }

    public String getName() {
        return hostJson.getHosts().getHost_name();
        }

    public String getHostIP(){
        return hostJson.getHosts().getIp();
    }

}
