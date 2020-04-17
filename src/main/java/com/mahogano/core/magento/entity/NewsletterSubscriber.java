package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class NewsletterSubscriber {

    private Integer subscriberId;

    private Integer storeId;

    private LocalDateTime changeStatusAt;

    private Integer customerId;

    private String subscriberEmail;

    private Integer subscriberStatus;

    private String subscriberConfirmCode;

    public Integer getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Integer subscriberId) {
        this.subscriberId = subscriberId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public LocalDateTime getChangeStatusAt() {
        return changeStatusAt;
    }

    public void setChangeStatusAt(LocalDateTime changeStatusAt) {
        this.changeStatusAt = changeStatusAt;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getSubscriberEmail() {
        return subscriberEmail;
    }

    public void setSubscriberEmail(String subscriberEmail) {
        this.subscriberEmail = subscriberEmail;
    }

    public Integer getSubscriberStatus() {
        return subscriberStatus;
    }

    public void setSubscriberStatus(Integer subscriberStatus) {
        this.subscriberStatus = subscriberStatus;
    }

    public String getSubscriberConfirmCode() {
        return subscriberConfirmCode;
    }

    public void setSubscriberConfirmCode(String subscriberConfirmCode) {
        this.subscriberConfirmCode = subscriberConfirmCode;
    }

}

