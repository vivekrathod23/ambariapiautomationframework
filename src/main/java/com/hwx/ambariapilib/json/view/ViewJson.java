package com.hwx.ambariapilib.json.view;

/**
 * Created by ajain on 10/6/15.
 */
public class ViewJson {
    private String href;
    private ViewInfoJson ViewInfo;
    private ViewShortVersionJson[] versions;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ViewInfoJson getViewInfo() {
        return ViewInfo;
    }

    public void setViewInfo(ViewInfoJson viewInfo) {
        ViewInfo = viewInfo;
    }

    public ViewShortVersionJson[] getVersions() {
        return versions;
    }

    public void setVersions(ViewShortVersionJson[] versions) {
        this.versions = versions;
    }
}
