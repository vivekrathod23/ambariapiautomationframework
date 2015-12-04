package com.hwx.ambariapilib.json.ConfigProperties;

/**
 * Created by vrathod on 11/30/15.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class CoreSiteConfig {

    @SerializedName("cluster_name")
    @Expose
    private String clusterName;
    @SerializedName("stack_id")
    @Expose
    private String stackId;

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
     * The stackId
     */
    public String getStackId() {
        return stackId;
    }

    /**
     *
     * @param stackId
     * The stack_id
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }


}