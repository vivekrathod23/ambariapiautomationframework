package com.hwx.ambariapilib.json;

/**
 * Created by ajain on 10/5/15.
 */
public class ServiceInfoJson {
    private String cluster_name;
    private String maintenance_state;
    private String service_name;
    private String state;

    public String getCluster_name() {
        return cluster_name;
    }

    public void setCluster_name(String cluster_name) {
        this.cluster_name = cluster_name;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
