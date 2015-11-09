package com.hwx.utils.validation;

import com.hwx.clientlib.http.HTTPResponse;

/**
 * Created by ajain on 11/5/15.
 */
public class ValidationUtils {

<<<<<<< HEAD
    public static boolean validateResponseCode(HTTPResponse response, int... responseCodeList){
        for(int responseCode : responseCodeList)
            if(response.getStatusCode() == responseCode)
                return true;

        return false;
    }
}
=======
  public static boolean validateResponseCode(HTTPResponse response, int... responseCodeList){
    for(int responseCode : responseCodeList)
      if(response.getStatusCode() == responseCode)
        return true;

    return false;
  }
}
>>>>>>> e0de1b3248d1d6331373dad7a15a5289a544881a
