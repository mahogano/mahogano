package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

public class ShippingTablerate {

    private Integer pk;

    private Integer websiteId;

    private String destCountryId;

    private Integer destRegionId;

    private String destZip;

    private String conditionName;

    private BigDecimal conditionValue;

    private BigDecimal price;

    private BigDecimal cost;

    public Integer getPk() {
        return pk;
    }

    public void setPk(Integer pk) {
        this.pk = pk;
    }

    public Integer getWebsiteId() {
        return websiteId;
    }

    public void setWebsiteId(Integer websiteId) {
        this.websiteId = websiteId;
    }

    public String getDestCountryId() {
        return destCountryId;
    }

    public void setDestCountryId(String destCountryId) {
        this.destCountryId = destCountryId;
    }

    public Integer getDestRegionId() {
        return destRegionId;
    }

    public void setDestRegionId(Integer destRegionId) {
        this.destRegionId = destRegionId;
    }

    public String getDestZip() {
        return destZip;
    }

    public void setDestZip(String destZip) {
        this.destZip = destZip;
    }

    public String getConditionName() {
        return conditionName;
    }

    public void setConditionName(String conditionName) {
        this.conditionName = conditionName;
    }

    public BigDecimal getConditionValue() {
        return conditionValue;
    }

    public void setConditionValue(BigDecimal conditionValue) {
        this.conditionValue = conditionValue;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

}

