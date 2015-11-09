package com.hwx.ambariapilib.cluster;
// This class contains code for Cluster functionality

import com.google.gson.Gson;
import com.hwx.ambariapilib.AmbariItems;
import com.hwx.ambariapilib.common.Request;
import com.hwx.ambariapilib.host.Host;
import com.hwx.ambariapilib.json.cluster.ClusterJson;
import com.hwx.ambariapilib.json.common.RequestListJson;
import com.hwx.ambariapilib.json.service.ServiceJson;
import com.hwx.ambariapilib.json.service.ServiceRequestJson;
import com.hwx.ambariapilib.json.stack.StackUpgradeCheckDetailJson;
import com.hwx.ambariapilib.json.stack.StackUpgradeCheckJson;
import com.hwx.ambariapilib.json.stack.StackVersionListJson;
import com.hwx.ambariapilib.json.upgrade.UpgradeRequestJson;
import com.hwx.ambariapilib.json.view.ViewsListJson;
import com.hwx.ambariapilib.service.Service;
import com.hwx.ambariapilib.upgrade.ExpressUpgrade;
import com.hwx.ambariapilib.upgrade.RollingUpgrade;
import com.hwx.ambariapilib.upgrade.StackUpgrade;
import com.hwx.ambariapilib.view.View;
import com.hwx.clientlib.http.HTTPBody;
import com.hwx.clientlib.http.HTTPMethods;
import com.hwx.clientlib.http.HTTPRequest;
import com.hwx.clientlib.http.HTTPResponse;
import com.hwx.utils.FileUtils;
import com.hwx.utils.WaitUtil;
import com.hwx.utils.validation.ValidationUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ajain on 9/23/15.
 */
public class Cluster extends AmbariItems {

    private ClusterJson clusterJson;

    private Cluster() {
        super();
    }

    public Cluster(String clusterAPIUrl){
        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, clusterAPIUrl);
        HTTPResponse resp = rc.sendHTTPRequest(req);

