package com.hwx.ambariapilib.json.view;

/**
 * Created by ajain on 10/6/15.
 */
public class ViewInstanceLongInfoJson {
    private String cluster_handle;
    private String context_path;
    private String description;
    private String icon64_path;
    private String icon_path;
    private String instance_name;
    private String label;
    private String version;
    private String view_name;
    private boolean visible;
    private ViewInstanceDataJson instance_data;
    private ViewProperties properties;
    private ViewPrivilege[] privileges;
    private ViewResource[] resources;

    public String getCluster_handle() {
        return cluster_handle;
    }

    public void setCluster_handle(String cluster_handle) {
        this.cluster_handle = cluster_handle;
    }

    public String getContext_path() {
        return context_path;
    }

    public void setContext_path(String context_path) {
        this.context_path = context_path;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon64_path() {
        return icon64_path;
    }

    public void setIcon64_path(String icon64_path) {
        this.icon64_path = icon64_path;
    }

    public String getIcon_path() {
        return icon_path;
    }

    public void setIcon_path(String icon_path) {
        this.icon_path = icon_path;
    }

    public String getInstance_name() {
        return instance_name;
    }

    public void setInstance_name(String instance_name) {
        this.instance_name = instance_name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
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

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public ViewInstanceDataJson getInstance_data() {
        return instance_data;
    }

    public void setInstance_data(ViewInstanceDataJson instance_data) {
        this.instance_data = instance_data;
    }

    public ViewProperties getProperties() {
        return properties;
    }

    public void setProperties(ViewProperties properties) {
        this.properties = properties;
    }

    public ViewPrivilege[] getPrivileges() {
        return privileges;
    }

    public void setPrivileges(ViewPrivilege[] privileges) {
        this.privileges = privileges;
    }

    public ViewResource[] getResources() {
        return resources;
    }

    public void setResources(ViewResource[] resources) {
        this.resources = resources;
    }
}
