package com.xzit.tmms.bean;

public class Course {
    private Integer courseId;

    private String courseName;

    private Float totalCredit;

    private Float theotyCredit;

    private Float practiceCredit;

    private String modelType;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public Float getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(Float totalCredit) {
        this.totalCredit = totalCredit;
    }

    public Float getTheotyCredit() {
        return theotyCredit;
    }

    public void setTheotyCredit(Float theotyCredit) {
        this.theotyCredit = theotyCredit;
    }

    public Float getPracticeCredit() {
        return practiceCredit;
    }

    public void setPracticeCredit(Float practiceCredit) {
        this.practiceCredit = practiceCredit;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType == null ? null : modelType.trim();
    }
}