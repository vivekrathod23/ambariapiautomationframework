package com.hwx.ambariapilib.json.alert;

/**
 * Created by pankaj.singh on 11/10/15.
 */


import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AlertDefinitionService {

    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("ServiceInfo")
    @Expose
    private com.hwx.ambariapilib.json.alert.ServiceInfo ServiceInfo;
    @SerializedName("alerts_summary")
    @Expose
    private AlertsSummary alertsSummary;
    @SerializedName("alerts")
    @Expose
    private List<Alert> alerts = new ArrayList<Alert>();
    @SerializedName("components")
    @Expose
    private List<Component> components = new ArrayList<Component>();
    @SerializedName("artifacts")
    @Expose
    private List<Object> artifacts = new ArrayList<Object>();

    /**
     *
     * @return
     * The href
     */
    public String getHref() {
        return href;
    }

    /**
     *
     * @param href
     * The href
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     *
     * @return
     * The ServiceInfo
     */
    public com.hwx.ambariapilib.json.alert.ServiceInfo getServiceInfo() {
        return ServiceInfo;
    }

    /**
     *
     * @param ServiceInfo
     * The ServiceInfo
     */
    public void setServiceInfo(com.hwx.ambariapilib.json.alert.ServiceInfo ServiceInfo) {
        this.ServiceInfo = ServiceInfo;
    }

    /**
     *
     * @return
     * The alertsSummary
     */
    public AlertsSummary getAlertsSummary() {
        return alertsSummary;
    }

    /**
     *
     * @param alertsSummary
     * The alerts_summary
     */
    public void setAlertsSummary(AlertsSummary alertsSummary) {
        this.alertsSummary = alertsSummary;
    }

    /**
     *
     * @return
     * The alerts
     */
    public List<Alert> getAlerts() {
        return alerts;
    }

    /**
     *
     * @param alerts
     * The alerts
     */
    public void setAlerts(List<Alert> alerts) {
        this.alerts = alerts;
    }

    /**
     *
     * @return
     * The components
     */
    public List<Component> getComponents() {
        return components;
    }

    /**
     *
     * @param components
     * The components
     */
    public void setComponents(List<Component> components) {
        this.components = components;
    }

    /**
     *
     * @return
     * The artifacts
     */
    public List<Object> getArtifacts() {
        return artifacts;
    }

    /**
     *
     * @param artifacts
     * The artifacts
     */
    public void setArtifacts(List<Object> artifacts) {
        this.artifacts = artifacts;
    }

}

