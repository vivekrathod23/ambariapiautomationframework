package com.hwx.clientlib;

/**
 * Created by ajain on 9/11/15.
 */

//ToDo this need to be removed. This is specific to Rest Assured
import com.hwx.clientlib.http.HTTPRequest;
import com.hwx.clientlib.http.HTTPResponse;
import com.jayway.restassured.specification.RequestSpecification;

/**
 * This interface define all methods that must be supported by the REST API Client Implementations.
 *
 * Any REST client implementation will inherit this interface
 */
public abstract class  RestAPIClient {

    private String protocol = "http";
    private String host="localhost";
    private int port=80;
    private String path="/api/v1";
    private String relativePath="/";
    private RequestSpecification spec= null;


    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getRelativePath() {
        return relativePath;
    }

    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath;
    }

    public RequestSpecification getSpec() {
        return spec;
    }

    public void setSpec(RequestSpecification spec) {
        this.spec = spec;
    }


    /**
     * Set the authentication
     */
    public abstract void  setAuth(AuthType authType);

    /**
     * Sends the HTTP GET request to server.
     */

    public abstract HTTPResponse doGet();

    /**
     * Sends the HTTP GET request to server.
     */

    public abstract HTTPResponse doGet(String path);

    /**
     * Send the HTTP Post request to server.
     */

    public abstract HTTPResponse doPost(String path);

    /**
     * Send the HTTP request to server
     */

    public abstract HTTPResponse sendHTTPRequest(HTTPRequest req);

    /**
     * Validate the part in HTTP Response after sending it to server
     */

    public abstract boolean validateHTTPReponse(HTTPRequest req, Validation validation);

}
