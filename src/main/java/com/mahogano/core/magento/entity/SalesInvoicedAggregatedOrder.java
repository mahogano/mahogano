package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

import java.time.LocalDateTime;

public class SalesInvoicedAggregatedOrder {

    private Integer id;

    private LocalDateTime period;

    private Integer storeId;

    private String orderStatus;

    private Integer ordersCount;

    private BigDecimal ordersInvoiced;

    private BigDecimal invoiced;

    private BigDecimal invoicedCaptured;

    private BigDecimal invoicedNotCaptured;

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

    public BigDecimal getOrdersInvoiced() {
        return ordersInvoiced;
    }

    public void setOrdersInvoiced(BigDecimal ordersInvoiced) {
        this.ordersInvoiced = ordersInvoiced;
    }

    public BigDecimal getInvoiced() {
        return invoiced;
    }

    public void setInvoiced(BigDecimal invoiced) {
        this.invoiced = invoiced;
    }

    public BigDecimal getInvoicedCaptured() {
        return invoicedCaptured;
    }

    public void setInvoicedCaptured(BigDecimal invoicedCaptured) {
        this.invoicedCaptured = invoicedCaptured;
    }

    public BigDecimal getInvoicedNotCaptured() {
        return invoicedNotCaptured;
    }

    public void setInvoicedNotCaptured(BigDecimal invoicedNotCaptured) {
        this.invoicedNotCaptured = invoicedNotCaptured;
    }

}

