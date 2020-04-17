package com.mahogano.core.magento.entity;

public class RatingOptionVoteAggregated {

    private Integer primaryId;

    private Integer ratingId;

    private Long entityPkValue;

    private Integer voteCount;

    private Integer voteValueSum;

    private Integer percent;

    private Integer percentApproved;

    private Integer storeId;

    public Integer getPrimaryId() {
        return primaryId;
    }

    public void setPrimaryId(Integer primaryId) {
        this.primaryId = primaryId;
    }

    public Integer getRatingId() {
        return ratingId;
    }

    public void setRatingId(Integer ratingId) {
        this.ratingId = ratingId;
    }

    public Long getEntityPkValue() {
        return entityPkValue;
    }

    public void setEntityPkValue(Long entityPkValue) {
        this.entityPkValue = entityPkValue;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    public Integer getVoteValueSum() {
        return voteValueSum;
    }

    public void setVoteValueSum(Integer voteValueSum) {
        this.voteValueSum = voteValueSum;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    public Integer getPercentApproved() {
        return percentApproved;
    }

    public void setPercentApproved(Integer percentApproved) {
        this.percentApproved = percentApproved;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

}

