package com.mahogano.core.magento.entity;

public class ReviewEntitySummary {

    private Long primaryId;

    private Long entityPkValue;

    private Integer entityType;

    private Integer reviewsCount;

    private Integer ratingSummary;

    private Integer storeId;

    public Long getPrimaryId() {
        return primaryId;
    }

    public void setPrimaryId(Long primaryId) {
        this.primaryId = primaryId;
    }

    public Long getEntityPkValue() {
        return entityPkValue;
    }

    public void setEntityPkValue(Long entityPkValue) {
        this.entityPkValue = entityPkValue;
    }

    public Integer getEntityType() {
        return entityType;
    }

    public void setEntityType(Integer entityType) {
        this.entityType = entityType;
    }

    public Integer getReviewsCount() {
        return reviewsCount;
    }

    public void setReviewsCount(Integer reviewsCount) {
        this.reviewsCount = reviewsCount;
    }

    public Integer getRatingSummary() {
        return ratingSummary;
    }

    public void setRatingSummary(Integer ratingSummary) {
        this.ratingSummary = ratingSummary;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

}

