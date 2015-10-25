package com.hwx.ambariapilib.json.common;

/**
 * Created by ajain on 10/21/15.
 */
public class RequestStageListJson {
    private String href;
    private RequestStageJson Stage;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public RequestStageJson getStage() {
        return Stage;
    }

    public void setStage(RequestStageJson stage) {
        Stage = stage;
    }
}
