package com.hwx.ambariapilib.json.stack;

/**
 * Created by ajain on 10/20/15.
 */
public class ClusterStackVersionDetailJson {
    private String cluster_name;
    private int id;
    private int repository_version;
    private String stack;
    private String state;
    private String version;
    private HostStateJson host_states;

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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public HostStateJson getHost_states() {
        return host_states;
    }

    public void setHost_states(HostStateJson host_states) {
        this.host_states = host_states;
    }
}
