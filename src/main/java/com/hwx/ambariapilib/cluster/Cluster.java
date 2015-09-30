package com.hwx.ambariapilib.cluster;

import com.google.gson.Gson;
import com.hwx.ambariapilib.AmbariItems;
import com.hwx.ambariapilib.host.Host;
import com.hwx.ambariapilib.service.RequestJson;
import com.hwx.ambariapilib.service.ServiceJson;
import com.hwx.clientlib.http.HTTPBody;
import com.hwx.clientlib.http.HTTPMethods;
import com.hwx.clientlib.http.HTTPRequest;
import com.hwx.clientlib.http.HTTPResponse;
import com.hwx.clientlib.restassured.RestAssuredClient;
import com.hwx.utils.logging.AmbariLogger;
import com.jayway.restassured.path.json.JsonPath;

import java.util.List;

/**
 * Created by ajain on 9/23/15.
 */
public class Cluster extends AmbariItems {

    private String clusterName;
    private String version;
    private Host[] hosts;
    

    private Cluster() {
        super();
    }

    public Cluster(String clusterName , String version) {
        this();
        this.clusterName = clusterName;
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public Host[] getHosts(){
        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, "/clusters/"+clusterName);
        HTTPResponse resp = rc.sendHTTPRequest(req);

        //ToDo Add cluster related classes
        JsonPath path = new JsonPath(resp.getBody().getBodyText());
        List<String> hostNameList = path.getList("hosts.Hosts.host_name");

        hosts = new Host[hostNameList.size()];

        for(int i=0;i<hostNameList.size();i++)
            hosts[i] = new Host(clusterName,hostNameList.get(i));

        return hosts;
    }

    public void startService(String serviceName){
        String requestBody = "{\"RequestInfo\": {\"context\" :\"Start HDFS via REST\"}, \"Body\": {\"ServiceInfo\": {\"state\": \"STARTED\"}}}";
        HTTPRequest req = new HTTPRequest(HTTPMethods.PUT, "/clusters/"+clusterName+"/services/"+serviceName);
        req.setBody(new HTTPBody(requestBody));
        HTTPResponse resp = rc.sendHTTPRequest(req);

        Gson gson = new Gson();
        ServiceJson serviceJson = gson.fromJson(resp.getBody().getBodyText(), ServiceJson.class);
        logger.logInfo("Response body : " +resp.getBody().getBodyText());
        String serviceUrl = serviceJson.getHref();
        logger.logInfo("Service URL : " +serviceUrl);


        int counter = 10;

        while(counter > 0) {
            req = new HTTPRequest(HTTPMethods.GET, serviceUrl);
            resp = rc.sendHTTPRequest(req);

            RequestJson requestJson = gson.fromJson(resp.getBody().getBodyText(), RequestJson.class);
            String requestStatus = requestJson.getRequests().getRequest_status();

            System.out.println("Request Status : "+requestStatus);

            if(requestStatus.equals("COMPLETED")) break;

            try{
                Thread.sleep(1000*60);
            }
            catch(Exception e){}

            counter--;
        }


    }
}
