package com.hwx.ambariapilib;

import com.hwx.ambariapilib.host.Host;
import com.hwx.clientlib.http.HTTPMethods;
import com.hwx.clientlib.http.HTTPRequest;
import com.hwx.clientlib.http.HTTPResponse;
import com.jayway.restassured.path.json.JsonPath;

import java.util.List;

/**
 * Created by ajain on 9/23/15.
 */
public class Cluster extends AmbariItems {

    private String clusterName;
    private String version;
    private Host[] hosts;

    private Cluster() {
        super();
    }

    public Cluster(String clusterName , String version) {
        this();
        this.clusterName = clusterName;
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public Host[] getHosts(){
        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, "/clusters/"+clusterName);
        HTTPResponse resp = rc.sendHTTPRequest(req);

        //ToDo Add cluster related classes
        JsonPath path = new JsonPath(resp.getBody().getBodyText());
        List<String> hostNameList = path.getList("hosts.Hosts.host_name");

        hosts = new Host[hostNameList.size()];

        for(int i=0;i<hostNameList.size();i++)
            hosts[i] = new Host(clusterName,hostNameList.get(i));

        return hosts;
    }
}
