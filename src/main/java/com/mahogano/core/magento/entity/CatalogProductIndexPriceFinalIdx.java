package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

public class CatalogProductIndexPriceFinalIdx {

    private Integer entityId;

    private Integer customerGroupId;

    private Integer websiteId;

    private Integer taxClassId;

    private BigDecimal origPrice;

    private BigDecimal price;

    private BigDecimal minPrice;

    private BigDecimal maxPrice;

    private BigDecimal tierPrice;

    private BigDecimal baseTier;

    private BigDecimal groupPrice;

    private BigDecimal baseGroupPrice;

    public Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    public Integer getCustomerGroupId() {
        return customerGroupId;
    }

    public void setCustomerGroupId(Integer customerGroupId) {
        this.customerGroupId = customerGroupId;
    }

    public Integer getWebsiteId() {
        return websiteId;
    }

    public void setWebsiteId(Integer websiteId) {
        this.websiteId = websiteId;
    }

    public Integer getTaxClassId() {
        return taxClassId;
    }

    public void setTaxClassId(Integer taxClassId) {
        this.taxClassId = taxClassId;
    }

    public BigDecimal getOrigPrice() {
        return origPrice;
    }

    public void setOrigPrice(BigDecimal origPrice) {
        this.origPrice = origPrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    public BigDecimal getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(BigDecimal maxPrice) {
        this.maxPrice = maxPrice;
    }

    public BigDecimal getTierPrice() {
        return tierPrice;
    }

    public void setTierPrice(BigDecimal tierPrice) {
        this.tierPrice = tierPrice;
    }

    public BigDecimal getBaseTier() {
        return baseTier;
    }

    public void setBaseTier(BigDecimal baseTier) {
        this.baseTier = baseTier;
    }

    public BigDecimal getGroupPrice() {
        return groupPrice;
    }

    public void setGroupPrice(BigDecimal groupPrice) {
        this.groupPrice = groupPrice;
    }

    public BigDecimal getBaseGroupPrice() {
        return baseGroupPrice;
    }

    public void setBaseGroupPrice(BigDecimal baseGroupPrice) {
        this.baseGroupPrice = baseGroupPrice;
    }

}

