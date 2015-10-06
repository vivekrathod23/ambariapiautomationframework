package com.hwx.ambariapilib.json;

import com.hwx.ambariapilib.service.*;

/**
 * Created by ajain on 9/29/15.
 */
public class RequestJson {
    private String href;
    private com.hwx.ambariapilib.service.Request Requests;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public com.hwx.ambariapilib.service.Request getRequests() {
        return Requests;
    }

    public void setRequests(com.hwx.ambariapilib.service.Request requests) {
        Requests = requests;
    }
}
