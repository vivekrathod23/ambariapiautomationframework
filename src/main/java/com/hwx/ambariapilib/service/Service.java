package com.hwx.ambariapilib.service;

import com.hwx.ambariapilib.AmbariItems;
import com.hwx.ambariapilib.json.ClusterServiceDetailsJson;
import com.hwx.clientlib.http.HTTPMethods;
import com.hwx.clientlib.http.HTTPRequest;
import com.hwx.clientlib.http.HTTPResponse;

/**
 * Created by ajain on 10/5/15.
 */
public class Service extends AmbariItems {

    private ClusterServiceDetailsJson clusterServiceDetailsJson;

    public Service(String serviceAPIUrl){
        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, serviceAPIUrl);
        HTTPResponse resp = rc.sendHTTPRequest(req);

        clusterServiceDetailsJson = gson.fromJson(resp.getBody().getBodyText(), ClusterServiceDetailsJson.class);
    }

    public ClusterServiceDetailsJson getClusterServiceDetailsJson() {
        return clusterServiceDetailsJson;
    }

    public void setClusterServiceDetailsJson(ClusterServiceDetailsJson clusterServiceDetailsJson) {
        this.clusterServiceDetailsJson = clusterServiceDetailsJson;
    }
}
