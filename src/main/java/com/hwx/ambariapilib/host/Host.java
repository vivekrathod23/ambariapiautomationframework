package com.hwx.ambariapilib.host;

import com.google.gson.Gson;
import com.hwx.ambariapilib.AmbariItems;
import com.hwx.ambariapilib.json.cluster.RequestJson;
import com.hwx.ambariapilib.json.host.HostJson;
import com.hwx.ambariapilib.json.service.ServiceJson;
import com.hwx.clientlib.http.HTTPBody;
import com.hwx.clientlib.http.HTTPMethods;
import com.hwx.clientlib.http.HTTPRequest;
import com.hwx.clientlib.http.HTTPResponse;

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


    public void startHostComponentse(String hostComponent){
        changeHostComponents(hostComponent,"STARTED");
    }

    public void stopHostComponents(String hostComponent){
        changeHostComponents(hostComponent, "INSTALLED");
    }

    private void changeHostComponents(String hostComponent, String status) {
        //ToDo Move this to JSON file
        String requestBody = "{\"HostRoles\": {\"state\": \"STARTED\"}}";
        requestBody.replaceAll("{STATUS}",status);

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
        int counter = 10;
        int interval = 1000*60;

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
}
