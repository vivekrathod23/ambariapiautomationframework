package com.hwx.ambariapilib.json.cluster;

import com.hwx.ambariapilib.json.alert.AlertDefinitionListJson;
import com.hwx.ambariapilib.json.alert.AlertListJson;
import com.hwx.ambariapilib.json.alert.AlertSummaryJson;
import com.hwx.ambariapilib.json.common.ArtifactJson;
import com.hwx.ambariapilib.json.common.Workflow;
import com.hwx.ambariapilib.json.service.ServiceConfigVersion;

/**
 * Created by ajain on 9/30/15.
 */
public class ClusterJson {
    private String href;
    private ClusterDetailsJson Clusters;
    private AlertSummaryJson alerts_summary;
    private AlertSummaryJson alerts_summary_hosts;
    private AlertListJson[] alerts;
    private PrivilegeJson[] privileges;
    private ConfigGroupJson[] config_groups;
    private ClusterStackVersionListJson[] stack_versions;
    private ClusterHostsListJson[] hosts;
    private ClusterConfigurationListJson[] configurations;
    private ServiceConfigVersion[] service_config_versions;
    private AlertDefinitionListJson[] alert_definitions;
    private ClusterRequestListJson[] requests;
    private Workflow[] workflows;
    private ClusterServiceListJson[] services;
    private ArtifactJson[] artifacts;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ClusterDetailsJson getClusters() {
        return Clusters;
    }

    public void setClusters(ClusterDetailsJson clusters) {
        Clusters = clusters;
    }

    public AlertSummaryJson getAlerts_summary() {
        return alerts_summary;
    }

    public void setAlerts_summary(AlertSummaryJson alerts_summary) {
        this.alerts_summary = alerts_summary;
    }

    public AlertSummaryJson getAlerts_summary_hosts() {
        return alerts_summary_hosts;
    }

    public void setAlerts_summary_hosts(AlertSummaryJson alerts_summary_hosts) {
        this.alerts_summary_hosts = alerts_summary_hosts;
    }

    public AlertListJson[] getAlerts() {
        return alerts;
    }

    public void setAlerts(AlertListJson[] alerts) {
        this.alerts = alerts;
    }

    public PrivilegeJson[] getPrivileges() {
        return privileges;
    }

    public void setPrivileges(PrivilegeJson[] privileges) {
        this.privileges = privileges;
    }

    public ConfigGroupJson[] getConfig_groups() {
        return config_groups;
    }

    public void setConfig_groups(ConfigGroupJson[] config_groups) {
        this.config_groups = config_groups;
    }

    public ClusterStackVersionListJson[] getStack_versions() {
        return stack_versions;
    }

    public void setStack_versions(ClusterStackVersionListJson[] stack_versions) {
        this.stack_versions = stack_versions;
    }

    public ClusterHostsListJson[] getHosts() {
        return hosts;
    }

    public void setHosts(ClusterHostsListJson[] hosts) {
        this.hosts = hosts;
    }

    public ClusterConfigurationListJson[] getConfigurations() {
        return configurations;
    }

    public void setConfigurations(ClusterConfigurationListJson[] configurations) {
        this.configurations = configurations;
    }

    public ServiceConfigVersion[] getService_config_versions() {
        return service_config_versions;
    }

    public void setService_config_versions(ServiceConfigVersion[] service_config_versions) {
        this.service_config_versions = service_config_versions;
    }

    public AlertDefinitionListJson[] getAlert_definitions() {
        return alert_definitions;
    }

    public void setAlert_definitions(AlertDefinitionListJson[] alert_definitions) {
        this.alert_definitions = alert_definitions;
    }

    public ClusterRequestListJson[] getRequests() {
        return requests;
    }

    public void setRequests(ClusterRequestListJson[] requests) {
        this.requests = requests;
    }

    public Workflow[] getWorkflows() {
        return workflows;
    }

    public void setWorkflows(Workflow[] workflows) {
        this.workflows = workflows;
    }

    public ClusterServiceListJson[] getServices() {
        return services;
    }

    public void setServices(ClusterServiceListJson[] services) {
        this.services = services;
    }

    public ArtifactJson[] getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(ArtifactJson[] artifacts) {
        this.artifacts = artifacts;
    }
}
