package com.xzit.tmms.bean;

import java.util.Date;

public class Right {
    private Integer rightId;

    private String rifhtName;

    private Integer rightPos;

    private Long rightCode;

    private String rightUrl;

    private String isPublic;

    private String state;

    private Date stateTime;

    public Integer getRightId() {
        return rightId;
    }

    public void setRightId(Integer rightId) {
        this.rightId = rightId;
    }

    public String getRifhtName() {
        return rifhtName;
    }

    public void setRifhtName(String rifhtName) {
        this.rifhtName = rifhtName == null ? null : rifhtName.trim();
    }

    public Integer getRightPos() {
        return rightPos;
    }

    public void setRightPos(Integer rightPos) {
        this.rightPos = rightPos;
    }

    public Long getRightCode() {
        return rightCode;
    }

    public void setRightCode(Long rightCode) {
        this.rightCode = rightCode;
    }

    public String getRightUrl() {
        return rightUrl;
    }

    public void setRightUrl(String rightUrl) {
        this.rightUrl = rightUrl == null ? null : rightUrl.trim();
    }

    public String getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(String isPublic) {
        this.isPublic = isPublic == null ? null : isPublic.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getStateTime() {
        return stateTime;
    }

    public void setStateTime(Date stateTime) {
        this.stateTime = stateTime;
    }
}