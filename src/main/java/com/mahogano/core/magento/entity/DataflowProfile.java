package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class DataflowProfile {

    private Integer profileId;

    private String name;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private String actionsXml;

    private String guiData;

    private String direction;

    private String entityType;

    private Integer storeId;

    private String dataTransfer;

    public Integer getProfileId() {
        return profileId;
    }

    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getActionsXml() {
        return actionsXml;
    }

    public void setActionsXml(String actionsXml) {
        this.actionsXml = actionsXml;
    }

    public String getGuiData() {
        return guiData;
    }

    public void setGuiData(String guiData) {
        this.guiData = guiData;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getDataTransfer() {
        return dataTransfer;
    }

    public void setDataTransfer(String dataTransfer) {
        this.dataTransfer = dataTransfer;
    }

}

