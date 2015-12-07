package com.hwx.ambariapilib.json.ConfigProperties;

/**
 * Created by vrathod on 12/6/15.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ZooCfgProperties {

    @SerializedName("autopurge.purgeInterval")
    @Expose
    private String autopurgePurgeInterval;
    @SerializedName("autopurge.snapRetainCount")
    @Expose
    private String autopurgeSnapRetainCount;
    @SerializedName("clientPort")
    @Expose
    private String clientPort;
    @SerializedName("dataDir")
    @Expose
    private String dataDir;
    @SerializedName("initLimit")
    @Expose
    private String initLimit;
    @SerializedName("syncLimit")
    @Expose
    private String syncLimit;
    @SerializedName("tickTime")
    @Expose
    private String tickTime;

    /**
     *
     * @return
     * The autopurgePurgeInterval
     */
    public String getAutopurgePurgeInterval() {
        return autopurgePurgeInterval;
    }

    /**
     *
     * @param autopurgePurgeInterval
     * The autopurge.purgeInterval
     */
    public void setAutopurgePurgeInterval(String autopurgePurgeInterval) {
        this.autopurgePurgeInterval = autopurgePurgeInterval;
    }

    /**
     *
     * @return
     * The autopurgeSnapRetainCount
     */
    public String getAutopurgeSnapRetainCount() {
        return autopurgeSnapRetainCount;
    }

    /**
     *
     * @param autopurgeSnapRetainCount
     * The autopurge.snapRetainCount
     */
    public void setAutopurgeSnapRetainCount(String autopurgeSnapRetainCount) {
        this.autopurgeSnapRetainCount = autopurgeSnapRetainCount;
    }

    /**
     *
     * @return
     * The clientPort
     */
    public String getClientPort() {
        return clientPort;
    }

    /**
     *
     * @param clientPort
     * The clientPort
     */
    public void setClientPort(String clientPort) {
        this.clientPort = clientPort;
    }

    /**
     *
     * @return
     * The dataDir
     */
    public String getDataDir() {
        return dataDir;
    }

    /**
     *
     * @param dataDir
     * The dataDir
     */
    public void setDataDir(String dataDir) {
        this.dataDir = dataDir;
    }

    /**
     *
     * @return
     * The initLimit
     */
    public String getInitLimit() {
        return initLimit;
    }

    /**
     *
     * @param initLimit
     * The initLimit
     */
    public void setInitLimit(String initLimit) {
        this.initLimit = initLimit;
    }

    /**
     *
     * @return
     * The syncLimit
     */
    public String getSyncLimit() {
        return syncLimit;
    }

    /**
     *
     * @param syncLimit
     * The syncLimit
     */
    public void setSyncLimit(String syncLimit) {
        this.syncLimit = syncLimit;
    }

    /**
     *
     * @return
     * The tickTime
     */
    public String getTickTime() {
        return tickTime;
    }

    /**
     *
     * @param tickTime
     * The tickTime
     */
    public void setTickTime(String tickTime) {
        this.tickTime = tickTime;
    }

}
