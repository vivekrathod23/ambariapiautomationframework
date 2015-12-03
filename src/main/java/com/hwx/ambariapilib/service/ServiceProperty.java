package com.hwx.ambariapilib.service;

/**
 * Created by vrathod on 11/25/15.
 */

public class ServiceProperty {
    private String propertyName;
    private String propertyValue;
    private String propertyFileName;
    private String propertyFileLocation;
    private String oldPropertyValue;

    public String getOldPropertyValue() {
        return this.oldPropertyValue;
    }

    public void setOldPropertyValue(String oldPropertyValue) {
        this.oldPropertyValue = oldPropertyValue;
    }

    public String getPropertyName() {
        return this.propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyFileName() {
        return this.propertyFileName;
    }

    public void setPropertyFileName(String propertyFileName) {
        this.propertyFileName = propertyFileName;
    }

    public String getPropertyValue() {
        return this.propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    public String getPropertyFileLocation() {
        return this.propertyFileLocation;
    }

    public void setPropertyFileLocation(String propertyFileLocation) {
        this.propertyFileLocation = propertyFileLocation;
    }
}