package com.hwx.ambariapilib.json.upgrade;

/**
 * Created by ajain on 11/5/15.
 */
public class UpgradeRequestJson {
    private String href;
    private UpgradeRequestStatusJson Requests;

    public UpgradeRequestStatusJson getRequests() {
        return Requests;
    }

    public void setRequests(UpgradeRequestStatusJson requests) {
        Requests = requests;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}
