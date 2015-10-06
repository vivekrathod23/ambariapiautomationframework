package com.hwx.ambariapilib.json.host;

/**
 * Created by ajain on 9/28/15.
 */
public class HostRolesJson {
    private String cluster_name;
    private String component_name;
    private String host_name;

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

    public String getHost_name() {
        return host_name;
    }

    public void setHost_name(String host_name) {
        this.host_name = host_name;
    }
}
