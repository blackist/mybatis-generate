package com.xzit.uscdl.common.po.exam;

public class Question {
    private Integer quesId;

    private String quesType;

    private Float quesValue;

    private String leagueSession;

    private String leagueGroup;

    public Integer getQuesId() {
        return quesId;
    }

    public void setQuesId(Integer quesId) {
        this.quesId = quesId;
    }

    public String getQuesType() {
        return quesType;
    }

    public void setQuesType(String quesType) {
        this.quesType = quesType == null ? null : quesType.trim();
    }

    public Float getQuesValue() {
        return quesValue;
    }

    public void setQuesValue(Float quesValue) {
        this.quesValue = quesValue;
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
}