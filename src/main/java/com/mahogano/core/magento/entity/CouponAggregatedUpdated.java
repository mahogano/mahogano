package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

import java.time.LocalDateTime;

public class CouponAggregatedUpdated {

    private Integer id;

    private LocalDateTime period;

    private Integer storeId;

    private String orderStatus;

    private String couponCode;

    private Integer couponUses;

    private BigDecimal subtotalAmount;

    private BigDecimal discountAmount;

    private BigDecimal totalAmount;

    private BigDecimal subtotalAmountActual;

    private BigDecimal discountAmountActual;

    private BigDecimal totalAmountActual;

    private String ruleName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getPeriod() {
        return period;
    }

    public void setPeriod(LocalDateTime period) {
        this.period = period;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public Integer getCouponUses() {
        return couponUses;
    }

    public void setCouponUses(Integer couponUses) {
        this.couponUses = couponUses;
    }

    public BigDecimal getSubtotalAmount() {
        return subtotalAmount;
    }

    public void setSubtotalAmount(BigDecimal subtotalAmount) {
        this.subtotalAmount = subtotalAmount;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getSubtotalAmountActual() {
        return subtotalAmountActual;
    }

    public void setSubtotalAmountActual(BigDecimal subtotalAmountActual) {
        this.subtotalAmountActual = subtotalAmountActual;
    }

    public BigDecimal getDiscountAmountActual() {
        return discountAmountActual;
    }

    public void setDiscountAmountActual(BigDecimal discountAmountActual) {
        this.discountAmountActual = discountAmountActual;
    }

    public BigDecimal getTotalAmountActual() {
        return totalAmountActual;
    }

    public void setTotalAmountActual(BigDecimal totalAmountActual) {
        this.totalAmountActual = totalAmountActual;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

}

