package com.hwx.ambariapilib.cluster;

import com.hwx.ambariapilib.AmbariItems;
import com.hwx.ambariapilib.json.stack.StackVersionDetailJson;
import com.hwx.clientlib.http.HTTPMethods;
import com.hwx.clientlib.http.HTTPRequest;
import com.hwx.clientlib.http.HTTPResponse;

/**
 * Created by ajain on 10/19/15.
 */
public class StackVersion extends AmbariItems {

    private StackVersionDetailJson stackVersionDetailJson;

    public StackVersion(String stackVersionUrl){
        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, stackVersionUrl);
        HTTPResponse resp = rc.sendHTTPRequest(req);

        stackVersionDetailJson  = gson.fromJson(resp.getBody().getBodyText(), StackVersionDetailJson.class);
    }

    public StackVersionDetailJson getStackVersionDetailJson() {
        return stackVersionDetailJson;
    }

    public void setStackVersionDetailJson(StackVersionDetailJson stackVersionDetailJson) {
        this.stackVersionDetailJson = stackVersionDetailJson;
    }
}
