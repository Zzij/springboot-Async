package com.zz.zbcf.entity;

public class TaskData {

    private String taskType;
    private String address;

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "{" +
                "taskType='" + taskType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
