package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class CatalogProductEntity {

    private Integer entityId;

    private Integer entityTypeId;

    private Integer attributeSetId;

    private String typeId;

    private String sku;

    private Integer hasOptions;

    private Integer requiredOptions;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    public Integer getEntityTypeId() {
        return entityTypeId;
    }

    public void setEntityTypeId(Integer entityTypeId) {
        this.entityTypeId = entityTypeId;
    }

    public Integer getAttributeSetId() {
        return attributeSetId;
    }

    public void setAttributeSetId(Integer attributeSetId) {
        this.attributeSetId = attributeSetId;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Integer getHasOptions() {
        return hasOptions;
    }

    public void setHasOptions(Integer hasOptions) {
        this.hasOptions = hasOptions;
    }

    public Integer getRequiredOptions() {
        return requiredOptions;
    }

    public void setRequiredOptions(Integer requiredOptions) {
        this.requiredOptions = requiredOptions;
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

}

