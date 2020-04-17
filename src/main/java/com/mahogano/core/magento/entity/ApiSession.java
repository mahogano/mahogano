package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class ApiSession {

    private Integer userId;

    private LocalDateTime logdate;

    private String sessid;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public LocalDateTime getLogdate() {
        return logdate;
    }

    public void setLogdate(LocalDateTime logdate) {
        this.logdate = logdate;
    }

    public String getSessid() {
        return sessid;
    }

    public void setSessid(String sessid) {
        this.sessid = sessid;
    }

}

