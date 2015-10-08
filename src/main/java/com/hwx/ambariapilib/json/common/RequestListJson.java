package com.hwx.ambariapilib.json.common;

/**
 * Created by ajain on 10/8/15.
 */
public class RequestListJson {
    private String href;
    private RequestItemJson[] items;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public RequestItemJson[] getItems() {
        return items;
    }

    public void setItems(RequestItemJson[] items) {
        this.items = items;
    }
}
