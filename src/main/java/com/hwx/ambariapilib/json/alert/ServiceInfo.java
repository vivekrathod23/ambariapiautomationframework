package com.hwx.ambariapilib.json.alert;

/**
 * Created by pankaj.singh on 11/10/15.
 */
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")

public class ServiceInfo {
    @SerializedName("cluster_name")
    @Expose
    private String clusterName;
    @SerializedName("maintenance_state")
    @Expose
    private String maintenanceState;
    @SerializedName("service_name")
    @Expose
    private String serviceName;
    @SerializedName("state")
    @Expose
    private String state;

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
}
