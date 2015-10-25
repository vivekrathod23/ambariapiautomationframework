package com.hwx.ambariapilib.json.common;

/**
 * Created by ajain on 10/21/15.
 */
public class RequestStageJson {
    private String cluster_name;
    private int request_id;
    private int stage_id;

    public String getCluster_name() {
        return cluster_name;
    }

    public void setCluster_name(String cluster_name) {
        this.cluster_name = cluster_name;
    }

    public int getRequest_id() {
        return request_id;
    }

    public void setRequest_id(int request_id) {
        this.request_id = request_id;
    }

    public int getStage_id() {
        return stage_id;
    }

    public void setStage_id(int stage_id) {
        this.stage_id = stage_id;
    }
}
