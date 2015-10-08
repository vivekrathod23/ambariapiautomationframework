package com.hwx.ambariapilib.view;

import com.hwx.ambariapilib.AmbariItems;

import com.hwx.ambariapilib.json.view.ViewLongInstanceJson;
import com.hwx.clientlib.http.HTTPMethods;
import com.hwx.clientlib.http.HTTPRequest;
import com.hwx.clientlib.http.HTTPResponse;

/**
 * Created by ajain on 10/6/15.
 */
public class ViewInstance extends AmbariItems {
    private ViewLongInstanceJson viewLongInstanceJson;

    public ViewInstance(String viewInstanceAPIUrl){
        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, viewInstanceAPIUrl);
        HTTPResponse resp = rc.sendHTTPRequest(req);

        viewLongInstanceJson = gson.fromJson(resp.getBody().getBodyText(), ViewLongInstanceJson.class);
    }

    public ViewLongInstanceJson getViewLongInstanceJson() {
        return viewLongInstanceJson;
    }

    public void setViewLongInstanceJson(ViewLongInstanceJson viewLongInstanceJson) {
        this.viewLongInstanceJson = viewLongInstanceJson;
    }


}
