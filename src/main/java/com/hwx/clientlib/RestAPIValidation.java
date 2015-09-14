package com.hwx.clientlib;

import com.jayway.restassured.response.Response;

import java.util.Map;

import static org.hamcrest.Matchers.hasItems;

/**
 * Created by ajain on 9/11/15.
 */
public class RestAPIValidation {

    /**
     * Validate the response body against the given key value pair
     *
     * @param resp
     * @param validationMap
     * @return
     */
    public boolean Validate(Response resp, Map<String, String[]> validationMap){
        boolean result = true;


        for(Map.Entry<String, String[]> entry: validationMap.entrySet())
                    resp.then().body(entry.getKey(), hasItems(entry.getValue())) ;

        System.out.println("Response :" + resp.asString());

        return result;
    }
}
