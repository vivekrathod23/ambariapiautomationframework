package com.hwx.ambariapilib.json.common;

/**
 * Created by ajain on 9/28/15.
 */
public class AlertJson {
    private String cluster_name;
    private int definition_id;
    private String definition_name;
    private String host_name;
    private int id;
    private String service_name;

    public String getCluster_name() {
        return cluster_name;
    }

    public void setCluster_name(String cluster_name) {
        this.cluster_name = cluster_name;
    }

    public int getDefinition_id() {
        return definition_id;
    }

    public void setDefinition_id(int definition_id) {
        this.definition_id = definition_id;
    }

    public String getDefinition_name() {
        return definition_name;
    }

    public void setDefinition_name(String definition_name) {
        this.definition_name = definition_name;
    }

    public String getHost_name() {
        return host_name;
    }

    public void setHost_name(String host_name) {
        this.host_name = host_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }
}
