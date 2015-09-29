package com.hwx;

import com.hwx.ambariapilib.AmbariManager;
import com.hwx.ambariapilib.host.Host;
import com.hwx.clientlib.AuthType;
import com.hwx.clientlib.RestAPIClient;
import com.hwx.clientlib.RestAPIClientFactory;
import com.hwx.clientlib.RestAPIClientType;
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
//        Validation validation = new Validation("items.Hosts.host_name", hostNames);

//        System.out.println(rc.validateHTTPReponse(req, validation));

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

//    @Test
//    public void hostDemoTest(){
//
//        AmbariManager manager = new AmbariManager();
//
//        System.out.println(manager.getClusters()[0].getClusterName());
////        System.out.println(manager.getClusters()[0].getHosts()[0].getHostState());
////        System.out.println(manager.getClusters()[0].getHosts()[0].getHostStatus());
////        System.out.println(manager.getClusters()[0].getHosts()[1].getHostName());
////        System.out.println(manager.getClusters()[0].getHosts()[2].getHostName());
//    }

    @Test
    public void testCode(){
        AmbariManager ambariManager = new AmbariManager();
        Host[] hosts = ambariManager.getClusters()[0].getHosts();

        System.out.println(hosts[0].getHealthState());
        System.out.println(hosts[0].getHealthStatus());
    }
}
