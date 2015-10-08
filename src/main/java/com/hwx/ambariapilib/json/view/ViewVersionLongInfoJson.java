package com.hwx.ambariapilib.json.view;

/**
 * Created by ajain on 10/6/15.
 */
public class ViewVersionLongInfoJson {
    private String archive;
    private String build_number;
    private boolean cluster_configurable;
    private String description;
    private String label;
    private String masker_class;
    private String max_ambari_version;
    private String min_ambari_version;
    private ViewParameterJson[] parameters;
    private String status;
    private String status_detail;
    private boolean system;
    private String version;
    private String view_name;

    public String getArchive() {
        return archive;
    }

    public void setArchive(String archive) {
        this.archive = archive;
    }

    public String getBuild_number() {
        return build_number;
    }

    public void setBuild_number(String build_number) {
        this.build_number = build_number;
    }

    public boolean isCluster_configurable() {
        return cluster_configurable;
    }

    public void setCluster_configurable(boolean cluster_configurable) {
        this.cluster_configurable = cluster_configurable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getMasker_class() {
        return masker_class;
    }

    public void setMasker_class(String masker_class) {
        this.masker_class = masker_class;
    }

    public String getMax_ambari_version() {
        return max_ambari_version;
    }

    public void setMax_ambari_version(String max_ambari_version) {
        this.max_ambari_version = max_ambari_version;
    }

    public String getMin_ambari_version() {
        return min_ambari_version;
    }

    public void setMin_ambari_version(String min_ambari_version) {
        this.min_ambari_version = min_ambari_version;
    }

    public ViewParameterJson[] getParameters() {
        return parameters;
    }

    public void setParameters(ViewParameterJson[] parameters) {
        this.parameters = parameters;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus_detail() {
        return status_detail;
    }

    public void setStatus_detail(String status_detail) {
        this.status_detail = status_detail;
    }

    public boolean isSystem() {
        return system;
    }

    public void setSystem(boolean system) {
        this.system = system;
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
