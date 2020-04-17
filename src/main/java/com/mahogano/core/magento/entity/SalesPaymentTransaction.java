package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class SalesPaymentTransaction {

    private Integer transactionId;

    private Integer parentId;

    private Integer orderId;

    private Integer paymentId;

    private String txnId;

    private String parentTxnId;

    private String txnType;

    private Integer isClosed;

    private byte[] additionalInformation;

    private LocalDateTime createdAt;

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public String getTxnId() {
        return txnId;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    public String getParentTxnId() {
        return parentTxnId;
    }

    public void setParentTxnId(String parentTxnId) {
        this.parentTxnId = parentTxnId;
    }

    public String getTxnType() {
        return txnType;
    }

    public void setTxnType(String txnType) {
        this.txnType = txnType;
    }

    public Integer getIsClosed() {
        return isClosed;
    }

    public void setIsClosed(Integer isClosed) {
        this.isClosed = isClosed;
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

