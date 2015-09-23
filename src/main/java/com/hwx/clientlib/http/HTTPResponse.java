package com.hwx.clientlib.http;

/**
 * Created by ajain on 9/14/15.
 */

/**
 * Embed the HTTP Response object returned by HTTP Calls
 */

public class HTTPResponse {
    private String protocolVersion;
    private int StatusCode;
    private String ReasonPhrase;
    private HTTPHeader headers;
    private HTTPBody body;

    public HTTPResponse(String body) {
        this.body.setBodyText(body);
    }

    public HTTPBody getBody() {
        return body;
    }

    public void setBody(HTTPBody body) {
        this.body = body;
    }

    public String getProtocolVersion() {
        return protocolVersion;
    }

    public void setProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
    }

    public int getStatusCode() {
        return StatusCode;
    }

    public void setStatusCode(int statusCode) {
        StatusCode = statusCode;
    }

    public String getReasonPhrase() {
        return ReasonPhrase;
    }

    public void setReasonPhrase(String reasonPhrase) {
        ReasonPhrase = reasonPhrase;
    }

    public HTTPHeader getHeaders() {
        return headers;
    }

    public void setHeaders(HTTPHeader headers) {
        this.headers = headers;
    }
}

