package com.hwx.ambariapilib.host;

import com.hwx.ambariapilib.AmbariItems;
import com.hwx.ambariapilib.json.host.HostComponentDetailsJson;
import com.hwx.clientlib.http.HTTPMethods;
import com.hwx.clientlib.http.HTTPRequest;
import com.hwx.clientlib.http.HTTPResponse;

/**
 * Created by ajain on 10/8/15.
 */
public class HostComponent extends AmbariItems{

    private HostComponentDetailsJson hostComponentDetailsJson = null;

    public HostComponent(String hostComponentAPIUrl){
        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, hostComponentAPIUrl);
        HTTPResponse resp = rc.sendHTTPRequest(req);

        hostComponentDetailsJson = gson.fromJson(resp.getBody().getBodyText(), HostComponentDetailsJson.class);
    }

    /* ==================================================================================
                                Getters and Setters Methods
       ================================================================================== */

    public HostComponentDetailsJson getHostComponentDetailsJson() {
        return hostComponentDetailsJson;
    }

    public void setHostComponentDetailsJson(HostComponentDetailsJson hostComponentDetailsJson) {
        this.hostComponentDetailsJson = hostComponentDetailsJson;
    }

    //Get the host state
    public String getState(){
        return hostComponentDetailsJson.getHostRoles().getState();
    }

    //Get the host state
    public String getUpgradeState(){
        return hostComponentDetailsJson.getHostRoles().getUpgrade_state();
    }

    //Get the host state
    public String getName(){
        return hostComponentDetailsJson.getHostRoles().getComponent_name();
    }
}
