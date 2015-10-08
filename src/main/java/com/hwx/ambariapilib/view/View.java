package com.hwx.ambariapilib.view;

import com.hwx.ambariapilib.AmbariItems;
import com.hwx.ambariapilib.json.view.ViewJson;
import com.hwx.clientlib.http.HTTPMethods;
import com.hwx.clientlib.http.HTTPRequest;
import com.hwx.clientlib.http.HTTPResponse;

import java.util.ArrayList;

/**
 * Created by ajain on 10/6/15.
 */
public class View extends AmbariItems {

    private ViewJson viewJson = null;


    public View(String viewAPIUrl){
        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, viewAPIUrl);
        HTTPResponse resp = rc.sendHTTPRequest(req);

        viewJson = gson.fromJson(resp.getBody().getBodyText(), ViewJson.class);
    }

    public ViewJson getViewJson() {
        return viewJson;
    }

    public void setViewJson(ViewJson viewJson) {
        this.viewJson = viewJson;
    }

    public ArrayList<ViewVersion> getViewVersions(){
        ArrayList<ViewVersion> viewVersions = new ArrayList<ViewVersion>();
        int numVersions = viewJson.getVersions().length;

        for(int i=0;i<numVersions;i++)
            viewVersions.add(new ViewVersion(viewJson.getVersions()[i].getHref()));

            return viewVersions;
    }

}
