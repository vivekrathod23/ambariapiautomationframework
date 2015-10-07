package com.hwx.ambariapilib.host;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.hwx.ambariapilib.AmbariItems;
import com.hwx.ambariapilib.json.cluster.ClusterServiceDetailsJson;
import com.hwx.ambariapilib.json.cluster.RequestJson;
import com.hwx.ambariapilib.json.host.HostJson;
import com.hwx.ambariapilib.json.host.HostsJson;
import com.hwx.ambariapilib.json.service.ServiceJson;
import com.hwx.clientlib.http.HTTPBody;
import com.hwx.clientlib.http.HTTPMethods;
import com.hwx.clientlib.http.HTTPRequest;
import com.hwx.clientlib.http.HTTPResponse;
import com.hwx.utils.FileUtils;
import com.hwx.utils.config.ConfigProperties;

/**
 * Created by ajain on 9/23/15.
 */
public class Host extends AmbariItems{

    private String clusterName;
    private String hostName;

    private HostJson hostJson;

	public Host() {
        super();
    }

    public Host(String clusterName, String hostName){
        this();
        this.clusterName = clusterName;
        this.hostName = hostName;
        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, "/clusters/"+clusterName+"/hosts/"+hostName);
        HTTPResponse resp = rc.sendHTTPRequest(req);

        Gson gson = new Gson();
        hostJson = gson.fromJson(resp.getBody().getBodyText(), HostJson.class);
    }

    public Host(String hostAPIUrl){
        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, hostAPIUrl);
        HTTPResponse resp = rc.sendHTTPRequest(req);

        hostJson= gson.fromJson(resp.getBody().getBodyText(), HostJson.class);
    }

    public void startHostComponents(String hostComponent){
        changeHostComponents(hostComponent,"STARTED");
    }

    public void stopHostComponents(String hostComponent){
        changeHostComponents(hostComponent, "INSTALLED");
    }

    private void changeHostComponents(String hostComponent, String status) {
    	
    	Map<String, String> map = new HashMap<String, String>();
		map.put("{STATUS}", status);
		logger.logDebug("Status: " +status);

		String requestBody = FileUtils.getJsonAsString("HostComponent.json", map);
		logger.logInfo("Request body  : " + requestBody);


        HTTPRequest req = new HTTPRequest(HTTPMethods.PUT, "/clusters/"+clusterName+"/hosts/"+hostName+"/host_components/"+hostComponent);
        req.setBody(new HTTPBody(requestBody));
        HTTPResponse resp = rc.sendHTTPRequest(req);

        Gson gson = new Gson();
        ServiceJson serviceJson = gson.fromJson(resp.getBody().getBodyText(), ServiceJson.class);
        logger.logInfo("Response body : " +resp.getBody().getBodyText());
        String serviceUrl = serviceJson.getHref();
        logger.logInfo("Service URL : " +serviceUrl);

        waitForServiceCompletion(serviceUrl);
    }

    public String getServiceStatus(String serviceStatusAPIUrl){
        //Generate the GET request to get the status of service
        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, serviceStatusAPIUrl);
        HTTPResponse resp = rc.sendHTTPRequest(req);

        //Extract service status from returned JSON
        Gson gson = new Gson();
        RequestJson requestJson = gson.fromJson(resp.getBody().getBodyText(), RequestJson.class);
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

    public String getHealthState(){
        return hostJson.getHosts().getHost_state();
    }
    
    public HostJson getHostJson() {
		return hostJson;
	}

	public void setHostJson(HostJson hostJson) {
		this.hostJson = hostJson;
	}
}
