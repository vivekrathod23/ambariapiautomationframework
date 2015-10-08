package com.hwx.ambariapilib;

import com.google.gson.Gson;
import com.hwx.ambariapilib.cluster.Cluster;
import com.hwx.ambariapilib.json.cluster.ClusterListJson;
import com.hwx.clientlib.AuthType;
import com.hwx.clientlib.RestAPIClient;
import com.hwx.clientlib.RestAPIClientFactory;
import com.hwx.clientlib.RestAPIClientType;
import com.hwx.clientlib.http.HTTPBody;
import com.hwx.clientlib.http.HTTPMethods;
import com.hwx.clientlib.http.HTTPRequest;
import com.hwx.clientlib.http.HTTPResponse;
import com.hwx.utils.config.ConfigManager;
import com.hwx.utils.config.ConfigProperties;
import com.hwx.utils.logging.LogManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ajain on 9/23/15.
 *
 * AmbariManager is the starting point to use the framework.
 *
 * Contains the function to create cluster and get information related to cluster.
 */


public class AmbariManager {

    private static RestAPIClient rc = RestAPIClientFactory.getAPIClient(RestAPIClientType.RESTASSURED);
    ConfigManager conf = ConfigManager.getInstance();
    LogManager logger = LogManager.getLoggerInstance(AmbariManager.class.getSimpleName());
    Gson gson = new Gson();

    List<Cluster> clusters = new ArrayList<Cluster>();           //List of all clusters

    private ClusterListJson clusterListJson = null;

    public AmbariManager(){
        setConfig();
        fetchAllClusters();
    }


    /* ==================================================================================
                                Getters and Setters Methods
       ================================================================================== */

    public List<Cluster> getClusters() {
              return clusters;
       }

    public void setClusters(List<Cluster> clusters) {
              this.clusters = clusters;
       }

    public ClusterListJson getClusterListJson() {
        return clusterListJson;
    }

    public void setClusterListJson(ClusterListJson clusterListJson) {
        this.clusterListJson = clusterListJson;
    }


/* ==================================================================================
                                Cluster Functionality Methods
       ================================================================================== */

    //Create the cluster
    // ToDo Code not working. Fix it

    public void createCluster(String clusterName){
        HTTPRequest req = new HTTPRequest(HTTPMethods.POST, "/clusters/"+clusterName);
        req.setBody(new HTTPBody("{ \"Clusters\": {\"version\" : \"HDP-2.3.0”}}"));
        HTTPResponse resp = rc.sendHTTPRequest(req);

        logger.logInfo("Cluster" + resp.getBody().getBodyText());
    }


    /* ==================================================================================
                                    Private Methods
       ================================================================================== */

    private void setConfig(){
        try {
            rc.setHost(conf.getString(ConfigProperties.HOST.getKey()));
            rc.setPort(conf.getInt(ConfigProperties.PORT.getKey()));
            rc.setAuth(AuthType.BASIC);
        } catch (Exception e) {
            logger.logError(e.getStackTrace().toString());
        }
    }

    private void fetchAllClusters(){
        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, "/clusters");
        HTTPResponse resp = rc.sendHTTPRequest(req);

        clusterListJson = gson.fromJson(resp.getBody().getBodyText(), ClusterListJson.class);

        int numClusters = clusterListJson.getItems().length;

        for(int i=0;i<numClusters;i++)
            clusters.add(new Cluster(clusterListJson.getItems()[i].getHref()));
    }
}

