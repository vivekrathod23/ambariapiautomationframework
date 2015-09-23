package com.hwx.clientlib.http;

/**
 * Created by ajain on 9/14/15.
 */
public class HTTPRequest {
    private HTTPMethods method;
    private String url;
    private String protocolVersion = "1.1";

    private HTTPHeader header;
    private HTTPBody body;


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


    public String getProtocolVersion() {
        return protocolVersion;
    }

    public void setProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
    }

    public HTTPHeader getHeader() {
        return header;
    }

    public void setHeader(HTTPHeader header) {
        this.header = header;
    }

    public HTTPBody getBody() {
        return body;
    }

    public void setBody(HTTPBody body) {
        this.body = body;
    }
}
