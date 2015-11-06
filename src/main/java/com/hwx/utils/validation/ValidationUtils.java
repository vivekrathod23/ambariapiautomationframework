package com.hwx.utils.validation;

import com.hwx.clientlib.http.HTTPResponse;

/**
 * Created by ajain on 11/5/15.
 */
public class ValidationUtils {

    public static boolean validateResponseCode(HTTPResponse response, int... responseCodeList){
        for(int responseCode : responseCodeList)
            if(response.getStatusCode() == responseCode)
                return true;

        return false;
    }
}
