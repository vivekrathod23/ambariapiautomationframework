package com.hwx.clientlib;

import com.hwx.clientlib.restassured.RestAssuredClient;

/**
 * Created by ajain on 9/11/15.
 */
public class RestAPIClientFactory {

    public static RestAPIClient getAPIClient(RestAPIClientType clientType){

        switch (clientType){
            //ToDo this should come from enum class
            case RESTASSURED:
                return new RestAssuredClient();
        }

        //ToDo Must throw exception when no valid clientType found
        return null;
    }
}
