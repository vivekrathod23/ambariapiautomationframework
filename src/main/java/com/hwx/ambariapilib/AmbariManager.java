package com.hwx.ambariapilib;

import java.util.List;

import com.hwx.ambariapilib.cluster.Cluster;
import com.hwx.clientlib.AuthType;
import com.hwx.clientlib.RestAPIClient;
import com.hwx.clientlib.RestAPIClientFactory;
import com.hwx.clientlib.RestAPIClientType;
import com.hwx.clientlib.http.HTTPMethods;
import com.hwx.clientlib.http.HTTPRequest;
import com.hwx.clientlib.http.HTTPResponse;
import com.hwx.utils.config.ConfigManager;
import com.hwx.utils.config.ConfigProperties;
import com.hwx.utils.logging.LogManager;
import com.jayway.restassured.path.json.JsonPath;

/**
 * Created by ajain on 9/23/15.
 */
public class AmbariManager {

       private static RestAPIClient rc = RestAPIClientFactory.getAPIClient(RestAPIClientType.RESTASSURED);
       Cluster[] clusters;
       ConfigManager conf = ConfigManager.getInstance();
       LogManager logger = LogManager.getLoggerInstance(AmbariManager.class.getSimpleName());

       public AmbariManager(){

              try {
				rc.setHost(conf.getString(ConfigProperties.HOST.getKey()));
				rc.setPort(conf.getInt(ConfigProperties.PORT.getKey()));
	            rc.setAuth(AuthType.BASIC);
			} catch (Exception e) {
				logger.logError(e.getStackTrace().toString());
			}
              
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
