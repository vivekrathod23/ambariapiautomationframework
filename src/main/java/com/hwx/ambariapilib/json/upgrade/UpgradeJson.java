package com.hwx.ambariapilib.json.upgrade;

/**
 * Created by vsharma on 11/5/15.
 */
public class UpgradeJson {

    private String cluster_name;
    private String create_time;
    private String direction;
    private boolean downgrade_allowed;
    private String end_time;
    private boolean exclusive;
    private String from_version;
    private String pack;
    private String progress_percent;
    private String request_context;
    private int request_id;
    private String request_status;
    private boolean skip_failures;
    private boolean skip_service_check_failures;
    private String start_time;
    private String to_version;
    private String type;
    private String upgrade_type;

    public String getCluster_name() {
        return cluster_name;
    }

    public void setCluster_name(String cluster_name) {
        this.cluster_name = cluster_name;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public boolean isDowngrade_allowed() {
        return downgrade_allowed;
    }

    public void setDowngrade_allowed(boolean downgrade_allowed) {
        this.downgrade_allowed = downgrade_allowed;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public boolean isExclusive() {
        return exclusive;
    }

    public void setExclusive(boolean exclusive) {
        this.exclusive = exclusive;
    }

    public String getFrom_version() {
        return from_version;
    }

    public void setFrom_version(String from_version) {
        this.from_version = from_version;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public String getProgress_percent() {
        return progress_percent;
    }

    public void setProgress_percent(String progress_percent) {
        this.progress_percent = progress_percent;
    }

    public String getRequest_context() {
        return request_context;
    }

    public void setRequest_context(String request_context) {
        this.request_context = request_context;
    }

    public int getRequest_id() {
        return request_id;
    }

    public void setRequest_id(int request_id) {
        this.request_id = request_id;
    }

    public String getRequest_status() {
        return request_status;
    }

    public void setRequest_status(String request_status) {
        this.request_status = request_status;
    }

    public boolean isSkip_failures() {
        return skip_failures;
    }

    public void setSkip_failures(boolean skip_failures) {
        this.skip_failures = skip_failures;
    }

    public boolean isSkip_service_check_failures() {
        return skip_service_check_failures;
    }

    public void setSkip_service_check_failures(boolean skip_service_check_failures) {
        this.skip_service_check_failures = skip_service_check_failures;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getTo_version() {
        return to_version;
    }

    public void setTo_version(String to_version) {
        this.to_version = to_version;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUpgrade_type() {
        return upgrade_type;
    }

    public void setUpgrade_type(String upgrade_type) {
        this.upgrade_type = upgrade_type;
    }
}
