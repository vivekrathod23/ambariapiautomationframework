package com.hwx.ambariapilib.json.cluster;

import com.hwx.ambariapilib.json.host.DesiredConfigsJson;
import com.hwx.ambariapilib.json.host.DesiredServiceConfigVersionsJson;
import com.hwx.ambariapilib.json.host.HealthReportJson;

/**
 * Created by ajain on 9/30/15.
 */
public class ClusterDetailsJson {
    private int cluster_id;
    private String cluster_name;
    private HealthReportJson health_report;
    private String provisioning_state;
    private String security_type;
    private int total_hosts;
    private String version;
    private DesiredConfigsJson desired_configs;
    private DesiredServiceConfigVersionsJson desired_service_config_versions;

    public int getCluster_id() {
        return cluster_id;
    }

    public void setCluster_id(int cluster_id) {
        this.cluster_id = cluster_id;
    }

    public String getCluster_name() {
        return cluster_name;
    }

    public void setCluster_name(String cluster_name) {
        this.cluster_name = cluster_name;
    }

    public HealthReportJson getHealth_report() {
        return health_report;
    }

    public void setHealth_report(HealthReportJson health_report) {
        this.health_report = health_report;
    }

    public String getProvisioning_state() {
        return provisioning_state;
    }

    public void setProvisioning_state(String provisioning_state) {
        this.provisioning_state = provisioning_state;
    }

    public String getSecurity_type() {
        return security_type;
    }

    public void setSecurity_type(String security_type) {
        this.security_type = security_type;
    }

    public int getTotal_hosts() {
        return total_hosts;
    }

    public void setTotal_hosts(int total_hosts) {
        this.total_hosts = total_hosts;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public DesiredConfigsJson getDesired_configs() {
        return desired_configs;
    }

    public void setDesired_configs(DesiredConfigsJson desired_configs) {
        this.desired_configs = desired_configs;
    }

    public DesiredServiceConfigVersionsJson getDesired_service_config_versions() {
        return desired_service_config_versions;
    }

    public void setDesired_service_config_versions(DesiredServiceConfigVersionsJson desired_service_config_versions) {
        this.desired_service_config_versions = desired_service_config_versions;
    }
}
