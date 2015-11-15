package com.hwx.ambariapilib.json.alert;

/**
 * Created by pankaj.singh on 11/10/15.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ServiceComponentInfo {
    @SerializedName("cluster_name")
    @Expose
    private String clusterName;
    @SerializedName("component_name")
    @Expose
    private String componentName;
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
     * The componentName
     */
    public String getComponentName() {
        return componentName;
    }

    /**
     *
     * @param componentName
     * The component_name
     */
    public void setComponentName(String componentName) {
        this.componentName = componentName;
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
