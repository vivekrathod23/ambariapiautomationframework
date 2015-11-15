package com.hwx.ambariapilib.json.alert;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by pankaj.singh on 11/13/15.
 *
 */
public class AlertList {
    @SerializedName("cluster_name")
    @Expose
    private String clusterName;
    @SerializedName("definition_id")
    @Expose
    private int definitionId;
    @SerializedName("definition_name")
    @Expose
    private String definitionName;
    @SerializedName("host_name")
    @Expose
    private String hostName;
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("service_name")
    @Expose
    private String serviceName;
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
     * The definitionId
     */
    public int getDefinitionId() {
        return definitionId;
    }

    /**
     *
     * @param definitionId
     * The definition_id
     */
    public void setDefinitionId(int definitionId) {
        this.definitionId = definitionId;
    }

    /**
     *
     * @return
     * The definitionName
     */
    public String getDefinitionName() {
        return definitionName;
    }

    /**
     *
     * @param definitionName
     * The definition_name
     */
    public void setDefinitionName(String definitionName) {
        this.definitionName = definitionName;
    }

    /**
     *
     * @return
     * The hostName
     */
    public String getHostName() {
        return hostName;
    }

    /**
     *
     * @param hostName
     * The host_name
     */
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    /**
     *
     * @return
     * The id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     *
     * @param serviceName
     * The service_name
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

}
