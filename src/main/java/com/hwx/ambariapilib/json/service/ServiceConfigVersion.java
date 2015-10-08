package com.hwx.ambariapilib.json.service;

/**
 * Created by ajain on 9/30/15.
 */
public class ServiceConfigVersion {
    private String href;
    private String cluster_name;
    private long createtime;
    private int group_id;
    private String group_name;
    private boolean is_cluster_compatible;
    private boolean is_current;
    private int service_config_version;
    private String service_config_version_note;
    private String service_name;
    private String stack_id;
    private String user;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getCluster_name() {
        return cluster_name;
    }

    public void setCluster_name(String cluster_name) {
        this.cluster_name = cluster_name;
    }

    public long getCreatetime() {
        return createtime;
    }

    public void setCreatetime(long createtime) {
        this.createtime = createtime;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public boolean is_cluster_compatible() {
        return is_cluster_compatible;
    }

    public void setIs_cluster_compatible(boolean is_cluster_compatible) {
        this.is_cluster_compatible = is_cluster_compatible;
    }

    public boolean is_current() {
        return is_current;
    }

    public void setIs_current(boolean is_current) {
        this.is_current = is_current;
    }

    public int getService_config_version() {
        return service_config_version;
    }

    public void setService_config_version(int service_config_version) {
        this.service_config_version = service_config_version;
    }

    public String getService_config_version_note() {
        return service_config_version_note;
    }

    public void setService_config_version_note(String service_config_version_note) {
        this.service_config_version_note = service_config_version_note;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public String getStack_id() {
        return stack_id;
    }

    public void setStack_id(String stack_id) {
        this.stack_id = stack_id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
