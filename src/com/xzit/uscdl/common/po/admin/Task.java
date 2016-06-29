package com.xzit.uscdl.common.po.admin;

public class Task {
    private Integer taskId;

    private Integer taskYear;

    private String taskTerm;

    private Integer classId;

    private Integer courseId;

    private Integer teacherId;

    private String progress;

    private String remark;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getTaskYear() {
        return taskYear;
    }

    public void setTaskYear(Integer taskYear) {
        this.taskYear = taskYear;
    }

    public String getTaskTerm() {
        return taskTerm;
    }

    public void setTaskTerm(String taskTerm) {
        this.taskTerm = taskTerm == null ? null : taskTerm.trim();
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress == null ? null : progress.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}