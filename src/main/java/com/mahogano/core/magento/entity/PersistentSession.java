package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class PersistentSession {

    private Integer persistentId;

    private String key;

    private Integer customerId;

    private Integer websiteId;

    private String info;

    private LocalDateTime updatedAt;

    public Integer getPersistentId() {
        return persistentId;
    }

    public void setPersistentId(Integer persistentId) {
        this.persistentId = persistentId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getWebsiteId() {
        return websiteId;
    }

    public void setWebsiteId(Integer websiteId) {
        this.websiteId = websiteId;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

}

