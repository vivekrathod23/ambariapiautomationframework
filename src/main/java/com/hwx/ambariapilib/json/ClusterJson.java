package com.hwx.ambariapilib.json;

/**
 * Created by ajain on 9/30/15.
 */
public class ClusterJson {
    private String href;
    private Clusters Clusters;
    private AlertSummaryJson alerts_summary;
    private AlertSummaryJson alerts_summary_hosts;
    private AlertsJson[] alerts;
    private Privilege[] privileges;
    private ConfigGroup[] config_groups;
    private StackVersion[] stack_versions;
    private Host[] hosts;
    private Configuration[] configurations;
    private ServiceConfigVersion[] service_config_versions;
    private AlertDefinitions[] alert_definitions;
    private Request[] requests;
    private Workflow[] workflows;
    private Service[] services;
    private ArtifactJson[] artifacts;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public com.hwx.ambariapilib.json.Clusters getClusters() {
        return Clusters;
    }

    public void setClusters(com.hwx.ambariapilib.json.Clusters clusters) {
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

    public AlertsJson[] getAlerts() {
        return alerts;
    }

    public void setAlerts(AlertsJson[] alerts) {
        this.alerts = alerts;
    }

    public Privilege[] getPrivileges() {
        return privileges;
    }

    public void setPrivileges(Privilege[] privileges) {
        this.privileges = privileges;
    }

    public ConfigGroup[] getConfig_groups() {
        return config_groups;
    }

    public void setConfig_groups(ConfigGroup[] config_groups) {
        this.config_groups = config_groups;
    }

    public StackVersion[] getStack_versions() {
        return stack_versions;
    }

    public void setStack_versions(StackVersion[] stack_versions) {
        this.stack_versions = stack_versions;
    }

    public Host[] getHosts() {
        return hosts;
    }

    public void setHosts(Host[] hosts) {
        this.hosts = hosts;
    }

    public Configuration[] getConfigurations() {
        return configurations;
    }

    public void setConfigurations(Configuration[] configurations) {
        this.configurations = configurations;
    }

    public ServiceConfigVersion[] getService_config_versions() {
        return service_config_versions;
    }

    public void setService_config_versions(ServiceConfigVersion[] service_config_versions) {
        this.service_config_versions = service_config_versions;
    }

    public AlertDefinitions[] getAlert_definitions() {
        return alert_definitions;
    }

    public void setAlert_definitions(AlertDefinitions[] alert_definitions) {
        this.alert_definitions = alert_definitions;
    }

    public Request[] getRequests() {
        return requests;
    }

    public void setRequests(Request[] requests) {
        this.requests = requests;
    }

    public Workflow[] getWorkflows() {
        return workflows;
    }

    public void setWorkflows(Workflow[] workflows) {
        this.workflows = workflows;
    }

    public Service[] getServices() {
        return services;
    }

    public void setServices(Service[] services) {
        this.services = services;
    }

    public ArtifactJson[] getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(ArtifactJson[] artifacts) {
        this.artifacts = artifacts;
    }
}
