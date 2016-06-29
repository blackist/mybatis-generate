package com.xzit.uscdl.common.po.admin;

public class Meterial {
    private Integer meteId;

    private Integer modelId;

    private Integer taskId;

    private String meteName;

    private String metePath;

    private String meteType;

    public Integer getMeteId() {
        return meteId;
    }

    public void setMeteId(Integer meteId) {
        this.meteId = meteId;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getMeteName() {
        return meteName;
    }

    public void setMeteName(String meteName) {
        this.meteName = meteName == null ? null : meteName.trim();
    }

    public String getMetePath() {
        return metePath;
    }

    public void setMetePath(String metePath) {
        this.metePath = metePath == null ? null : metePath.trim();
    }

    public String getMeteType() {
        return meteType;
    }

    public void setMeteType(String meteType) {
        this.meteType = meteType == null ? null : meteType.trim();
    }
}