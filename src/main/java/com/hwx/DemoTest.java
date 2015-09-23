package com.hwx;

import com.hwx.clientlib.*;
import com.hwx.clientlib.http.HTTPHeader;
import com.hwx.clientlib.http.HTTPMethods;
import com.hwx.clientlib.http.HTTPRequest;
import org.testng.annotations.Test;

/**
 * Created by ajain on 9/11/15.
 */
public class DemoTest {

    @Test
    public void testAPI(){
        RestAPIClient rc = RestAPIClientFactory.getAPIClient(RestAPIClientType.RESTASSURED);

        rc.setHost("c6401.ambari.apache.org");
        rc.setPort(8080);
;

        rc.setAuth(AuthType.BASIC);


        String[] hostNames = new String[] {"c6401.ambari.apache.com","c6402.ambari.apache.com","c6403.ambari.apache.com"};

        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, "/hosts");
        Validation validation = new Validation("items.Hosts.host_name", hostNames);

        System.out.println(rc.validateHTTPReponse(req, validation));

    }

    @Test
    public void testPostAPI(){
        RestAPIClient rc = RestAPIClientFactory.getAPIClient(RestAPIClientType.RESTASSURED);

        rc.setHost("c6401.ambari.apache.org");
        rc.setPort(8080);


        rc.setAuth(AuthType.BASIC);



        HTTPRequest req = new HTTPRequest(HTTPMethods.POST, "/clusters/anoop/services/HDFS");
        HTTPHeader header = new HTTPHeader();
        header.addHeader("X-Requested-By","ambari");
        req.setHeader(header);


        System.out.println(rc.sendHTTPRequest(req).getBody().getBodyText());

    }
}
