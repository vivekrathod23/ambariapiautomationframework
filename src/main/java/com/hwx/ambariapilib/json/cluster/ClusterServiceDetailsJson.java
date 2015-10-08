package com.hwx.ambariapilib.json.cluster;

import com.hwx.ambariapilib.json.alert.AlertSummaryJson;
import com.hwx.ambariapilib.json.alert.AlertListJson;
import com.hwx.ambariapilib.json.common.ArtifactJson;
import com.hwx.ambariapilib.json.host.ComponentsJson;
import com.hwx.ambariapilib.json.service.ServiceInfoJson;

/**
 * Created by ajain on 10/5/15.
 */
public class ClusterServiceDetailsJson {
    private String href;
    private ServiceInfoJson ServiceInfo;
    private AlertSummaryJson alertSummary;
    private AlertListJson[] alerts;
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

    public AlertListJson[] getAlerts() {
        return alerts;
    }

    public void setAlerts(AlertListJson[] alerts) {
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
