package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class LogVisitor {

    private Long visitorId;

    private String sessionId;

    private LocalDateTime firstVisitAt;

    private LocalDateTime lastVisitAt;

    private Long lastUrlId;

    private Integer storeId;

    public Long getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(Long visitorId) {
        this.visitorId = visitorId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
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

    public Long getLastUrlId() {
        return lastUrlId;
    }

    public void setLastUrlId(Long lastUrlId) {
        this.lastUrlId = lastUrlId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

}

