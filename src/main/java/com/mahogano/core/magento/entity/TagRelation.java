package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class TagRelation {

    private Integer tagRelationId;

    private Integer tagId;

    private Integer customerId;

    private Integer productId;

    private Integer storeId;

    private Integer active;

    private LocalDateTime createdAt;

    public Integer getTagRelationId() {
        return tagRelationId;
    }

    public void setTagRelationId(Integer tagRelationId) {
        this.tagRelationId = tagRelationId;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

}

