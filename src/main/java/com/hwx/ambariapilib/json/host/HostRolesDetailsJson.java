package com.hwx.ambariapilib.json.host;

/**
 * Created by ajain on 10/8/15.
 */
public class HostRolesDetailsJson {
    private String cluster_name;
    private String component_name;
    private String desired_admin_state;
    private String desired_stack_id;
    private String desired_state;
    private String hdp_version;
    private String host_name;
    private String maintenance_state;
    private String service_name;
    private String stack_id;
    private boolean stale_configs;
    private String state;
    private String upgrade_state;
    private HostConfiguration actual_configs;

    public String getCluster_name() {
        return cluster_name;
    }

    public void setCluster_name(String cluster_name) {
        this.cluster_name = cluster_name;
    }

    public String getComponent_name() {
        return component_name;
    }

    public void setComponent_name(String component_name) {
        this.component_name = component_name;
    }

    public String getDesired_admin_state() {
        return desired_admin_state;
    }

    public void setDesired_admin_state(String desired_admin_state) {
        this.desired_admin_state = desired_admin_state;
    }

    public String getDesired_stack_id() {
        return desired_stack_id;
    }

    public void setDesired_stack_id(String desired_stack_id) {
        this.desired_stack_id = desired_stack_id;
    }

    public String getDesired_state() {
        return desired_state;
    }

    public void setDesired_state(String desired_state) {
        this.desired_state = desired_state;
    }

    public String getHdp_version() {
        return hdp_version;
    }

    public void setHdp_version(String hdp_version) {
        this.hdp_version = hdp_version;
    }

    public String getHost_name() {
        return host_name;
    }

    public void setHost_name(String host_name) {
        this.host_name = host_name;
    }

    public String getMaintenance_state() {
        return maintenance_state;
    }

    public void setMaintenance_state(String maintenance_state) {
        this.maintenance_state = maintenance_state;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public String getStack_id() {
        return stack_id;
    }

    public void setStack_id(String stack_id) {
        this.stack_id = stack_id;
    }

    public boolean isStale_configs() {
        return stale_configs;
    }

    public void setStale_configs(boolean stale_configs) {
        this.stale_configs = stale_configs;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUpgrade_state() {
        return upgrade_state;
    }

    public void setUpgrade_state(String upgrade_state) {
        this.upgrade_state = upgrade_state;
    }

    public HostConfiguration getActual_configs() {
        return actual_configs;
    }

    public void setActual_configs(HostConfiguration actual_configs) {
        this.actual_configs = actual_configs;
    }
}
