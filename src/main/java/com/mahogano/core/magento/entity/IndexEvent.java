package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class IndexEvent {

    private Long eventId;

    private String type;

    private String entity;

    private Long entityPk;

    private LocalDateTime createdAt;

    private String oldData;

    private String newData;

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public Long getEntityPk() {
        return entityPk;
    }

    public void setEntityPk(Long entityPk) {
        this.entityPk = entityPk;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getOldData() {
        return oldData;
    }

    public void setOldData(String oldData) {
        this.oldData = oldData;
    }

    public String getNewData() {
        return newData;
    }

    public void setNewData(String newData) {
        this.newData = newData;
    }

}

