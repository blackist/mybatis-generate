package com.xzit.uscdl.common.po.user;

import java.util.Date;

public class UserInstitute {
    private Integer instiId;

    private Integer collegeId;

    private String department;

    private String major;

    private String eduSys;

    private Date admissionTime;

    private Date graduateTime;

    private String stuNumber;

    private String stuImagePath;

    private Integer userId;

    public Integer getInstiId() {
        return instiId;
    }

    public void setInstiId(Integer instiId) {
        this.instiId = instiId;
    }

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getEduSys() {
        return eduSys;
    }

    public void setEduSys(String eduSys) {
        this.eduSys = eduSys == null ? null : eduSys.trim();
    }

    public Date getAdmissionTime() {
        return admissionTime;
    }

    public void setAdmissionTime(Date admissionTime) {
        this.admissionTime = admissionTime;
    }

    public Date getGraduateTime() {
        return graduateTime;
    }

    public void setGraduateTime(Date graduateTime) {
        this.graduateTime = graduateTime;
    }

    public String getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber == null ? null : stuNumber.trim();
    }

    public String getStuImagePath() {
        return stuImagePath;
    }

    public void setStuImagePath(String stuImagePath) {
        this.stuImagePath = stuImagePath == null ? null : stuImagePath.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}