package com.hwx.ambariapilib.json.service;

/**
 * Created by ajain on 10/5/15.
 */
public class ServiceComponentInfoJson {
    private String cluster_name;
    private String component_name;
    private String service_name;


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

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }
}
