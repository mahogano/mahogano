package com.mahogano.core.magento.entity;

public class RatingOptionVote {

    private Long voteId;

    private Integer optionId;

    private String remoteIp;

    private byte[] remoteIpLong;

    private Integer customerId;

    private Long entityPkValue;

    private Integer ratingId;

    private Long reviewId;

    private Integer percent;

    private Integer value;

    public Long getVoteId() {
        return voteId;
    }

    public void setVoteId(Long voteId) {
        this.voteId = voteId;
    }

    public Integer getOptionId() {
        return optionId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    public String getRemoteIp() {
        return remoteIp;
    }

    public void setRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp;
    }

    public byte[] getRemoteIpLong() {
        return remoteIpLong;
    }

    public void setRemoteIpLong(byte[] remoteIpLong) {
        this.remoteIpLong = remoteIpLong;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Long getEntityPkValue() {
        return entityPkValue;
    }

    public void setEntityPkValue(Long entityPkValue) {
        this.entityPkValue = entityPkValue;
    }

    public Integer getRatingId() {
        return ratingId;
    }

    public void setRatingId(Integer ratingId) {
        this.ratingId = ratingId;
    }

    public Long getReviewId() {
        return reviewId;
    }

    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

}

