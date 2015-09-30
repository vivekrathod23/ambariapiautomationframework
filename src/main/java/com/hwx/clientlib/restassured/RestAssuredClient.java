package com.hwx.clientlib.restassured;



import static com.jayway.restassured.RestAssured.basic;
import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.post;
import static com.jayway.restassured.RestAssured.put;
import static org.hamcrest.Matchers.hasItems;

import java.util.Map;

import com.hwx.clientlib.AuthType;
import com.hwx.clientlib.RestAPIClient;
import com.hwx.clientlib.Validation;
import com.hwx.clientlib.http.HTTPRequest;
import com.hwx.clientlib.http.HTTPResponse;
import com.hwx.utils.config.ConfigManager;
import com.hwx.utils.config.ConfigProperties;
import com.hwx.utils.logging.AmbariLogger;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;


/**
 * Created by ajain on 9/11/15.
 */

/**
 * This is REST API client implementation using Rest Assured Framework
 */
public class RestAssuredClient extends RestAPIClient {
	
    public ConfigManager conf = ConfigManager.getInstance();
    public AmbariLogger logger = AmbariLogger.getAmbariLoggerInstance(RestAssuredClient.class.getSimpleName());
	
	private String ambariAdminUserName ="";
	private String ambariAdminPassword= "";
	
    public RestAssuredClient(){
        super();
        try {
			 ambariAdminUserName = conf.getString(ConfigProperties.AMBARI_ADMIN_USER.getKey());
			 ambariAdminPassword = conf.getString(ConfigProperties.AMBARI_ADMIN_PASSWORD.getKey());
		} catch (Exception e) {
			e.printStackTrace();
		}
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
                RestAssured.authentication = basic(ambariAdminUserName, ambariAdminPassword);
                //ToDo can we remove this?
                setSpec(given().auth().preemptive().basic(ambariAdminUserName, ambariAdminPassword).when());
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
     * Sends the HTTP GET request to server
     * @param req
     * @return HTTPResponse
     */
    //ToDo call proper get method
    public HTTPResponse doGet(HTTPRequest req){
        return doGet(req.getUrl());
    }


    /**
     * Sends the HTTP POST request to server
     * @param path
     * @return HTTPResponse
     */
    public HTTPResponse doPost(String path){
        return toHTTPResponse(sendPostRequest(path));
    }

    /**
     * Sends the HTTP POST request to server
     * @param req
     * @return
     */
    public HTTPResponse doPost(HTTPRequest req){
        return doPost(req.getUrl());
    }

    /**
     * Sends the HTTP PUT request to server
     * @param req
     * @return
     */

    private Response sendPutRequest(String path){
        String urlPath;


        //Create the complete path if given relative path or else use the complete path
        if(path.startsWith("/")) {
            setRelativePath(path);
            urlPath = getURLString();
        }
        else
            urlPath = path;

        System.out.println("Sending PUT Request : " + urlPath);

        if(getSpec()==null)
            return put(urlPath);
        else
            return getSpec().header("X-Requested-By", "ambari").put(urlPath);
    }

    /**
     * Sends the HTTP PUT request to server
     * @param req
     * @return
     */

    private Response sendPutRequest(String path,String bodyText){
    	
        String urlPath;

        //Create the complete path if given relative path or else use the complete path
        if(path.startsWith("/")) {
            setRelativePath(path);
            urlPath = getURLString();
        }
        else
            urlPath = path;
        	logger.logInfo("Request path : " +urlPath);

        if(getSpec()==null)
            return given().body(bodyText).put(urlPath);
        else {
            Response resp = getSpec().header("X-Requested-By", "ambari").body(bodyText).put(urlPath);
            logger.logInfo("Response body : " +resp.getBody().asString());
            setSpec(given().auth().preemptive().basic(ambariAdminUserName, ambariAdminPassword).when());
            return resp;
        }
    }

    /**
     * Sends the HTTP PUT request to server
     * @param req
     * @return
     */

    public HTTPResponse doPut(HTTPRequest req){
        if(req.getBody().getBodyText().length() > 0)
            return doPut(req.getUrl(), req.getBody().getBodyText());
        else
            return doPut(req.getUrl());
    }

    /**
     * Sends the HTTP PUT request to server
     * @param req
     * @return
     */

    public HTTPResponse doPut(String url){
        return toHTTPResponse(sendPutRequest(url));
    }

    /**
     * Sends the HTTP PUT request to server
     * @param req
     * @return
     */

    public HTTPResponse doPut(String url,String bodyText){
        return toHTTPResponse(sendPutRequest(url,bodyText));
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
            case POST:
                return doPost(req);
            case PUT:
                return doPut(req);
        }

        //ToDo Must throw exception
        return null;
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

    private Response sendPostRequest(String path){
        String urlPath;

        //Create the complete path if given relative path or else use the complete path
        if(path.startsWith("/")) {
            setRelativePath(path);
            urlPath = getURLString();
        }
        else
            urlPath = path;

        if(getSpec()==null)
            return post(urlPath);
        else
            return getSpec().header("X-Requested-By","ambari").post(urlPath);
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

//        System.out.println("Get Request : "+urlPath);

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
//        System.out.println("Response : "+resp.body().asString());
        return new HTTPResponse(resp.body().asString());
    }
}
