package com.hwx.ambariapilib.service;

import com.hwx.ambariapilib.AmbariItems;
import com.hwx.ambariapilib.json.cluster.ClusterServiceDetailsJson;
import com.hwx.ambariapilib.json.service.ServiceComponentJson;
import com.hwx.clientlib.http.HTTPMethods;
import com.hwx.clientlib.http.HTTPRequest;
import com.hwx.clientlib.http.HTTPResponse;

import java.util.ArrayList;

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

    public ArrayList<ServiceComponent> getServiceComponents(){
        ArrayList<ServiceComponent> serviceComponents = new ArrayList<ServiceComponent>();

        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, clusterServiceDetailsJson.getHref()+"/components");
        HTTPResponse resp = rc.sendHTTPRequest(req);

        ServiceComponentJson serviceComponentsJson = gson.fromJson(resp.getBody().getBodyText(), ServiceComponentJson.class);

        int numComponents = serviceComponentsJson.getGetServiceComponents().length;

        for(int i=0;i<numComponents;i++)
            serviceComponents.add(new ServiceComponent(serviceComponentsJson.getGetServiceComponents()[i].getHref()));

        return serviceComponents;
    }

    //Create a component in the service
    public void createComponent(String components){
        HTTPRequest req = new HTTPRequest(HTTPMethods.POST, clusterServiceDetailsJson.getHref()+"/components/"+components);
        HTTPResponse resp = rc.sendHTTPRequest(req);

        logger.logInfo(resp.getBody().getBodyText());
    }

    //Get service status
    public String getState(){
        return clusterServiceDetailsJson.getServiceInfo().getState();
    }

    //Get service name
    public String getName(){
        return clusterServiceDetailsJson.getServiceInfo().getService_name();
    }

    //Is Service started
    public boolean isStarted(){
        return getState().equals("STARTED");
    }
}
