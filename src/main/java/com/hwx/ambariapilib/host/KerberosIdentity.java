package com.hwx.ambariapilib.host;

/**
 * Created by ajain on 9/28/15.
 */
public class KerberosIdentity {
    private String cluster_name;
    private String host_name;
    private String principal_name;

    public String getCluster_name() {
        return cluster_name;
    }

    public void setCluster_name(String cluster_name) {
        this.cluster_name = cluster_name;
    }

    public String getHost_name() {
        return host_name;
    }

    public void setHost_name(String host_name) {
        this.host_name = host_name;
    }

    public String getPrincipal_name() {
        return principal_name;
    }

    public void setPrincipal_name(String principal_name) {
        this.principal_name = principal_name;
    }
}
