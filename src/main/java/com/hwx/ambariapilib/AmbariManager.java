package com.hwx.ambariapilib;

import com.hwx.clientlib.AuthType;
import com.hwx.clientlib.RestAPIClient;
import com.hwx.clientlib.RestAPIClientFactory;
import com.hwx.clientlib.RestAPIClientType;
import com.hwx.clientlib.http.HTTPMethods;
import com.hwx.clientlib.http.HTTPRequest;
import com.hwx.clientlib.http.HTTPResponse;

/**
 * Created by ajain on 9/23/15.
 */
public class AmbariManager {

       private static RestAPIClient rc = RestAPIClientFactory.getAPIClient(RestAPIClientType.RESTASSURED);
       Cluster[] clusters;

       public AmbariManager(){
              //ToDo Read from config
              rc.setHost("c6401.ambari.apache.org");
              rc.setPort(8080);
              rc.setAuth(AuthType.BASIC);
       }

       public Cluster[] getClusters() {
              HTTPRequest req = new HTTPRequest(HTTPMethods.GET, "/clusters");
              HTTPResponse res = rc.sendHTTPRequest(req);
              System.out.println(res.getBody().getBodyText());

              return clusters;
       }

       public void setClusters(Cluster[] clusters) {
              this.clusters = clusters;
       }
}
