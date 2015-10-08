package com.hwx.ambariapilib.json.view;

/**
 * Created by ajain on 10/6/15.
 */
public class PermissionInfoJson {
    private int permission_id;
    private String version;
    private String view_name;

    public int getPermission_id() {
        return permission_id;
    }

    public void setPermission_id(int permission_id) {
        this.permission_id = permission_id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getView_name() {
        return view_name;
    }

    public void setView_name(String view_name) {
        this.view_name = view_name;
    }
}
