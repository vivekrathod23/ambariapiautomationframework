package com.hwx.ambariapilib.json.view;

/**
 * Created by ajain on 10/6/15.
 */
public class ViewShortVersionJson {
    private String href;
    private ViewVersionShortInfoJson ViewVersionInfo;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ViewVersionShortInfoJson getViewVersionInfo() {
        return ViewVersionInfo;
    }

    public void setViewVersionInfo(ViewVersionShortInfoJson viewVersionInfo) {
        ViewVersionInfo = viewVersionInfo;
    }
}
