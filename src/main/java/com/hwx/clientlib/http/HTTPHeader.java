package com.hwx.clientlib.http;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ajain on 9/15/15.
 */
public class HTTPHeader {
    Map<String,String> headers = new HashMap<String,String>();

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public void addHeader(String key,String value){
        headers.put(key,value);
    }

    public String getHeader(String key){
        return headers.get(key);
    }

}
