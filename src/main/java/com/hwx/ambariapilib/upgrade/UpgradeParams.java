package com.hwx.ambariapilib.upgrade;

/**
 * Created by vsharma on 11/10/15.
 */
public class UpgradeParams {

    String stackName, stackVersion, buildNumber, operatingSystem, hdpBaseUrl, hdpUtilsBaseUrl;  // For Register version and Install Packages
    String skipServiceCheckFailure, skipSlaveFailures, skipPrerequisiteChecks, failOnCheckWarnings, skipManualVerification;     // For EU

    public String getStackName() {
        return stackName;
    }

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    public String getStackVersion() {
        return stackVersion;
    }

    public void setStackVersion(String stackVersion) {
        this.stackVersion = stackVersion;
    }

    public String getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getHdpBaseUrl() {
        return hdpBaseUrl;
    }

    public void setHdpBaseUrl(String hdpBaseUrl) {
        this.hdpBaseUrl = hdpBaseUrl;
    }

    public String getHdpUtilsBaseUrl() {
        return hdpUtilsBaseUrl;
    }

    public void setHdpUtilsBaseUrl(String hdpUtilsBaseUrl) {
        this.hdpUtilsBaseUrl = hdpUtilsBaseUrl;
    }

    public String getSkipServiceCheckFailure() {
        return skipServiceCheckFailure;
    }

    public void setSkipServiceCheckFailure(String skipServiceCheckFailure) {
        this.skipServiceCheckFailure = skipServiceCheckFailure;
    }

    public String getSkipSlaveFailures() {
        return skipSlaveFailures;
    }

    public void setSkipSlaveFailures(String skipSlaveFailures) {
        this.skipSlaveFailures = skipSlaveFailures;
    }

    public String getSkipPrerequisiteChecks() {
        return skipPrerequisiteChecks;
    }

    public void setSkipPrerequisiteChecks(String skipPrerequisiteChecks) {
        this.skipPrerequisiteChecks = skipPrerequisiteChecks;
    }

    public String getFailOnCheckWarnings() {
        return failOnCheckWarnings;
    }

    public void setFailOnCheckWarnings(String failOnCheckWarnings) {
        this.failOnCheckWarnings = failOnCheckWarnings;
    }

    public String getSkipManualVerification() {
        return skipManualVerification;
    }

    public void setSkipManualVerification(String skipManualVerification) {
        this.skipManualVerification = skipManualVerification;
    }
}
