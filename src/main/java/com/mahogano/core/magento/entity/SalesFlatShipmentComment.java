package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class SalesFlatShipmentComment {

    private Integer entityId;

    private Integer parentId;

    private Integer isCustomerNotified;

    private Integer isVisibleOnFront;

    private String comment;

    private LocalDateTime createdAt;

    public Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getIsCustomerNotified() {
        return isCustomerNotified;
    }

    public void setIsCustomerNotified(Integer isCustomerNotified) {
        this.isCustomerNotified = isCustomerNotified;
    }

    public Integer getIsVisibleOnFront() {
        return isVisibleOnFront;
    }

    public void setIsVisibleOnFront(Integer isVisibleOnFront) {
        this.isVisibleOnFront = isVisibleOnFront;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

}

