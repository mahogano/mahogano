package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class TaxOrderAggregatedUpdated {

    private Integer id;

    private LocalDateTime period;

    private Integer storeId;

    private String code;

    private String orderStatus;

    private Float percent;

    private Integer ordersCount;

    private Float taxBaseAmountSum;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Float getPercent() {
        return percent;
    }

    public void setPercent(Float percent) {
        this.percent = percent;
    }

    public Integer getOrdersCount() {
        return ordersCount;
    }

    public void setOrdersCount(Integer ordersCount) {
        this.ordersCount = ordersCount;
    }

    public Float getTaxBaseAmountSum() {
        return taxBaseAmountSum;
    }

    public void setTaxBaseAmountSum(Float taxBaseAmountSum) {
        this.taxBaseAmountSum = taxBaseAmountSum;
    }

}

