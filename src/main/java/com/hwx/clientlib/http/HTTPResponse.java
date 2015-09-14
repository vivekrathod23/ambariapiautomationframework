package com.hwx.clientlib.http;

/**
 * Created by ajain on 9/14/15.
 */

/**
 * Embed the HTTP Response object returned by HTTP Calls
 */

public class HTTPResponse {
    private String body;

    public HTTPResponse(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
