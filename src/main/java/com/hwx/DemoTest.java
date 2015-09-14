package com.hwx;

import com.hwx.clientlib.*;
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


        String[] hostNames = new String[] {"c6401.ambari.apache.com","c64020.ambari.apache.com","c6403.ambari.apache.com"};

        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, "/hosts");
        Validation validation = new Validation("items.Hosts.host_name", hostNames);

        System.out.println(rc.validateHTTPReponse(req, validation));

    }
}
