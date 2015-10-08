package com.hwx.ambariapilib.json.view;

/**
 * Created by ajain on 10/6/15.
 */
public class ViewShortInstanceJson {
    private String href;
    private ViewInstanceShortInfoJson ViewInstanceInfo;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ViewInstanceShortInfoJson getViewInstanceInfo() {
        return ViewInstanceInfo;
    }

    public void setViewInstanceInfo(ViewInstanceShortInfoJson viewInstanceInfo) {
        ViewInstanceInfo = viewInstanceInfo;
    }
}
