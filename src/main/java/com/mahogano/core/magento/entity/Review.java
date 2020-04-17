package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class Review {

    private Long reviewId;

    private LocalDateTime createdAt;

    private Integer entityId;

    private Integer entityPkValue;

    private Integer statusId;

    public Long getReviewId() {
        return reviewId;
    }

    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    public Integer getEntityPkValue() {
        return entityPkValue;
    }

    public void setEntityPkValue(Integer entityPkValue) {
        this.entityPkValue = entityPkValue;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

}

