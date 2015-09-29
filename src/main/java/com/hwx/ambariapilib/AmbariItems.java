package com.hwx.ambariapilib;

import com.hwx.clientlib.AuthType;
import com.hwx.clientlib.RestAPIClient;
import com.hwx.clientlib.RestAPIClientFactory;
import com.hwx.clientlib.RestAPIClientType;

/**
 * Created by ajain on 9/28/15.
 */
public abstract class AmbariItems {

    protected static RestAPIClient rc = RestAPIClientFactory.getAPIClient(RestAPIClientType.RESTASSURED);

    public AmbariItems() {
        //ToDo Read from config
        rc.setHost("c6401.ambari.apache.org");
        rc.setPort(8080);
        rc.setAuth(AuthType.BASIC);
    }
}
