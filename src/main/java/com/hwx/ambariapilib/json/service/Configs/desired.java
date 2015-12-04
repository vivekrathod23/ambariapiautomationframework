package com.hwx.ambariapilib.json.service.Configs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by vrathod on 12/3/15.
 */
public class Desired {
  //  ClusterConfig clusters;
  @SerializedName("href")
  @Expose
  private String href;
    @SerializedName("Clusters")
    @Expose
    private ClusterConfig Clusters;
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ClusterConfig getClusters() {


        return Clusters;
    }

    public void setClusters(ClusterConfig clusters) {
        this.Clusters = clusters;
    }


}
