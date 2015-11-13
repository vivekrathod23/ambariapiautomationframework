package com.hwx.ambariapilib.service;

import com.hwx.ambariapilib.AmbariItems;
import com.hwx.ambariapilib.json.alert.AlertDefinitionService;
import com.hwx.ambariapilib.json.alert.AlertDetails;
import com.hwx.ambariapilib.json.alert.AlertsSummary;
import com.hwx.ambariapilib.json.alert.Alert;
import com.hwx.clientlib.http.HTTPMethods;
import com.hwx.clientlib.http.HTTPRequest;
import com.hwx.clientlib.http.HTTPResponse;
import jersey.repackaged.com.google.common.collect.ImmutableMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by pankaj.singh on 11/10/15.
 */
public class ServiceAlerts extends AmbariItems {
    private AlertDefinitionService AlertDefObj = null;
    private String serviceAlertURL = null;
    public static HashMap<String,String> alertsHrefStatus = new HashMap<String, String>();
    public static final String ALERT_OK = "OK";
    public static final String ALERT_CRITICAL = "CRITICAL";
    public static final String ALERT_UNKNOWN = "UNKNOWN";
    public static final String ALERT_WARNING = "WARNING";
    public ServiceAlerts(String serviceAlertURL){

        this.serviceAlertURL=serviceAlertURL;
        this.initialize();
    }


    public void initialize(){

        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, serviceAlertURL);
        HTTPResponse resp = rc.sendHTTPRequest(req);
        AlertDefObj = gson.fromJson(resp.getBody().getBodyText(), AlertDefinitionService.class);
        for (Alert elem : AlertDefObj.getAlerts()){
            AlertDetails AlertDetailsObj = null;
            String href = elem.getHref();

            HTTPRequest req1 = new HTTPRequest(HTTPMethods.GET, href);
            HTTPResponse resp1 = rc.sendHTTPRequest(req1);

            AlertDetailsObj = gson.fromJson(resp1.getBody().getBodyText(),AlertDetails.class);
            if (AlertDetailsObj.getAlert().getState().equalsIgnoreCase(ALERT_OK)){
                alertsHrefStatus.put(href,ALERT_OK);
            } else if(AlertDetailsObj.getAlert().getState().equalsIgnoreCase(ALERT_CRITICAL)){
                alertsHrefStatus.put(href,ALERT_CRITICAL);
            } else if(AlertDetailsObj.getAlert().getState().equalsIgnoreCase(ALERT_UNKNOWN)){
                alertsHrefStatus.put(href,ALERT_UNKNOWN);
            } else if(AlertDetailsObj.getAlert().getState().equalsIgnoreCase(ALERT_WARNING)){
                alertsHrefStatus.put(href,ALERT_WARNING);
            }
        }
    }

    public AlertsSummary getAlertsSummary() {
        return AlertDefObj.getAlertsSummary();
    }

    public int getOkAlertsCount() { return AlertDefObj.getAlertsSummary().getOK();}

    public int getCriticalAlertsCount(){
        return AlertDefObj.getAlertsSummary().getMAINTENANCE();
    }

    public int getUnknownAlertsCount(){
        return AlertDefObj.getAlertsSummary().getUNKNOWN();
    }

    public int getWarningAlertsCount(){
        return AlertDefObj.getAlertsSummary().getWARNING();
    }

    public ArrayList<String> getOkAlerts(){
        return getSpecificAlerts(ALERT_OK);

    }
    public ArrayList<String> getCriticalAlerts(){
        return getSpecificAlerts(ALERT_CRITICAL);
    }
    public ArrayList<String> getUnknownAlerts(){
        return getSpecificAlerts(ALERT_UNKNOWN);
    }
    public ArrayList<String> getWarningAlerts(){
        return getSpecificAlerts(ALERT_WARNING);
    }

    private ArrayList<String> getSpecificAlerts(String alertType){
        ArrayList<String> alerts = new ArrayList<String>();
        for (Map.Entry<String, String> entry : alertsHrefStatus.entrySet())
        {
            if (alertType == entry.getValue()) {
                alerts.add(entry.getKey());
            }
        }
        return alerts;
    }
}