package com.hwx.ambariapilib.upgrade;

import com.hwx.ambariapilib.json.cluster.ClusterJson;

/**
 * Created by vsharma on 11/5/15.
 */
public class RollingUpgrade extends StackUpgrade {
    public RollingUpgrade(ClusterJson clusterJson) {
        super(clusterJson);
    }
}
