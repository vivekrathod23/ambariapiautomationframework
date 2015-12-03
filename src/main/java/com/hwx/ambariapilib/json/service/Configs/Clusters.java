package com.hwx.ambariapilib.json.service.Configs;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.hwx.ambariapilib.json.service.DesiredConfigs;

import javax.annotation.Generated;

/**
 * Created by vrathod on 11/25/15.
 */

@Generated("org.jsonschema2pojo")
public class Clusters {

    @SerializedName("cluster_name")
    @Expose
    private String clusterName;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("desired_configs")
    @Expose
    private DesiredConfigs desiredConfigs;

    /**
     *
     * @return
     * The clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    /**
     *
     * @param clusterName
     * The cluster_name
     */
    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     *
     * @return
     * The version
     */
    public String getVersion() {
        return version;
    }

    /**
     *
     * @param version
     * The version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     *
     * @return
     * The desiredConfigs
     */
    public DesiredConfigs getDesiredConfigs() {
        return desiredConfigs;
    }

    /**
     *
     * @param desiredConfigs
     * The desired_configs
     */
    public void setDesiredConfigs(DesiredConfigs desiredConfigs) {
        this.desiredConfigs = desiredConfigs;
    }

}