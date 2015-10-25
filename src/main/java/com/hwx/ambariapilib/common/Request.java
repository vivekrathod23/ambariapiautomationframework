package com.hwx.ambariapilib.common;

import com.hwx.ambariapilib.AmbariItems;
import com.hwx.ambariapilib.json.common.RequestDetailJson;
import com.hwx.clientlib.http.HTTPMethods;
import com.hwx.clientlib.http.HTTPRequest;
import com.hwx.clientlib.http.HTTPResponse;

/**
 * Created by ajain on 10/8/15.
 */
public class Request extends AmbariItems{
    RequestDetailJson requestDetailJson;

    public Request(String requestAPIUrl){
        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, requestAPIUrl);
        HTTPResponse resp = rc.sendHTTPRequest(req);

        requestDetailJson = gson.fromJson(resp.getBody().getBodyText(), RequestDetailJson.class);
    }

    public RequestDetailJson getRequestDetailJson() {
        return requestDetailJson;
    }

    public void setRequestDetailJson(RequestDetailJson requestDetailJson) {
        this.requestDetailJson = requestDetailJson;
    }
}
