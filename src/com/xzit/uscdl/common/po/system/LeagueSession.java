package com.xzit.uscdl.common.po.system;

public class LeagueSession {
    private String sessionValue;

    private String sessionName;

    private String sessionYear;

    private Integer isCurrent;

    private String sessionTheme;

    public String getSessionValue() {
        return sessionValue;
    }

    public void setSessionValue(String sessionValue) {
        this.sessionValue = sessionValue == null ? null : sessionValue.trim();
    }

    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName == null ? null : sessionName.trim();
    }

    public String getSessionYear() {
        return sessionYear;
    }

    public void setSessionYear(String sessionYear) {
        this.sessionYear = sessionYear == null ? null : sessionYear.trim();
    }

    public Integer getIsCurrent() {
        return isCurrent;
    }

    public void setIsCurrent(Integer isCurrent) {
        this.isCurrent = isCurrent;
    }

    public String getSessionTheme() {
        return sessionTheme;
    }

    public void setSessionTheme(String sessionTheme) {
        this.sessionTheme = sessionTheme == null ? null : sessionTheme.trim();
    }
}