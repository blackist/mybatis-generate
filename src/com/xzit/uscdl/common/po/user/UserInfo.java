package com.xzit.uscdl.common.po.user;

import java.util.Date;

public class UserInfo {
    private Integer userInfoId;

    private String name;

    private String sex;

    private Date birthday;

    private String address;

    private String zipcode;

    private String phone;

    private String certiType;

    private String certiNumber;

    private String certiImagePath;

    private String photoImagePath;

    private Integer userId;

    public Integer getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(Integer userInfoId) {
        this.userInfoId = userInfoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getCertiType() {
        return certiType;
    }

    public void setCertiType(String certiType) {
        this.certiType = certiType == null ? null : certiType.trim();
    }

    public String getCertiNumber() {
        return certiNumber;
    }

    public void setCertiNumber(String certiNumber) {
        this.certiNumber = certiNumber == null ? null : certiNumber.trim();
    }

    public String getCertiImagePath() {
        return certiImagePath;
    }

    public void setCertiImagePath(String certiImagePath) {
        this.certiImagePath = certiImagePath == null ? null : certiImagePath.trim();
    }

    public String getPhotoImagePath() {
        return photoImagePath;
    }

    public void setPhotoImagePath(String photoImagePath) {
        this.photoImagePath = photoImagePath == null ? null : photoImagePath.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}