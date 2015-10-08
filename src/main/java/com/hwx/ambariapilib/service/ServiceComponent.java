package com.hwx.ambariapilib.service;

import com.hwx.ambariapilib.AmbariItems;
import com.hwx.ambariapilib.json.service.ServiceComponentDetailJson;
import com.hwx.clientlib.http.HTTPMethods;
import com.hwx.clientlib.http.HTTPRequest;
import com.hwx.clientlib.http.HTTPResponse;

/**
 * Created by ajain on 10/7/15.
 */
public class ServiceComponent extends AmbariItems{
    private ServiceComponentDetailJson serviceComponentDetailJson;

    public ServiceComponent(String serviceComponentAPIUrl){

        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, serviceComponentAPIUrl);
        HTTPResponse resp = rc.sendHTTPRequest(req);

        serviceComponentDetailJson = gson.fromJson(resp.getBody().getBodyText(),ServiceComponentDetailJson.class );
    }
}
