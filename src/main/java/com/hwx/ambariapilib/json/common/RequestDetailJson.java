package com.hwx.ambariapilib.json.common;

/**
 * Created by ajain on 10/21/15.
 */
public class RequestDetailJson {
    private String href;
    private RequestSummaryJson Requests;
    private RequestStageListJson[] stages;
    private RequestTaskListJson[] tasks;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public RequestSummaryJson getRequests() {
        return Requests;
    }

    public void setRequests(RequestSummaryJson requests) {
        Requests = requests;
    }

    public RequestStageListJson[] getStages() {
        return stages;
    }

    public void setStages(RequestStageListJson[] stages) {
        this.stages = stages;
    }

    public RequestTaskListJson[] getTasks() {
        return tasks;
    }

    public void setTasks(RequestTaskListJson[] tasks) {
        this.tasks = tasks;
    }
}

