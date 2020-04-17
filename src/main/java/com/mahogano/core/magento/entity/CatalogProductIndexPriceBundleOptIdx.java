package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

public class CatalogProductIndexPriceBundleOptIdx {

    private Integer entityId;

    private Integer customerGroupId;

    private Integer websiteId;

    private Integer optionId;

    private BigDecimal minPrice;

    private BigDecimal altPrice;

    private BigDecimal maxPrice;

    private BigDecimal tierPrice;

    private BigDecimal altTierPrice;

    private BigDecimal groupPrice;

    private BigDecimal altGroupPrice;

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

    public Integer getOptionId() {
        return optionId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    public BigDecimal getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    public BigDecimal getAltPrice() {
        return altPrice;
    }

    public void setAltPrice(BigDecimal altPrice) {
        this.altPrice = altPrice;
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

    public BigDecimal getAltTierPrice() {
        return altTierPrice;
    }

    public void setAltTierPrice(BigDecimal altTierPrice) {
        this.altTierPrice = altTierPrice;
    }

    public BigDecimal getGroupPrice() {
        return groupPrice;
    }

    public void setGroupPrice(BigDecimal groupPrice) {
        this.groupPrice = groupPrice;
    }

    public BigDecimal getAltGroupPrice() {
        return altGroupPrice;
    }

    public void setAltGroupPrice(BigDecimal altGroupPrice) {
        this.altGroupPrice = altGroupPrice;
    }

}

