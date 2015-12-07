package com.hwx.ambariapilib.service;

import java.util.HashMap;

/**
 * Created by vrathod on 11/25/15.
 */
public class ServiceProperties {


    private String fileName=null;
    private HashMap<String,Property> properties = new HashMap<String, Property>();


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public HashMap<String, Property> getProperties() {
        return properties;
    }

    public void setProperties(HashMap<String, Property> properties) {
        this.properties = properties;
    }
}
