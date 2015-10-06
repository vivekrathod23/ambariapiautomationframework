package com.hwx.ambariapilib.json.common;

/**
 * Created by ajain on 9/28/15.
 */
public class AlertSummaryJson {
    private int CRITICAL;
    private int MAINTENANCE;
    private int OK;
    private int UNKNOWN;
    private int WARNING;

    public int getCRITICAL() {
        return CRITICAL;
    }

    public void setCRITICAL(int CRITICAL) {
        this.CRITICAL = CRITICAL;
    }

    public int getMAINTENANCE() {
        return MAINTENANCE;
    }

    public void setMAINTENANCE(int MAINTENANCE) {
        this.MAINTENANCE = MAINTENANCE;
    }

    public int getOK() {
        return OK;
    }

    public void setOK(int OK) {
        this.OK = OK;
    }

    public int getUNKNOWN() {
        return UNKNOWN;
    }

    public void setUNKNOWN(int UNKNOWN) {
        this.UNKNOWN = UNKNOWN;
    }

    public int getWARNING() {
        return WARNING;
    }

    public void setWARNING(int WARNING) {
        this.WARNING = WARNING;
    }
}