        clusterJson = gson.fromJson(resp.getBody().getBodyText(), ClusterJson.class);
    }

    public StackUpgrade initializeStackUpgrade(String upgradeType) throws Exception {
        if(upgradeType.equalsIgnoreCase("express"))
            return new ExpressUpgrade(clusterJson);
        else if(upgradeType.equalsIgnoreCase("rolling"))
            return new RollingUpgrade(clusterJson);
        else
            throw new Exception("Invalid upgrade type parameter " + upgradeType + " passed. Valid values are express/rolling");

    }


    /* ==================================================================================
                                Getters and Setters Methods
       ================================================================================== */

    public ClusterJson getClusterJson() {
        return clusterJson;
    }

    public void setClusterJson(ClusterJson clusterJson) {
        this.clusterJson = clusterJson;
    }


    /* ==================================================================================
                                Cluster Functionality Methods
       ================================================================================== */

    //Get all the Hosts inside the cluster
    public ArrayList<Host> getHosts(){
        ArrayList<Host> hosts = new ArrayList<Host>();

        int numHosts = clusterJson.getClusters().getTotal_hosts();

        for(int i=0;i<numHosts;i++)
            hosts.add(new Host(clusterJson.getHosts()[i].getHref()));

        return hosts;
    }

    //Get all the services inside the cluster
    public ArrayList<Service> getServices(){
        ArrayList<Service> services = new ArrayList<Service>();

        //Get the count of services in cluster
        int numServices = clusterJson.getServices().length;

        for(int i=0;i<numServices;i++)
            services.add(new Service(clusterJson.getServices()[i].getHref()));

        return services;
    }

    //Get all views
    public ArrayList<View> getViews(){
        ArrayList<View> views = new ArrayList<View>();

        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, "/views");
        HTTPResponse resp = rc.sendHTTPRequest(req);

        ViewsListJson viewJson = gson.fromJson(resp.getBody().getBodyText(), ViewsListJson.class);

        int numViews = viewJson.getItems().length;

        //Iterate for all views
        for(int i=0;i<numViews;i++)
            views.add(new View(viewJson.getItems()[i].getHref()));

        return views;
    }


    //Get all requests inside cluster
    public ArrayList<Request> getRequests(){
        String clusterName = clusterJson.getClusters().getCluster_name();

        ArrayList<Request> requests = new ArrayList<Request>();

        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, "/clusters/"+clusterName+"/requests");
        HTTPResponse resp = rc.sendHTTPRequest(req);

        RequestListJson requestListJson = gson.fromJson(resp.getBody().getBodyText(), RequestListJson.class);

        int numRequests = requestListJson.getItems().length;

        for(int i=0;i<numRequests;i++)
            requests.add(new Request(requestListJson.getItems()[i].getHref()));

        return requests;
    }











    /* ==================================================================================
                                Upgrade Related Functionality
                                          Begin
       ================================================================================== */


    //Register a new version
    public boolean registerNewVersion(String stackName, String stackVersion, String buildNumber, String operatingSystem, String hdpBaseUrl, String hdpUtilsBaseUrl){
        Map<String,String> map = new HashMap<String,String>();
        map.put("{STACKNAME}",stackName);
        map.put("{STACKVERSION}",stackVersion);
        map.put("{BUILDNUMBER}",buildNumber);
        map.put("{OPERATINGSYSTEM}",operatingSystem);
        map.put("{HDPBASEURL}",hdpBaseUrl);
        map.put("{HDPUTILBASEURL}", hdpUtilsBaseUrl);


        String body = FileUtils.getJsonAsString("UpgradeVersion.json",map);
        HTTPRequest req = new HTTPRequest(HTTPMethods.POST, "/stacks/HDP/versions/2.3/repository_versions/");
        req.setBody(new HTTPBody(body));
        HTTPResponse resp = rc.sendHTTPRequest(req);

        if(ValidationUtils.validateResponseCode(resp, 201))
            return true;
        else{
            logger.logError(resp.getBody().getBodyText());
            return false;
        }
    }

    //Get the stack versions inside cluster
    public ArrayList<StackVersion> getStackVersions(){
        ArrayList<StackVersion> stackVersions = new ArrayList<StackVersion>();
        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, clusterJson.getHref()+"/stack_versions");
        HTTPResponse resp = rc.sendHTTPRequest(req);

        StackVersionListJson stackVersionListJson = gson.fromJson(resp.getBody().getBodyText(), StackVersionListJson.class);

        int stackCount = stackVersionListJson.getItems().length;

        for(int i=0;i<stackCount;i++)
            stackVersions.add(new StackVersion(stackVersionListJson.getItems()[i].getHref()));

        return stackVersions;
    }


    //Submit the install package request
    public boolean submitInstallPackageRequest(String stackName, String stackVersion, String buildNumber){
        Map<String,String> map = new HashMap<String,String>();
        map.put("{STACKNAME}",stackName);
        map.put("{STACKVERSION}",stackVersion);
        map.put("{BUILDNUMBER}",buildNumber);

        String body = FileUtils.getJsonAsString("InstallPackageRequest.json", map);
        HTTPRequest req = new HTTPRequest(HTTPMethods.POST, clusterJson.getHref()+"/stack_versions");
        req.setBody(new HTTPBody(body));
        HTTPResponse resp = rc.sendHTTPRequest(req);

        //Response code must be 202 with request id to track the progress.
        if(ValidationUtils.validateResponseCode(resp,202)){
            //Get the request id
            UpgradeRequestJson upgradeRequestJson = gson.fromJson(resp.getBody().getBodyText(), UpgradeRequestJson.class);
            int requestId = upgradeRequestJson.getRequests().getId();

            //Monitor the request status and wait till status is completed
            //ToDo Hack for clustername passing
            WaitUtil.waitForRequestToBeCompleted(clusterJson.getHref(),requestId);
            return true;
        }
        else{
            logger.logError(resp.getBody().getBodyText());
            return false;
        }

    }

    //Monitor the install package request
    public void monitorInstallPackageRequest(int requestId){
       WaitUtil.waitForRequestToBeCompleted(clusterJson.getHref(),requestId);
    }

   //Check the pre-requisite for upgrade
    public  ArrayList<StackUpgradeCheckJson>  checkForPreRequisiteForUpgrade(int repoVersion, String upgradeType){
        ArrayList<StackUpgradeCheckJson> stackUpgradeCheckJsonList = new ArrayList<StackUpgradeCheckJson>();

        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, clusterJson.getHref()+"/rolling_upgrades_check?fields=*&UpgradeChecks/repository_version="+repoVersion+"/&UpgradeChecks/upgrade_type="+upgradeType);
        HTTPResponse resp = rc.sendHTTPRequest(req);

        StackUpgradeCheckDetailJson stackUpgradeCheckDetailJson = gson.fromJson(resp.getBody().getBodyText(), StackUpgradeCheckDetailJson.class);

        int numUpgradeCheck = stackUpgradeCheckDetailJson.getItems().length;

        for(int i=0;i<numUpgradeCheck;i++)
            stackUpgradeCheckJsonList.add(stackUpgradeCheckDetailJson.getItems()[0].getUpgradeChecks());

        return stackUpgradeCheckJsonList;
    }


    //Submit rolling upgrade
    public void submitRollingUpgrade(){
        Map<String,String> map = new HashMap<String,String>();
        String body = FileUtils.getJsonAsString("UpgradeRequest.json",map);
        HTTPRequest req = new HTTPRequest(HTTPMethods.POST, clusterJson.getHref()+"/upgrades");
        req.setBody(new HTTPBody(body));
        HTTPResponse resp = rc.sendHTTPRequest(req);
    }

    //Monitor the rolling upgrade
    public void monitorRollingUpgrade(int upgradeRequestId){
        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, clusterJson.getHref()+"/upgrades/"+upgradeRequestId);
        HTTPResponse resp = rc.sendHTTPRequest(req);
    }

    //Proceed after the manual upgrade
    public void upgradeStepAfterManualVerification(int upgradeRequestId,int upgradeGroupId, int upgradeItemId){
        HTTPRequest req = new HTTPRequest(HTTPMethods.PUT, clusterJson.getHref()+"/upgrades/"+upgradeRequestId+"/upgrade_groups/"+upgradeGroupId+"/upgrade_items/"+upgradeItemId);
        //ToDo Set body
        HTTPResponse resp = rc.sendHTTPRequest(req);
    }





    /* ==================================================================================
                                Upgrade Related Functionality
                                          End
       ================================================================================== */





    //Create a new service inside the cluster
    public HTTPResponse createServices(String serviceName){
        String clusterName = clusterJson.getClusters().getCluster_name();

        HTTPRequest req = new HTTPRequest(HTTPMethods.POST, "/clusters/"+clusterName+"/services/"+serviceName);
        HTTPResponse resp = rc.sendHTTPRequest(req);

        return resp;
    }

    //Add a new host in cluster
    //Host must be registered inside cluster
    public void createHost(String hostName){
        String clusterName = clusterJson.getClusters().getCluster_name();

        HTTPRequest req = new HTTPRequest(HTTPMethods.POST, "/clusters/"+clusterName+"/hosts/"+hostName);
        HTTPResponse resp = rc.sendHTTPRequest(req);
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
        String clusterName = clusterJson.getClusters().getCluster_name();

    	Map<String, String> map = new HashMap<String, String>();
		map.put("{STATUS}", status);
		logger.logDebug("Status: " +status);

		String body = FileUtils.getJsonAsString("ServiceInfo.json", map);
		logger.logInfo("Request body  : " + body);

        HTTPRequest req = new HTTPRequest(HTTPMethods.PUT, "/clusters/"+clusterName+"/services");
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


    //Change the service status
    private void updateServiceStatus(String serviceName, String status) {
        String clusterName = clusterJson.getClusters().getCluster_name();
		Map<String, String> map = new HashMap<String, String>();
		map.put("{SERVICE}", serviceName);
		map.put("{STATUS}", status);
		
		logger.logDebug("Service Name: " +serviceName);
		logger.logDebug("Status: " +status);

		String requestBody = FileUtils.getJsonAsString("Service.json", map);
		logger.logInfo("Request body  : " + requestBody);

		HTTPRequest req = new HTTPRequest(HTTPMethods.PUT, "/clusters/" + clusterName + "/services/" + serviceName);
		req.setBody(new HTTPBody(requestBody));
		HTTPResponse resp = rc.sendHTTPRequest(req);

		Gson gson = new Gson();
		ServiceJson serviceJson = gson.fromJson(resp.getBody().getBodyText(), ServiceJson.class);
		logger.logInfo("Response body : " + resp.getBody().getBodyText());
		String serviceUrl = serviceJson.getHref();
		logger.logInfo("Service URL : " + serviceUrl);

		waitForServiceCompletion(serviceUrl);
    }

    //Wait for service to complete
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

    public String getServiceStatus(String serviceStatusAPIUrl){
        //Generate the GET request to get the status of service
        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, serviceStatusAPIUrl);
        HTTPResponse resp = rc.sendHTTPRequest(req);

        //Extract service status from returned JSON
        Gson gson = new Gson();
        ServiceRequestJson requestJson = gson.fromJson(resp.getBody().getBodyText(), ServiceRequestJson.class);
        String requestStatus = requestJson.getRequests().getRequest_status();

        return requestStatus;
    }



    //ToDo Move to Utils + Add exception
    public void waitForFixedInterval(int waitTime){
        try{
            Thread.sleep(1000*60);
        }
        catch(Exception e){}
    }
}
