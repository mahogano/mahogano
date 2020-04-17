package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class SalesFlatQuotePayment {

    private Integer paymentId;

    private Integer quoteId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private String method;

    private String ccType;

    private String ccNumberEnc;

    private String ccLast4;

    private String ccCidEnc;

    private String ccOwner;

    private Integer ccExpMonth;

    private Integer ccExpYear;

    private String ccSsOwner;

    private Integer ccSsStartMonth;

    private Integer ccSsStartYear;

    private String poNumber;

    private String additionalData;

    private String ccSsIssue;

    private String additionalInformation;

    private String paypalPayerId;

    private String paypalPayerStatus;

    private String paypalCorrelationId;

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public Integer getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(Integer quoteId) {
        this.quoteId = quoteId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getCcType() {
        return ccType;
    }

    public void setCcType(String ccType) {
        this.ccType = ccType;
    }

    public String getCcNumberEnc() {
        return ccNumberEnc;
    }

    public void setCcNumberEnc(String ccNumberEnc) {
        this.ccNumberEnc = ccNumberEnc;
    }

    public String getCcLast4() {
        return ccLast4;
    }

    public void setCcLast4(String ccLast4) {
        this.ccLast4 = ccLast4;
    }

    public String getCcCidEnc() {
        return ccCidEnc;
    }

    public void setCcCidEnc(String ccCidEnc) {
        this.ccCidEnc = ccCidEnc;
    }

    public String getCcOwner() {
        return ccOwner;
    }

    public void setCcOwner(String ccOwner) {
        this.ccOwner = ccOwner;
    }

    public Integer getCcExpMonth() {
        return ccExpMonth;
    }

    public void setCcExpMonth(Integer ccExpMonth) {
        this.ccExpMonth = ccExpMonth;
    }

    public Integer getCcExpYear() {
        return ccExpYear;
    }

    public void setCcExpYear(Integer ccExpYear) {
        this.ccExpYear = ccExpYear;
    }

    public String getCcSsOwner() {
        return ccSsOwner;
    }

    public void setCcSsOwner(String ccSsOwner) {
        this.ccSsOwner = ccSsOwner;
    }

    public Integer getCcSsStartMonth() {
        return ccSsStartMonth;
    }

    public void setCcSsStartMonth(Integer ccSsStartMonth) {
        this.ccSsStartMonth = ccSsStartMonth;
    }

    public Integer getCcSsStartYear() {
        return ccSsStartYear;
    }

    public void setCcSsStartYear(Integer ccSsStartYear) {
        this.ccSsStartYear = ccSsStartYear;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    public String getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(String additionalData) {
        this.additionalData = additionalData;
    }

    public String getCcSsIssue() {
        return ccSsIssue;
    }

    public void setCcSsIssue(String ccSsIssue) {
        this.ccSsIssue = ccSsIssue;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public String getPaypalPayerId() {
        return paypalPayerId;
    }

    public void setPaypalPayerId(String paypalPayerId) {
        this.paypalPayerId = paypalPayerId;
    }

    public String getPaypalPayerStatus() {
        return paypalPayerStatus;
    }

    public void setPaypalPayerStatus(String paypalPayerStatus) {
        this.paypalPayerStatus = paypalPayerStatus;
    }

    public String getPaypalCorrelationId() {
        return paypalCorrelationId;
    }

    public void setPaypalCorrelationId(String paypalCorrelationId) {
        this.paypalCorrelationId = paypalCorrelationId;
    }

}

