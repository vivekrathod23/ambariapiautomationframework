package com.hwx.ambariapilib.json.common;

/**
 * Created by ajain on 10/21/15.
 */
public class RequestTaskListJson {
    private String href;
    private RequestTaskJson Tasks;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public RequestTaskJson getTasks() {
        return Tasks;
    }

    public void setTasks(RequestTaskJson tasks) {
        Tasks = tasks;
    }
}
