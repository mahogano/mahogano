package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class CoreEmailQueue {

    private Integer messageId;

    private Integer entityId;

    private String entityType;

    private String eventType;

    private String messageBodyHash;

    private String messageBody;

    private String messageParameters;

    private LocalDateTime createdAt;

    private LocalDateTime processedAt;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getMessageBodyHash() {
        return messageBodyHash;
    }

    public void setMessageBodyHash(String messageBodyHash) {
        this.messageBodyHash = messageBodyHash;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public String getMessageParameters() {
        return messageParameters;
    }

    public void setMessageParameters(String messageParameters) {
        this.messageParameters = messageParameters;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getProcessedAt() {
        return processedAt;
    }

    public void setProcessedAt(LocalDateTime processedAt) {
        this.processedAt = processedAt;
    }

}

