package com.hwx.ambariapilib.json.upgrade;

/**
 * Created by vsharma on 11/5/15.
 */
public class UpgradeGroupJson {
    private int completed_task_count;
    private int group_id;
    private int in_progress_task_count;
    private String name;
    private String progress_percent;
    private int request_id;
    private String status;
    private String title;
    private int total_task_count;
    private String display_status;

    public int getCompleted_task_count() {
        return completed_task_count;
    }

    public int getGroup_id() {
        return group_id;
    }

    public int getIn_progress_task_count() {
        return in_progress_task_count;
    }

    public String getName() {
        return name;
    }

    public String getProgress_percent() {
        return progress_percent;
    }

    public int getRequest_id() {
        return request_id;
    }

    public String getStatus() {
        return status;
    }

    public String getTitle() {
        return title;
    }

    public int getTotal_task_count() {
        return total_task_count;
    }

    public String getDisplayStatus() {
        return display_status;
    }
}
