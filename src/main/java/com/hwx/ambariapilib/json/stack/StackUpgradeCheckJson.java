package com.hwx.ambariapilib.json.stack;

/**
 * Created by ajain on 10/21/15.
 */
public class StackUpgradeCheckJson {
    private String check;
    private String check_type;
    private String cluster_name;
    private String[] failed_detail;
    private String[] failed_on;
    private String id;
    private String reason;
    private String repository_version;
    private String status;


    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    public String getCheck_type() {
        return check_type;
    }

    public void setCheck_type(String check_type) {
        this.check_type = check_type;
    }

    public String getCluster_name() {
        return cluster_name;
    }

    public void setCluster_name(String cluster_name) {
        this.cluster_name = cluster_name;
    }

    public String[] getFailed_detail() {
        return failed_detail;
    }

    public void setFailed_detail(String[] failed_detail) {
        this.failed_detail = failed_detail;
    }

    public String[] getFailed_on() {
        return failed_on;
    }

    public void setFailed_on(String[] failed_on) {
        this.failed_on = failed_on;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getRepository_version() {
        return repository_version;
    }

    public void setRepository_version(String repository_version) {
        this.repository_version = repository_version;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
