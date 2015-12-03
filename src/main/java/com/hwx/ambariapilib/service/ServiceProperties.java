package com.hwx.ambariapilib.service;

import java.util.HashSet;

/**
 * Created by vrathod on 11/25/15.
 */
public class ServiceProperties {


    private String fileName=null;
    private HashSet<Property> properties = new HashSet<Property>();


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public HashSet<Property> getProperties() {
        return properties;
    }

    public void setProperties(HashSet<Property> properties) {
        this.properties = properties;
    }
}
