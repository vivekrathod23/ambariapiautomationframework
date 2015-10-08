package com.hwx.ambariapilib.json.cluster;

/**
 * Created by ajain on 9/30/15.
 */
public class ClusterStackVersionJson {
    private String cluster_name;
    private int id;
    private int repository_version;
    private String stack;
    private String version;

    public String getCluster_name() {
        return cluster_name;
    }

    public void setCluster_name(String cluster_name) {
        this.cluster_name = cluster_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRepository_version() {
        return repository_version;
    }

    public void setRepository_version(int repository_version) {
        this.repository_version = repository_version;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
