package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

import java.time.LocalDateTime;

public class SalesOrderAggregatedUpdated {

    private Integer id;

    private LocalDateTime period;

    private Integer storeId;

    private String orderStatus;

    private Integer ordersCount;

    private BigDecimal totalQtyOrdered;

    private BigDecimal totalQtyInvoiced;

    private BigDecimal totalIncomeAmount;

    private BigDecimal totalRevenueAmount;

    private BigDecimal totalProfitAmount;

    private BigDecimal totalInvoicedAmount;

    private BigDecimal totalCanceledAmount;

    private BigDecimal totalPaidAmount;

    private BigDecimal totalRefundedAmount;

    private BigDecimal totalTaxAmount;

    private BigDecimal totalTaxAmountActual;

    private BigDecimal totalShippingAmount;

    private BigDecimal totalShippingAmountActual;

    private BigDecimal totalDiscountAmount;

    private BigDecimal totalDiscountAmountActual;

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

    public Integer getOrdersCount() {
        return ordersCount;
    }

    public void setOrdersCount(Integer ordersCount) {
        this.ordersCount = ordersCount;
    }

    public BigDecimal getTotalQtyOrdered() {
        return totalQtyOrdered;
    }

    public void setTotalQtyOrdered(BigDecimal totalQtyOrdered) {
        this.totalQtyOrdered = totalQtyOrdered;
    }

    public BigDecimal getTotalQtyInvoiced() {
        return totalQtyInvoiced;
    }

    public void setTotalQtyInvoiced(BigDecimal totalQtyInvoiced) {
        this.totalQtyInvoiced = totalQtyInvoiced;
    }

    public BigDecimal getTotalIncomeAmount() {
        return totalIncomeAmount;
    }

    public void setTotalIncomeAmount(BigDecimal totalIncomeAmount) {
        this.totalIncomeAmount = totalIncomeAmount;
    }

    public BigDecimal getTotalRevenueAmount() {
        return totalRevenueAmount;
    }

    public void setTotalRevenueAmount(BigDecimal totalRevenueAmount) {
        this.totalRevenueAmount = totalRevenueAmount;
    }

    public BigDecimal getTotalProfitAmount() {
        return totalProfitAmount;
    }

    public void setTotalProfitAmount(BigDecimal totalProfitAmount) {
        this.totalProfitAmount = totalProfitAmount;
    }

    public BigDecimal getTotalInvoicedAmount() {
        return totalInvoicedAmount;
    }

    public void setTotalInvoicedAmount(BigDecimal totalInvoicedAmount) {
        this.totalInvoicedAmount = totalInvoicedAmount;
    }

    public BigDecimal getTotalCanceledAmount() {
        return totalCanceledAmount;
    }

    public void setTotalCanceledAmount(BigDecimal totalCanceledAmount) {
        this.totalCanceledAmount = totalCanceledAmount;
    }

    public BigDecimal getTotalPaidAmount() {
        return totalPaidAmount;
    }

    public void setTotalPaidAmount(BigDecimal totalPaidAmount) {
        this.totalPaidAmount = totalPaidAmount;
    }

    public BigDecimal getTotalRefundedAmount() {
        return totalRefundedAmount;
    }

    public void setTotalRefundedAmount(BigDecimal totalRefundedAmount) {
        this.totalRefundedAmount = totalRefundedAmount;
    }

    public BigDecimal getTotalTaxAmount() {
        return totalTaxAmount;
    }

    public void setTotalTaxAmount(BigDecimal totalTaxAmount) {
        this.totalTaxAmount = totalTaxAmount;
    }

    public BigDecimal getTotalTaxAmountActual() {
        return totalTaxAmountActual;
    }

    public void setTotalTaxAmountActual(BigDecimal totalTaxAmountActual) {
        this.totalTaxAmountActual = totalTaxAmountActual;
    }

    public BigDecimal getTotalShippingAmount() {
        return totalShippingAmount;
    }

    public void setTotalShippingAmount(BigDecimal totalShippingAmount) {
        this.totalShippingAmount = totalShippingAmount;
    }

    public BigDecimal getTotalShippingAmountActual() {
        return totalShippingAmountActual;
    }

    public void setTotalShippingAmountActual(BigDecimal totalShippingAmountActual) {
        this.totalShippingAmountActual = totalShippingAmountActual;
    }

    public BigDecimal getTotalDiscountAmount() {
        return totalDiscountAmount;
    }

    public void setTotalDiscountAmount(BigDecimal totalDiscountAmount) {
        this.totalDiscountAmount = totalDiscountAmount;
    }

    public BigDecimal getTotalDiscountAmountActual() {
        return totalDiscountAmountActual;
    }

    public void setTotalDiscountAmountActual(BigDecimal totalDiscountAmountActual) {
        this.totalDiscountAmountActual = totalDiscountAmountActual;
    }

}

