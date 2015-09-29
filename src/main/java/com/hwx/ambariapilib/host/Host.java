package com.hwx.ambariapilib.host;

import com.google.gson.Gson;
import com.hwx.ambariapilib.AmbariItems;
import com.hwx.clientlib.http.HTTPMethods;
import com.hwx.clientlib.http.HTTPRequest;
import com.hwx.clientlib.http.HTTPResponse;

/**
 * Created by ajain on 9/23/15.
 */
public class Host extends AmbariItems{

    private String clusterName;
    private String hostName;

    private HostJson hostJson;

    public Host() {
        super();
    }

    public Host(String clusterName, String hostName){
        this();
        this.clusterName = clusterName;
        this.hostName = hostName;
        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, "/clusters/"+clusterName+"/hosts/"+hostName);
        HTTPResponse resp = rc.sendHTTPRequest(req);

        Gson gson = new Gson();
        hostJson = gson.fromJson(resp.getBody().getBodyText(), HostJson.class);
    }


    public String getHealthStatus(){
        return hostJson.getHosts().getHost_status();
    }

    public String getHealthState(){
        return hostJson.getHosts().getHost_state();
    }
}
