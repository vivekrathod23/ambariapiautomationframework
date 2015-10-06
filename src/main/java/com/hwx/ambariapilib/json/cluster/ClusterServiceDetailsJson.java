package com.hwx.ambariapilib.json.cluster;

import com.hwx.ambariapilib.json.common.AlertSummaryJson;
import com.hwx.ambariapilib.json.common.AlertsJson;
import com.hwx.ambariapilib.json.host.ComponentsJson;
import com.hwx.ambariapilib.json.service.ServiceInfoJson;

/**
 * Created by ajain on 10/5/15.
 */
public class ClusterServiceDetailsJson {
    private String href;
    private ServiceInfoJson ServiceInfo;
    private AlertSummaryJson alertSummary;
    private AlertsJson[] alerts;
    private ComponentsJson[] components;
    private ArtifactJson[] artifacts;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ServiceInfoJson getServiceInfo() {
        return ServiceInfo;
    }

    public void setServiceInfo(ServiceInfoJson serviceInfo) {
        ServiceInfo = serviceInfo;
    }

    public AlertSummaryJson getAlertSummary() {
        return alertSummary;
    }

    public void setAlertSummary(AlertSummaryJson alertSummary) {
        this.alertSummary = alertSummary;
    }

    public AlertsJson[] getAlerts() {
        return alerts;
    }

    public void setAlerts(AlertsJson[] alerts) {
        this.alerts = alerts;
    }

    public ComponentsJson[] getComponents() {
        return components;
    }

    public void setComponents(ComponentsJson[] components) {
        this.components = components;
    }

    public ArtifactJson[] getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(ArtifactJson[] artifacts) {
        this.artifacts = artifacts;
    }
}
