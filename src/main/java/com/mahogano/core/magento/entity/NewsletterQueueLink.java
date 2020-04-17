package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class NewsletterQueueLink {

    private Integer queueLinkId;

    private Integer queueId;

    private Integer subscriberId;

    private LocalDateTime letterSentAt;

    public Integer getQueueLinkId() {
        return queueLinkId;
    }

    public void setQueueLinkId(Integer queueLinkId) {
        this.queueLinkId = queueLinkId;
    }

    public Integer getQueueId() {
        return queueId;
    }

    public void setQueueId(Integer queueId) {
        this.queueId = queueId;
    }

    public Integer getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Integer subscriberId) {
        this.subscriberId = subscriberId;
    }

    public LocalDateTime getLetterSentAt() {
        return letterSentAt;
    }

    public void setLetterSentAt(LocalDateTime letterSentAt) {
        this.letterSentAt = letterSentAt;
    }

}

