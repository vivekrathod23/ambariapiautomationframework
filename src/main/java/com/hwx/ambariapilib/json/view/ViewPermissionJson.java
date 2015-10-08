package com.hwx.ambariapilib.json.view;

/**
 * Created by ajain on 10/6/15.
 */
public class ViewPermissionJson {
    private String href;
    private PermissionInfoJson PermissionInfo;

    public PermissionInfoJson getPermissionInfo() {
        return PermissionInfo;
    }

    public void setPermissionInfo(PermissionInfoJson permissionInfo) {
        PermissionInfo = permissionInfo;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}
