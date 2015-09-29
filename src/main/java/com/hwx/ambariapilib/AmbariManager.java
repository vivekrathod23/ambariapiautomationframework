package com.hwx.ambariapilib;

import com.hwx.ambariapilib.cluster.Cluster;
import com.hwx.clientlib.AuthType;
import com.hwx.clientlib.RestAPIClient;
import com.hwx.clientlib.RestAPIClientFactory;
import com.hwx.clientlib.RestAPIClientType;
import com.hwx.clientlib.http.HTTPMethods;
import com.hwx.clientlib.http.HTTPRequest;
import com.hwx.clientlib.http.HTTPResponse;
import com.jayway.restassured.path.json.JsonPath;

import java.util.*;

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
              HTTPRequest req = new HTTPRequest(HTTPMethods.GET, "/clusters");

              HTTPResponse resp = rc.sendHTTPRequest(req);


              //ToDo Parse the Json and create a cluster object

              JsonPath path = new JsonPath(resp.getBody().getBodyText());


              List <String>clusterNameList = path.getList("items.Clusters.cluster_name");
              List<String> versionList =path.getList("items.Clusters.version");

              Cluster cluster = new Cluster(clusterNameList.get(0), versionList.get(0));

              clusters = new Cluster[1];
              clusters[0] = cluster;
       }

       public Cluster[] getClusters() {
              return clusters;
       }

       public void setClusters(Cluster[] clusters) {
              this.clusters = clusters;
       }
}
