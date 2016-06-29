package com.xzit.uscdl.common.po.register;

import java.util.Date;

public class Registration {
    private Integer registId;

    private String leagueSession;

    private String leagueGroup;

    private String room;

    private String seat;

    private String award;

    private Integer attaId;

    private Integer tutorId;

    private Integer userId;

    private Date createTime;

    private String state;

    private Date stateTime;

    public Integer getRegistId() {
        return registId;
    }

    public void setRegistId(Integer registId) {
        this.registId = registId;
    }

    public String getLeagueSession() {
        return leagueSession;
    }

    public void setLeagueSession(String leagueSession) {
        this.leagueSession = leagueSession == null ? null : leagueSession.trim();
    }

    public String getLeagueGroup() {
        return leagueGroup;
    }

    public void setLeagueGroup(String leagueGroup) {
        this.leagueGroup = leagueGroup == null ? null : leagueGroup.trim();
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room == null ? null : room.trim();
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat == null ? null : seat.trim();
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award == null ? null : award.trim();
    }

    public Integer getAttaId() {
        return attaId;
    }

    public void setAttaId(Integer attaId) {
        this.attaId = attaId;
    }

    public Integer getTutorId() {
        return tutorId;
    }

    public void setTutorId(Integer tutorId) {
        this.tutorId = tutorId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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