package com.hwx.ambariapilib.json.alert;

/**
 * Created by pankaj.singh on 11/10/15.
 */
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class AlertsSummary {

    @SerializedName("CRITICAL")
    @Expose
    private int CRITICAL;
    @SerializedName("MAINTENANCE")
    @Expose
    private int MAINTENANCE;
    @SerializedName("OK")
    @Expose
    private int OK;
    @SerializedName("UNKNOWN")
    @Expose
    private int UNKNOWN;
    @SerializedName("WARNING")
    @Expose
    private int WARNING;

    /**
     *
     * @return
     * The CRITICAL
     */
    public long getCRITICAL() {
        return CRITICAL;
    }

    /**
     *
     * @param CRITICAL
     * The CRITICAL
     */
    public void setCRITICAL(int CRITICAL) {
        this.CRITICAL = CRITICAL;
    }

    /**
     *
     * @return
     * The MAINTENANCE
     */
    public int getMAINTENANCE() {
        return MAINTENANCE;
    }

    /**
     *
     * @param MAINTENANCE
     * The MAINTENANCE
     */
    public void setMAINTENANCE(int MAINTENANCE) {
        this.MAINTENANCE = MAINTENANCE;
    }

    /**
     *
     * @return
     * The OK
     */
    public int getOK() {
        return OK;
    }

    /**
     *
     * @param OK
     * The OK
     */
    public void setOK(int OK) {
        this.OK = OK;
    }

    /**
     *
     * @return
     * The UNKNOWN
     */
    public int getUNKNOWN() {
        return UNKNOWN;
    }

    /**
     *
     * @param UNKNOWN
     * The UNKNOWN
     */
    public void setUNKNOWN(int UNKNOWN) {
        this.UNKNOWN = UNKNOWN;
    }

    /**
     *
     * @return
     * The WARNING
     */
    public int getWARNING() {
        return WARNING;
    }

    /**
     *
     * @param WARNING
     * The WARNING
     */
    public void setWARNING(int WARNING) {
        this.WARNING = WARNING;
    }

}