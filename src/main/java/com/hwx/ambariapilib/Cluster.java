package com.hwx.ambariapilib;

/**
 * Created by ajain on 9/23/15.
 */
public class Cluster {

    private String clusterName;
    private String version;

    public Cluster(String jsonResponse) {
        //ToDo Get the cluster name and version from cluster json

        
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }
}
