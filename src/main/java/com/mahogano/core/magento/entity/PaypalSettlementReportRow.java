package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

import java.time.LocalDateTime;

public class PaypalSettlementReportRow {

    private Integer rowId;

    private Integer reportId;

    private String transactionId;

    private String invoiceId;

    private String paypalReferenceId;

    private String paypalReferenceIdType;

    private String transactionEventCode;

    private LocalDateTime transactionInitiationDate;

    private LocalDateTime transactionCompletionDate;

    private String transactionDebitOrCredit;

    private BigDecimal grossTransactionAmount;

    private String grossTransactionCurrency;

    private String feeDebitOrCredit;

    private BigDecimal feeAmount;

    private String feeCurrency;

    private String customField;

    private String consumerId;

    private String paymentTrackingId;

    private String storeId;

    public Integer getRowId() {
        return rowId;
    }

    public void setRowId(Integer rowId) {
        this.rowId = rowId;
    }

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getPaypalReferenceId() {
        return paypalReferenceId;
    }

    public void setPaypalReferenceId(String paypalReferenceId) {
        this.paypalReferenceId = paypalReferenceId;
    }

    public String getPaypalReferenceIdType() {
        return paypalReferenceIdType;
    }

    public void setPaypalReferenceIdType(String paypalReferenceIdType) {
        this.paypalReferenceIdType = paypalReferenceIdType;
    }

    public String getTransactionEventCode() {
        return transactionEventCode;
    }

    public void setTransactionEventCode(String transactionEventCode) {
        this.transactionEventCode = transactionEventCode;
    }

    public LocalDateTime getTransactionInitiationDate() {
        return transactionInitiationDate;
    }

    public void setTransactionInitiationDate(LocalDateTime transactionInitiationDate) {
        this.transactionInitiationDate = transactionInitiationDate;
    }

    public LocalDateTime getTransactionCompletionDate() {
        return transactionCompletionDate;
    }

    public void setTransactionCompletionDate(LocalDateTime transactionCompletionDate) {
        this.transactionCompletionDate = transactionCompletionDate;
    }

    public String getTransactionDebitOrCredit() {
        return transactionDebitOrCredit;
    }

    public void setTransactionDebitOrCredit(String transactionDebitOrCredit) {
        this.transactionDebitOrCredit = transactionDebitOrCredit;
    }

    public BigDecimal getGrossTransactionAmount() {
        return grossTransactionAmount;
    }

    public void setGrossTransactionAmount(BigDecimal grossTransactionAmount) {
        this.grossTransactionAmount = grossTransactionAmount;
    }

    public String getGrossTransactionCurrency() {
        return grossTransactionCurrency;
    }

    public void setGrossTransactionCurrency(String grossTransactionCurrency) {
        this.grossTransactionCurrency = grossTransactionCurrency;
    }

    public String getFeeDebitOrCredit() {
        return feeDebitOrCredit;
    }

    public void setFeeDebitOrCredit(String feeDebitOrCredit) {
        this.feeDebitOrCredit = feeDebitOrCredit;
    }

    public BigDecimal getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }

    public String getFeeCurrency() {
        return feeCurrency;
    }

    public void setFeeCurrency(String feeCurrency) {
        this.feeCurrency = feeCurrency;
    }

    public String getCustomField() {
        return customField;
    }

    public void setCustomField(String customField) {
        this.customField = customField;
    }

    public String getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(String consumerId) {
        this.consumerId = consumerId;
    }

    public String getPaymentTrackingId() {
        return paymentTrackingId;
    }

    public void setPaymentTrackingId(String paymentTrackingId) {
        this.paymentTrackingId = paymentTrackingId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

}

