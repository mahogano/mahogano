package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class OauthConsumer {

    private Integer entityId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private String name;

    private String key;

    private String secret;

    private String callbackUrl;

    private String rejectedCallbackUrl;

    public Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getRejectedCallbackUrl() {
        return rejectedCallbackUrl;
    }

    public void setRejectedCallbackUrl(String rejectedCallbackUrl) {
        this.rejectedCallbackUrl = rejectedCallbackUrl;
    }

}

