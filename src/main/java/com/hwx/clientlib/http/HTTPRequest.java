package com.hwx.clientlib.http;

/**
 * Created by ajain on 9/14/15.
 */
public class HTTPRequest {
    HTTPMethods method;
    String url;

    //ToDo Add parameters also for GET and POST


    public HTTPRequest( HTTPMethods method,String url) {
        this.url = url;
        this.method = method;
    }

    public HTTPMethods getMethod() {
        return method;
    }

    public void setMethod(HTTPMethods method) {
        this.method = method;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
