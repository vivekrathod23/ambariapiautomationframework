package com.hwx.ambariapilib.upgrade;

import com.hwx.ambariapilib.AmbariItems;
import com.hwx.ambariapilib.json.cluster.ClusterJson;
import com.hwx.ambariapilib.json.upgrade.Items;
import com.hwx.ambariapilib.json.upgrade.UpgradeEntryJson;
import com.hwx.ambariapilib.json.upgrade.UpgradeStatusJson;
import com.hwx.clientlib.http.HTTPMethods;
import com.hwx.clientlib.http.HTTPRequest;
import com.hwx.clientlib.http.HTTPResponse;

/**
 * Created by vsharma on 11/5/15.
 */
public class StackUpgrade extends AmbariItems {

    private ClusterJson clusterJson;

    public StackUpgrade(ClusterJson clusterJson) {
        this.clusterJson=clusterJson;
    }

    public UpgradeStatusJson getUpgradeStatus(int upgradeRequestId) {
        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, clusterJson.getHref()+"/upgrades/"+upgradeRequestId);
        HTTPResponse resp = rc.sendHTTPRequest(req);

        return gson.fromJson(resp.getBody().getBodyText(), UpgradeStatusJson.class);
    }

    public UpgradeStatusJson getLastUpgradeStatus() throws Exception {
        HTTPRequest req = new HTTPRequest(HTTPMethods.GET, clusterJson.getHref()+"/upgrades/");
        HTTPResponse resp = rc.sendHTTPRequest(req);

        UpgradeEntryJson upgradeEntryJson = gson.fromJson(resp.getBody().getBodyText(), UpgradeEntryJson.class);
        Items[] items = upgradeEntryJson.getItems();
        Items lastUpgradeItem = null;

        if(items.length > 0)
            lastUpgradeItem = items[items.length-1];
        else
            throw new Exception("Unable to retrieve Upgrade Status. The API output indicates that upgrade was not started");

        req = new HTTPRequest(HTTPMethods.GET, clusterJson.getHref()+"/upgrades/"+lastUpgradeItem.getUpgrade().getRequest_id());
        resp = rc.sendHTTPRequest(req);

        return gson.fromJson(resp.getBody().getBodyText(), UpgradeStatusJson.class);

    }

    public void getLastPendingUpgradeTask() {

    }


}
