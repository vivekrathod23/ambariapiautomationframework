package com.hwx.clientlib.restassured;



import com.hwx.clientlib.AuthType;
import com.hwx.clientlib.RestAPIClient;
import com.hwx.clientlib.Validation;
import com.hwx.clientlib.http.HTTPMethods;
import com.hwx.clientlib.http.HTTPRequest;
import com.hwx.clientlib.http.HTTPResponse;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import java.util.Map;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasItems;


/**
 * Created by ajain on 9/11/15.
 */

/**
 * This is REST API client implementation using Rest Assured Framework
 */
public class RestAssuredClient extends RestAPIClient {

    public RestAssuredClient(){
        super();

        RestAssured.registerParser("text/plain", com.jayway.restassured.parsing.Parser.JSON);
    }

    public RestAssuredClient(String protocol,String host,int port){
        setProtocol(protocol);
        setHost(host);
        setPort(port);
    }

    public RestAssuredClient(String protocol,String host,int port,String path){
        this(protocol, host, port);
        setPath(path);
    }

    /**
     * Returns the Base URL
     *
     * @return Base URL as string
     */
    public String getURLString(){
       return getProtocol()+"://"+getHost()+":"+getPort()+getPath()+getRelativePath();
    }

    /**
     * Get the authentication done based on the auth type
     */
    public void setAuth(AuthType authType){

        switch(authType){
            case BASIC:
                RestAssured.authentication = basic("admin", "admin");
                //ToDo can we remove this?
                setSpec(given().auth().preemptive().basic("admin", "admin").when());
        }
    }

    /**
     * Sends the HTTP GET request to server.
     * Default GET request to Base URL
     */
    public HTTPResponse doGet(){
        return toHTTPResponse(sendGetRequest());
    }

    /**
     * Sends the HTTP GET request to server.
     * Default GET request to Base URL
     */
    public HTTPResponse doGet(String path){
        return toHTTPResponse(sendGetRequest(path));
    }

    /**
     * Send the HTTP Request to server.
     *
     * @param method
     * @param req
     * @return HTTPResponse
     */
    public HTTPResponse sendHTTPRequest(HTTPRequest req){
        switch (req.getMethod()){
            case GET:
                return doGet(req);
        }

        //ToDo Must throw exception
        return null;
    }

    /**
     * Sends the HTTP GET request to server
     * @param req
     * @return HTTPResponse
     */
    //ToDo call proper get method
    public HTTPResponse doGet(HTTPRequest req){
        return doGet();
    }

    /**
     * Validate the HTTP Response against the validation object.
     * @param method
     * @param req
     * @param validation
     * @return
     */
    //ToDo complete the method
    public boolean validateHTTPReponse(HTTPRequest req, Validation validation){
        Response httpResponse = null;

        switch (req.getMethod()){
            case GET:
                httpResponse = sendGetRequest(req.getUrl());
//                System.out.println(httpResponse.asString());
        }

        //ToDo Fill validation part
        //Validate here
        Map<String, String[]> allValidations = validation.getValidationMap();
        //Test each validation
        boolean result = true;


        for(String validationKey : allValidations.keySet()){
           try {
               httpResponse.then().body(validationKey, hasItems(allValidations.get(validationKey)));
           }
           catch(Exception e) {
               System.out.println("Error "+e.getMessage());
               return false;    //In case any of validation fails
           }
        }
        return true;
    }

    /**
     * Method to send default GET request
     * @return Response object from Rest Assured
     */
    private Response sendGetRequest(){
        return sendGetRequest("/");
    }

    private Response sendGetRequest(String path){
        String urlPath;

        //Create the complete path if given relative path or else use the complete path
        if(path.startsWith("/")) {
            setRelativePath(path);
            urlPath = getURLString();
        }
        else
            urlPath = path;

        if(getSpec()==null)
            return get(urlPath);
        else
            return getSpec().get(urlPath);
    }

    /**
     * Convert Rest Assured HTTPResponse to com.hwx.clientlib.http.HTTPResponse
     * @param resp
     * @return com.hwx.clientlib.http.HTTPResponse
     */
    private HTTPResponse toHTTPResponse(Response resp){
        return new HTTPResponse(resp.body().toString());
    }
}
