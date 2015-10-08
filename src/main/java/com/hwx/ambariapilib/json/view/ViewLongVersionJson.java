package com.hwx.ambariapilib.json.view;

/**
 * Created by ajain on 10/6/15.
 */
public class ViewLongVersionJson {
    private String href;
    private ViewVersionLongInfoJson ViewVersionInfo;
    private ViewShortInstanceJson[] instances;
    private ViewPermissionJson[] permissions;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ViewVersionLongInfoJson getViewVersionInfo() {
        return ViewVersionInfo;
    }

    public void setViewVersionInfo(ViewVersionLongInfoJson viewVersionInfo) {
        ViewVersionInfo = viewVersionInfo;
    }

    public ViewShortInstanceJson[] getInstances() {
        return instances;
    }

    public void setInstances(ViewShortInstanceJson[] instances) {
        this.instances = instances;
    }

    public ViewPermissionJson[] getPermissions() {
        return permissions;
    }

    public void setPermissions(ViewPermissionJson[] permissions) {
        this.permissions = permissions;
    }
}
