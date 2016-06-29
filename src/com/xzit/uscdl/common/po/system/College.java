package com.xzit.uscdl.common.po.system;

public class College {
    private Integer collegeId;

    private String eduType;

    private String address;

    private String zipcode;

    private String province;

    private Integer privateNum;

    private String privateAttaPath;

    private Integer privateState;

    private Integer teamNum;

    private String teamAttaPath;

    private Integer teamState;

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public String getEduType() {
        return eduType;
    }

    public void setEduType(String eduType) {
        this.eduType = eduType == null ? null : eduType.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public Integer getPrivateNum() {
        return privateNum;
    }

    public void setPrivateNum(Integer privateNum) {
        this.privateNum = privateNum;
    }

    public String getPrivateAttaPath() {
        return privateAttaPath;
    }

    public void setPrivateAttaPath(String privateAttaPath) {
        this.privateAttaPath = privateAttaPath == null ? null : privateAttaPath.trim();
    }

    public Integer getPrivateState() {
        return privateState;
    }

    public void setPrivateState(Integer privateState) {
        this.privateState = privateState;
    }

    public Integer getTeamNum() {
        return teamNum;
    }

    public void setTeamNum(Integer teamNum) {
        this.teamNum = teamNum;
    }

    public String getTeamAttaPath() {
        return teamAttaPath;
    }

    public void setTeamAttaPath(String teamAttaPath) {
        this.teamAttaPath = teamAttaPath == null ? null : teamAttaPath.trim();
    }

    public Integer getTeamState() {
        return teamState;
    }

    public void setTeamState(Integer teamState) {
        this.teamState = teamState;
    }
}