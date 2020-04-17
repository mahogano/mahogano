package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class LogVisitorOnline {

    private Long visitorId;

    private String visitorType;

    private byte[] remoteAddr;

    private LocalDateTime firstVisitAt;

    private LocalDateTime lastVisitAt;

    private Integer customerId;

    private String lastUrl;

    public Long getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(Long visitorId) {
        this.visitorId = visitorId;
    }

    public String getVisitorType() {
        return visitorType;
    }

    public void setVisitorType(String visitorType) {
        this.visitorType = visitorType;
    }

    public byte[] getRemoteAddr() {
        return remoteAddr;
    }

    public void setRemoteAddr(byte[] remoteAddr) {
        this.remoteAddr = remoteAddr;
    }

    public LocalDateTime getFirstVisitAt() {
        return firstVisitAt;
    }

    public void setFirstVisitAt(LocalDateTime firstVisitAt) {
        this.firstVisitAt = firstVisitAt;
    }

    public LocalDateTime getLastVisitAt() {
        return lastVisitAt;
    }

    public void setLastVisitAt(LocalDateTime lastVisitAt) {
        this.lastVisitAt = lastVisitAt;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getLastUrl() {
        return lastUrl;
    }

    public void setLastUrl(String lastUrl) {
        this.lastUrl = lastUrl;
    }

}

