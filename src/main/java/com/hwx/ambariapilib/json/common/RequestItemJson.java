package com.hwx.ambariapilib.json.common;

/**
 * Created by ajain on 10/8/15.
 */
public class RequestItemJson {
    private String href;
    private RequestJson Requests;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public RequestJson getRequests() {
        return Requests;
    }

    public void setRequests(RequestJson requests) {
        Requests = requests;
    }
}
