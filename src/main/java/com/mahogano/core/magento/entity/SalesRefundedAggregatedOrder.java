package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

import java.time.LocalDateTime;

public class SalesRefundedAggregatedOrder {

    private Integer id;

    private LocalDateTime period;

    private Integer storeId;

    private String orderStatus;

    private Integer ordersCount;

    private BigDecimal refunded;

    private BigDecimal onlineRefunded;

    private BigDecimal offlineRefunded;

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

    public BigDecimal getRefunded() {
        return refunded;
    }

    public void setRefunded(BigDecimal refunded) {
        this.refunded = refunded;
    }

    public BigDecimal getOnlineRefunded() {
        return onlineRefunded;
    }

    public void setOnlineRefunded(BigDecimal onlineRefunded) {
        this.onlineRefunded = onlineRefunded;
    }

    public BigDecimal getOfflineRefunded() {
        return offlineRefunded;
    }

    public void setOfflineRefunded(BigDecimal offlineRefunded) {
        this.offlineRefunded = offlineRefunded;
    }

}

