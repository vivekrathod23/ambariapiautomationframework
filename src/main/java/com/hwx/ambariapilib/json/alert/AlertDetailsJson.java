package com.hwx.ambariapilib.json.alert;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Created by pankaj.singh on 11/9/15.
 */


public class AlertDetailsJson {

    @SerializedName("cluster_name")
    @Expose
    private String clusterName;
    @SerializedName("component_name")
    @Expose
    private Object componentName;
    @SerializedName("definition_id")
    @Expose
    private int definitionId;
    @SerializedName("definition_name")
    @Expose
    private String definitionName;
    @SerializedName("host_name")
    @Expose
    private Object hostName;
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("instance")
    @Expose
    private Object instance;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("latest_timestamp")
    @Expose
    private long latestTimestamp;
    @SerializedName("maintenance_state")
    @Expose
    private String maintenanceState;
    @SerializedName("original_timestamp")
    @Expose
    private long originalTimestamp;
    @SerializedName("scope")
    @Expose
    private String scope;
    @SerializedName("service_name")
    @Expose
    private String serviceName;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("text")
    @Expose
    private String text;

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
     * The componentName
     */
    public Object getComponentName() {
        return componentName;
    }

    /**
     *
     * @param componentName
     * The component_name
     */
    public void setComponentName(Object componentName) {
        this.componentName = componentName;
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
    public Object getHostName() {
        return hostName;
    }

    /**
     *
     * @param hostName
     * The host_name
     */
    public void setHostName(Object hostName) {
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
     * The instance
     */
    public Object getInstance() {
        return instance;
    }

    /**
     *
     * @param instance
     * The instance
     */
    public void setInstance(Object instance) {
        this.instance = instance;
    }

    /**
     *
     * @return
     * The label
     */
    public String getLabel() {
        return label;
    }

    /**
     *
     * @param label
     * The label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     *
     * @return
     * The latestTimestamp
     */
    public long getLatestTimestamp() {
        return latestTimestamp;
    }

    /**
     *
     * @param latestTimestamp
     * The latest_timestamp
     */
    public void setLatestTimestamp(long latestTimestamp) {
        this.latestTimestamp = latestTimestamp;
    }

    /**
     *
     * @return
     * The maintenanceState
     */
    public String getMaintenanceState() {
        return maintenanceState;
    }

    /**
     *
     * @param maintenanceState
     * The maintenance_state
     */
    public void setMaintenanceState(String maintenanceState) {
        this.maintenanceState = maintenanceState;
    }

    /**
     *
     * @return
     * The originalTimestamp
     */
    public long getOriginalTimestamp() {
        return originalTimestamp;
    }

    /**
     *
     * @param originalTimestamp
     * The original_timestamp
     */
    public void setOriginalTimestamp(long originalTimestamp) {
        this.originalTimestamp = originalTimestamp;
    }

    /**
     *
     * @return
     * The scope
     */
    public String getScope() {
        return scope;
    }

    /**
     *
     * @param scope
     * The scope
     */
    public void setScope(String scope) {
        this.scope = scope;
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

    /**
     *
     * @return
     * The state
     */
    public String getState() {
        return state;
    }

    /**
     *
     * @param state
     * The state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     *
     * @return
     * The text
     */
    public String getText() {
        return text;
    }

    /**
     *
     * @param text
     * The text
     */
    public void setText(String text) {
        this.text = text;
    }

}