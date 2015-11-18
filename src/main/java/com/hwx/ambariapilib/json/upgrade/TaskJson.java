package com.hwx.ambariapilib.json.upgrade;

/**
 * Created by vsharma on 11/5/15.
 */
public class TaskJson {
    private int attempt_cnt;
    private String cluster_name;
    private String command;
    private String command_detail;
    private String custom_command_name;
    private String end_time;
    private String error_log;
    private int exit_code;
    private String host_name;
    private int id;
    private String output_log;
    private int request_id;
    private String role;
    private int stage_id;
    private String start_time;
    private String status;
    private String stderr;
    private String stdout;
    // private String structured_out;

    public int getAttempt_cnt() {
        return attempt_cnt;
    }

    public String getCluster_name() {
        return cluster_name;
    }

    public String getCommand() {
        return command;
    }

    public String getCommand_detail() {
        return command_detail;
    }

    public String getCustom_command_name() {
        return custom_command_name;
    }

    public String getEnd_time() {
        return end_time;
    }

    public String getError_log() {
        return error_log;
    }

    public int getExit_code() {
        return exit_code;
    }

    public String getHost_name() {
        return host_name;
    }

    public int getId() {
        return id;
    }

    public String getOutput_log() {
        return output_log;
    }

    public int getRequest_id() {
        return request_id;
    }

    public String getRole() {
        return role;
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

    public String getStderr() {
        return stderr;
    }

    public String getStdout() {
        return stdout;
    }

    // public String getStructured_out() {
       // return structured_out;
    //}
}
