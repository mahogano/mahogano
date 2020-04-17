package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class PaypalPaymentTransaction {

    private Integer transactionId;

    private String txnId;

    private byte[] additionalInformation;

    private LocalDateTime createdAt;

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public String getTxnId() {
        return txnId;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    public byte[] getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(byte[] additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

}

