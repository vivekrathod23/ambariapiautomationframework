package com.hwx.ambariapilib.json.host;

/**
 * Created by ajain on 9/28/15.
 */
public class RecoveryReportJson {
    private String summary;
    private ComponentReportsJson[] component_reports;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public ComponentReportsJson[] getComponent_reports() {
        return component_reports;
    }

    public void setComponent_reports(ComponentReportsJson[] component_reports) {
        this.component_reports = component_reports;
    }
}
