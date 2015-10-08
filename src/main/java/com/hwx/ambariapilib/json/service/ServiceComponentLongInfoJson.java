package com.hwx.ambariapilib.json.service;

/**
 * Created by ajain on 10/7/15.
 */
public class ServiceComponentLongInfoJson {
    private String category;
    private String cluster_name;
    private String component_name;
    private int installed_count;
    private String service_name;
    private int started_count;
    private String state;
    private int total_count;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

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

    public int getInstalled_count() {
        return installed_count;
    }

    public void setInstalled_count(int installed_count) {
        this.installed_count = installed_count;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public int getStarted_count() {
        return started_count;
    }

    public void setStarted_count(int started_count) {
        this.started_count = started_count;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }
}
