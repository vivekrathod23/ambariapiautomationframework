package com.hwx.ambariapilib.view;

import com.hwx.ambariapilib.AmbariItems;
import com.hwx.ambariapilib.json.view.ViewLongVersionJson;
import com.hwx.clientlib.http.HTTPMethods;
import com.hwx.clientlib.http.HTTPRequest;
import com.hwx.clientlib.http.HTTPResponse;

import java.util.ArrayList;

/**
 * Created by ajain on 10/6/15.
 */
public class ViewVersion extends AmbariItems{

    private ViewLongVersionJson viewVersionJson = null;

    public ViewVersion(String viewVersionAPIUrl){
        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, viewVersionAPIUrl);
        HTTPResponse resp = rc.sendHTTPRequest(req);

        viewVersionJson = gson.fromJson(resp.getBody().getBodyText(), ViewLongVersionJson.class);

    }

    public ArrayList<ViewInstance> getViewInstances(){
        ArrayList<ViewInstance> viewInstances = new ArrayList<ViewInstance>();

        int viewInstancesCount = viewVersionJson.getInstances().length;

        for(int i=0;i<viewInstancesCount;i++)
            viewInstances.add(new ViewInstance(viewVersionJson.getInstances()[i].getHref()));

        return viewInstances;
    }

    public ViewLongVersionJson getViewVersionJson() {
        return viewVersionJson;
    }

    public void setViewVersionJson(ViewLongVersionJson viewVersionJson) {
        this.viewVersionJson = viewVersionJson;
    }

    //Create a new instance
    public void createInstance(String instanceName){
        HTTPRequest req = new HTTPRequest(HTTPMethods.POST, viewVersionJson.getHref()+"/instances/"+instanceName);
        HTTPResponse resp = rc.sendHTTPRequest(req);
    }

    //Delete an instance
    public void deleteInstance(String instanceName){
        HTTPRequest req = new HTTPRequest(HTTPMethods.DELETE, viewVersionJson.getHref()+"/instances/"+instanceName);
        HTTPResponse resp = rc.sendHTTPRequest(req);
    }
}
