package com.hwx.ambariapilib.upgrade;

import com.google.gson.Gson;
import com.hwx.ambariapilib.AmbariItems;
import com.hwx.ambariapilib.json.cluster.ClusterJson;
import com.hwx.ambariapilib.json.service.ServiceJson;
import com.hwx.ambariapilib.json.upgrade.*;
import com.hwx.clientlib.http.HTTPBody;
import com.hwx.clientlib.http.HTTPMethods;
import com.hwx.clientlib.http.HTTPRequest;
import com.hwx.clientlib.http.HTTPResponse;
import com.hwx.utils.FileUtils;
import com.hwx.utils.WaitUtil;
import com.hwx.utils.validation.ValidationUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vsharma on 11/5/15.
 */
public class StackUpgrade extends AmbariItems {

    private ClusterJson clusterJson;
    private int lastUpgradeRequestID=-1;

    public enum UPGRADESTATUS {
        COMPLETED,
        PENDING,
        HOLDING,
        HOLDING_FAILED,
        HOLDING_TIMEDOUT,
        SKIPPED_FAILED,
        FAILED
    }

    public int getLastUpgradeRequestID() throws Exception {

        if(lastUpgradeRequestID == -1)
            setLastUpgradeRequestID();

        return lastUpgradeRequestID;
    }


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
            WaitUtil.waitForRequestToBeCompleted(clusterJson.getHref(), requestId);
            return true;
        }
        else{
            logger.logError(resp.getBody().getBodyText());
            return false;
        }

    }

    //Submit rolling upgrade
    public void submitRollingUpgrade(){
        Map<String,String> map = new HashMap<String,String>();
        String body = FileUtils.getJsonAsString("UpgradeRequest.json",map);
        HTTPRequest req = new HTTPRequest(HTTPMethods.POST, clusterJson.getHref()+"/upgrades");
        req.setBody(new HTTPBody(body));
        HTTPResponse resp = rc.sendHTTPRequest(req);
    }


    //Monitor the install package request
    public void monitorInstallPackageRequest(int requestId){
        WaitUtil.waitForRequestToBeCompleted(clusterJson.getHref(),requestId);
    }


    private void setLastUpgradeRequestID() throws Exception {
        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, clusterJson.getHref()+"/upgrades/");
        HTTPResponse resp = rc.sendHTTPRequest(req);

        UpgradeEntryJson upgradeEntryJson = gson.fromJson(resp.getBody().getBodyText(), UpgradeEntryJson.class);
        ItemsJson[] items = upgradeEntryJson.getItems();
        ItemsJson lastUpgradeItem = null;

        if(items.length > 0)
            lastUpgradeItem = items[items.length-1];
        else
            throw new Exception("Unable to retrieve Upgrade Status. The API output indicates that upgrade was not started");

        this.lastUpgradeRequestID = lastUpgradeItem.getUpgrade().getRequest_id();
    }


    public StackUpgrade(ClusterJson clusterJson) {
        this.clusterJson=clusterJson;
    }

    public UpgradeStatusJson getUpgradeStatus(int upgradeRequestId) {
        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, clusterJson.getHref()+"/upgrades/"+upgradeRequestId);
        HTTPResponse resp = rc.sendHTTPRequest(req);

        return gson.fromJson(resp.getBody().getBodyText(), UpgradeStatusJson.class);
    }

    private HTTPResponse getAPIResponse(HTTPMethods operation, String uri) throws Exception {
        HTTPRequest req = new HTTPRequest(operation, uri);
        return rc.sendHTTPRequest(req);

    }

    public UpgradeStatusJson getLastUpgradeStatus() throws Exception {
        //HTTPRequest req = new HTTPRequest(HTTPMethods.GET, clusterJson.getHref()+"/upgrades/"+getLastUpgradeRequestID());
        HTTPResponse resp = getAPIResponse(HTTPMethods.GET, clusterJson.getHref()+"/upgrades/"+getLastUpgradeRequestID());

        return gson.fromJson(resp.getBody().getBodyText(), UpgradeStatusJson.class);
    }

    public void getLastFailedUpgradeItem() throws Exception {
        UpgradeItemsJson upgradeItemsJson = getUpgradeItem(UPGRADESTATUS.FAILED);
        logger.logInfo(upgradeItemsJson.getTasks()[0].getTask().getStatus());
    }

    public void getCompletedUpgradeItem() throws Exception {
        UpgradeItemsJson upgradeItemsJson = getUpgradeItem(UPGRADESTATUS.COMPLETED);
        logger.logInfo(upgradeItemsJson.getTasks()[0].getTask().getStatus());
    }

    private UpgradeItemsJson getUpgradeItem(UPGRADESTATUS type) throws Exception {
        UpgradeStatusJson upgradeStatusJson = getLastUpgradeStatus();
        UpgradeGroupsJson[] upgradeGroupsJson = upgradeStatusJson.getUpgrade_groups();

        if(upgradeGroupsJson.length > 0) {
            for (int i=0; i< upgradeGroupsJson.length ; i++) {

                HTTPResponse resp = getAPIResponse(HTTPMethods.GET,upgradeGroupsJson[i].getHref());
                UpgradeGroupsJson upgradeGroupJson = gson.fromJson(resp.getBody().getBodyText(), UpgradeGroupsJson.class);

                if(upgradeGroupJson.getUpgradeGroup().getStatus().equalsIgnoreCase(UPGRADESTATUS.HOLDING.toString())) {
                    logger.logInfo("Status " + upgradeGroupJson.getUpgradeGroup().getStatus());
                    logger.logInfo("For Upgrade group " + upgradeGroupsJson[i].getHref());

                    UpgradeItemsJson[] upgradeItemsJson = upgradeGroupJson.getUpgrade_items();


                    for (int j=0; j< upgradeItemsJson.length ; j++) {
                        resp = getAPIResponse(HTTPMethods.GET, upgradeItemsJson[j].getHref());
                        UpgradeItemsJson upgradeItemJson = gson.fromJson(resp.getBody().getBodyText(), UpgradeItemsJson.class);

                        if(upgradeItemJson.getUpgradeItem().getStatus().equalsIgnoreCase(type.toString())) {
                            return upgradeItemsJson[j];
                            //lastPendingUpgradeItem = upgradeItemsJson[j].getHref();
                            //logger.logInfo("HOLDING endpoint " + lastPendingUpgradeItem);
//                            logger.logInfo("Status " + upgradeItemJson.getUpgradeItem().getStatus());
//                            logger.logInfo("Context & Text " + upgradeItemJson.getUpgradeItem().getContext() + " " + upgradeItemJson.getUpgradeItem().getText());
//                            logger.logInfo("Task ref " + upgradeItemJson.getTasks()[0].getHref());
                        }

                    }

                }
            }

        }
        return null;
    }

    public String getLastPendingUpgradeItem() throws Exception {

        String lastPendingUpgradeItem="";

        UpgradeStatusJson upgradeStatusJson = getLastUpgradeStatus();
        UpgradeGroupsJson[] upgradeGroupsJson = upgradeStatusJson.getUpgrade_groups();

        if(upgradeGroupsJson.length > 0) {
            for (int i=0; i< upgradeGroupsJson.length ; i++) {

                HTTPResponse resp = getAPIResponse(HTTPMethods.GET,upgradeGroupsJson[i].getHref());
                UpgradeGroupsJson upgradeGroupJson = gson.fromJson(resp.getBody().getBodyText(), UpgradeGroupsJson.class);

                if(upgradeGroupJson.getUpgradeGroup().getStatus().equalsIgnoreCase(UPGRADESTATUS.HOLDING.toString())) {
                    logger.logInfo("Status " + upgradeGroupJson.getUpgradeGroup().getStatus());
                    logger.logInfo("For Upgrade group " + upgradeGroupsJson[i].getHref());

                    UpgradeItemsJson[] upgradeItemsJson = upgradeGroupJson.getUpgrade_items();


                    for (int j=0; j< upgradeItemsJson.length ; j++) {
                        resp = getAPIResponse(HTTPMethods.GET, upgradeItemsJson[j].getHref());
                        UpgradeItemsJson upgradeItemJson = gson.fromJson(resp.getBody().getBodyText(), UpgradeItemsJson.class);

                        if(upgradeItemJson.getUpgradeItem().getStatus().equalsIgnoreCase(UPGRADESTATUS.HOLDING.toString())) {
                            lastPendingUpgradeItem = upgradeItemsJson[j].getHref();
                            logger.logInfo("HOLDING endpoint " + lastPendingUpgradeItem);
//                            logger.logInfo("Status " + upgradeItemJson.getUpgradeItem().getStatus());
//                            logger.logInfo("Context & Text " + upgradeItemJson.getUpgradeItem().getContext() + " " + upgradeItemJson.getUpgradeItem().getText());
//                            logger.logInfo("Task ref " + upgradeItemJson.getTasks()[0].getHref());
                        }

                    }

                }
            }

        }
        else
            throw new Exception("Unable to retrieve Upgrade Status. The API output indicates that upgrade groups information was not gathered");

        return lastPendingUpgradeItem;
    }

    public void proceedUpgradeAfterManualVerification() throws Exception {

        String uri = getLastPendingUpgradeItem();

        Map<String, String> map = new HashMap<String, String>();
        map.put("{STATUS}", "COMPLETED");
        String requestBody = FileUtils.getJsonAsString("HandleManualVerificationDuringUpgrade.json", map);
        logger.logInfo("Request body  : " + requestBody);

        HTTPRequest req = new HTTPRequest(HTTPMethods.PUT, uri);
        req.setBody(new HTTPBody(requestBody));
        HTTPResponse resp = rc.sendHTTPRequest(req);

        System.out.println(resp.getStatusCode());

//        Gson gson = new Gson();
//        ServiceJson serviceJson = gson.fromJson(resp.getBody().getBodyText(), HandleManualVerificationDuringUpgrade.class);
//        logger.logInfo("Response body : " + resp.getBody().getBodyText());
//        String serviceUrl = serviceJson.getHref();
//        logger.logInfo("Service URL : " + serviceUrl);


//        HTTPResponse resp = getAPIResponse(HTTPMethods.PUT,uri);
    }


}
