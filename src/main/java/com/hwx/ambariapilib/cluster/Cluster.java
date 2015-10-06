package com.hwx.ambariapilib.cluster;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.hwx.ambariapilib.AmbariItems;
import com.hwx.ambariapilib.host.Host;
import com.hwx.ambariapilib.json.cluster.ClusterJson;
import com.hwx.ambariapilib.json.cluster.ClusterServicesListJson;
import com.hwx.ambariapilib.json.cluster.RequestJson;
import com.hwx.ambariapilib.json.service.ServiceJson;
import com.hwx.ambariapilib.service.Service;
import com.hwx.clientlib.http.HTTPBody;
import com.hwx.clientlib.http.HTTPMethods;
import com.hwx.clientlib.http.HTTPRequest;
import com.hwx.clientlib.http.HTTPResponse;

/**
 * Created by ajain on 9/23/15.
 */
public class Cluster extends AmbariItems {

    private String clusterName;
    private String version;
    private Host[] hosts;

    private ClusterJson clusterJson;

    

    private Cluster() {
        super();
    }

    public Cluster(String clusterName , String version) {
        this();
        this.clusterName = clusterName;
        this.version = version;

        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, "/clusters/"+clusterName);
        HTTPResponse resp = rc.sendHTTPRequest(req);

        clusterJson = gson.fromJson(resp.getBody().getBodyText(), ClusterJson.class);
    }


    //Get all the services inside the cluster
    public ArrayList<Service> getServices(){
        ArrayList<Service> services = new ArrayList<Service>();

        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, "/clusters/"+clusterName+"/services");
        HTTPResponse resp = rc.sendHTTPRequest(req);



        ClusterServicesListJson clusterServicesListJson = gson.fromJson(resp.getBody().getBodyText(), ClusterServicesListJson.class);

        //Get the count of services in cluster
        int numServices = clusterServicesListJson.getItems().length;

        for(int i=0;i<numServices;i++)
            services.add(new Service(clusterServicesListJson.getItems()[i].getHref()));

        return services;
    }

    //Create a new service inside the cluster
    public HTTPResponse createServices(String serviceName){
        HTTPRequest req = new HTTPRequest(HTTPMethods.POST, "/clusters/"+clusterName+"/services/"+serviceName);
        HTTPResponse resp = rc.sendHTTPRequest(req);

        return resp;
    }

    //Start the service
    public void startService(String serviceName){
        updateServiceStatus(serviceName, "STARTED");
    }

    //Stop the service
    public void stopService(String serviceName){
        updateServiceStatus(serviceName,"INSTALLED");
    }


    //Update all the services
    public HTTPResponse updateAllServices(String status){
        //ToDo Move to JSON file
        String body = "{\"ServiceInfo\":{\"state\" : \"{STATUS}\"}}";
        HTTPRequest req = new HTTPRequest(HTTPMethods.PUT, "/clusters/"+clusterName+"/services");
        body = body.replace("{STATUS}",status);
        req.setBody(new HTTPBody(body));
        HTTPResponse resp = rc.sendHTTPRequest(req);

        return resp;
    }

    //Start all the services
    public HTTPResponse startAllServices(){
        return updateAllServices("STARTED");
    }

    //Stop all the services
    public HTTPResponse stopAllServices(){
        return updateAllServices("INSTALLED");
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

//        //ToDo Add cluster related classes
//        JsonPath path = new JsonPath(resp.getBody().getBodyText());
//        List<String> hostNameList = path.getList("hosts.Hosts.host_name");
//
//        hosts = new Host[hostNameList.size()];
//
//        for(int i=0;i<hostNameList.size();i++)
//            hosts[i] = new Host(clusterName,hostNameList.get(i));

        Gson gson = new Gson();
        ClusterJson clusterJson = gson.fromJson(resp.getBody().getBodyText(), ClusterJson.class);

        logger.logInfo("Request : " +req.getUrl());
        logger.logInfo("Response body : " +resp.getBody().getBodyText());

        hosts = new Host[clusterJson.getClusters().getTotal_hosts()];

        for(int i=0;i<hosts.length;i++)
            hosts[i] = new Host(clusterName,clusterJson.getHosts()[i].getHosts().getHost_name());

        return hosts;
    }

    public void addHost(String hostName){
        HTTPRequest req = new HTTPRequest(HTTPMethods.POST, "/clusters/"+clusterName+"/hosts/"+hostName);
        HTTPResponse resp = rc.sendHTTPRequest(req);

        System.out.println(resp.getBody().getBodyText());
    }



    private void updateServiceStatus(String serviceName, String status) {
        //ToDo Move this to JSON file
        String requestBody = "{\"RequestInfo\": {\"context\" :\"Stop {SERVICE} via REST\"}, \"Body\": {\"ServiceInfo\": {\"state\": \"{STATUS}\"}}}";
        requestBody = requestBody.replace("{SERVICE}",serviceName);
        requestBody = requestBody.replace("{STATUS}",status);

//        System.out.println(requestBody);
//        System.out.println(serviceName+"  "+status);

        HTTPRequest req = new HTTPRequest(HTTPMethods.PUT, "/clusters/"+clusterName+"/services/"+serviceName);
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
}
