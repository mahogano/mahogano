package com.mahogano.core.magento.entity;

public class NewsletterProblem {

    private Integer problemId;

    private Integer subscriberId;

    private Integer queueId;

    private Integer problemErrorCode;

    private String problemErrorText;

    public Integer getProblemId() {
        return problemId;
    }

    public void setProblemId(Integer problemId) {
        this.problemId = problemId;
    }

    public Integer getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Integer subscriberId) {
        this.subscriberId = subscriberId;
    }

    public Integer getQueueId() {
        return queueId;
    }

    public void setQueueId(Integer queueId) {
        this.queueId = queueId;
    }

    public Integer getProblemErrorCode() {
        return problemErrorCode;
    }

    public void setProblemErrorCode(Integer problemErrorCode) {
        this.problemErrorCode = problemErrorCode;
    }

    public String getProblemErrorText() {
        return problemErrorText;
    }

    public void setProblemErrorText(String problemErrorText) {
        this.problemErrorText = problemErrorText;
    }

}

