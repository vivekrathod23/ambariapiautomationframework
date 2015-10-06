package com.hwx.ambariapilib.service;

import com.hwx.ambariapilib.json.ResourceFilters;

/**
 * Created by ajain on 9/29/15.
 */
public class Request {
    private int aborted_task_count;
    private String cluster_name;
    private int completed_task_count;
    private long create_time;
    private long end_time;
    private boolean exclusive;
    private int failed_task_count;
    private int id;
    private String inputs;
    private String operation_level;
    private float progress_percent;
    private int queued_task_count;
    private String request_context;
    private String request_schedule;
    private String request_status;
    private ResourceFilters[] resource_filters;
    private long start_time;
    private int task_count;
    private int timed_out_task_count;
    private String type;

    public int getAborted_task_count() {
        return aborted_task_count;
    }

    public void setAborted_task_count(int aborted_task_count) {
        this.aborted_task_count = aborted_task_count;
    }

    public String getCluster_name() {
        return cluster_name;
    }

    public void setCluster_name(String cluster_name) {
        this.cluster_name = cluster_name;
    }

    public int getCompleted_task_count() {
        return completed_task_count;
    }

    public void setCompleted_task_count(int completed_task_count) {
        this.completed_task_count = completed_task_count;
    }

    public long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(long create_time) {
        this.create_time = create_time;
    }

    public long getEnd_time() {
        return end_time;
    }

    public void setEnd_time(long end_time) {
        this.end_time = end_time;
    }

    public boolean isExclusive() {
        return exclusive;
    }

    public void setExclusive(boolean exclusive) {
        this.exclusive = exclusive;
    }

    public int getFailed_task_count() {
        return failed_task_count;
    }

    public void setFailed_task_count(int failed_task_count) {
        this.failed_task_count = failed_task_count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInputs() {
        return inputs;
    }

    public void setInputs(String inputs) {
        this.inputs = inputs;
    }

    public String getOperation_level() {
        return operation_level;
    }

    public void setOperation_level(String operation_level) {
        this.operation_level = operation_level;
    }

    public float getProgress_percent() {
        return progress_percent;
    }

    public void setProgress_percent(float progress_percent) {
        this.progress_percent = progress_percent;
    }

    public int getQueued_task_count() {
        return queued_task_count;
    }

    public void setQueued_task_count(int queued_task_count) {
        this.queued_task_count = queued_task_count;
    }

    public String getRequest_context() {
        return request_context;
    }

    public void setRequest_context(String request_context) {
        this.request_context = request_context;
    }

    public String getRequest_schedule() {
        return request_schedule;
    }

    public void setRequest_schedule(String request_schedule) {
        this.request_schedule = request_schedule;
    }

    public String getRequest_status() {
        return request_status;
    }

    public void setRequest_status(String request_status) {
        this.request_status = request_status;
    }

    public ResourceFilters[] getResource_filters() {
        return resource_filters;
    }

    public void setResource_filters(ResourceFilters[] resource_filters) {
        this.resource_filters = resource_filters;
    }

    public long getStart_time() {
        return start_time;
    }

    public void setStart_time(long start_time) {
        this.start_time = start_time;
    }

    public int getTask_count() {
        return task_count;
    }

    public void setTask_count(int task_count) {
        this.task_count = task_count;
    }

    public int getTimed_out_task_count() {
        return timed_out_task_count;
    }

    public void setTimed_out_task_count(int timed_out_task_count) {
        this.timed_out_task_count = timed_out_task_count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
