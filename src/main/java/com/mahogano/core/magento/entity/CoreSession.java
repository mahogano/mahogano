package com.mahogano.core.magento.entity;

public class CoreSession {

    private String sessionId;

    private Integer sessionExpires;

    private byte[] sessionData;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getSessionExpires() {
        return sessionExpires;
    }

    public void setSessionExpires(Integer sessionExpires) {
        this.sessionExpires = sessionExpires;
    }

    public byte[] getSessionData() {
        return sessionData;
    }

    public void setSessionData(byte[] sessionData) {
        this.sessionData = sessionData;
    }

}

