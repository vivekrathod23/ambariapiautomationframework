package com.hwx.ambariapilib.json.upgrade;

/**
 * Created by vsharma on 11/5/15.
 */
public class UpgradeItemJson {

    private String cluster_host_info;
    private String cluster_name;
    private String command_params;
    private String context;
    private String end_time;
    private int group_id;
    private String host_params;
    private String log_info;
    private String progress_percent;
    private int request_id;
    private boolean skippable;
    private int stage_id;
    private String start_time;
    private String status;
    private String text;

    public String getCluster_host_info() {
        return cluster_host_info;
    }

    public String getCluster_name() {
        return cluster_name;
    }

    public String getCommand_params() {
        return command_params;
    }

    public String getContext() {
        return context;
    }

    public String getEnd_time() {
        return end_time;
    }

    public int getGroup_id() {
        return group_id;
    }

    public String getHost_params() {
        return host_params;
    }

    public String getLog_info() {
        return log_info;
    }

    public String getProgress_percent() {
        return progress_percent;
    }

    public int getRequest_id() {
        return request_id;
    }

    public boolean isSkippable() {
        return skippable;
    }

    public int getStage_id() {
        return stage_id;
    }

    public String getStart_time() {
        return start_time;
    }

    public String getStatus() {
        return status;
    }

    public String getText() {
        return text;
    }
}
