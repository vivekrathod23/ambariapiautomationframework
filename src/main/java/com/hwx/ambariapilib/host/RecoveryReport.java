package com.hwx.ambariapilib.host;

/**
 * Created by ajain on 9/28/15.
 */
public class RecoveryReport {
    private String summary;
    private ComponentReports[] component_reports;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public ComponentReports[] getComponent_reports() {
        return component_reports;
    }

    public void setComponent_reports(ComponentReports[] component_reports) {
        this.component_reports = component_reports;
    }
}
