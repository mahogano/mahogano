package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

import java.time.LocalDateTime;

public class CatalogruleProductPrice {

    private Integer ruleProductPriceId;

    private LocalDateTime ruleDate;

    private Integer customerGroupId;

    private Integer productId;

    private BigDecimal rulePrice;

    private Integer websiteId;

    private LocalDateTime latestStartDate;

    private LocalDateTime earliestEndDate;

    public Integer getRuleProductPriceId() {
        return ruleProductPriceId;
    }

    public void setRuleProductPriceId(Integer ruleProductPriceId) {
        this.ruleProductPriceId = ruleProductPriceId;
    }

    public LocalDateTime getRuleDate() {
        return ruleDate;
    }

    public void setRuleDate(LocalDateTime ruleDate) {
        this.ruleDate = ruleDate;
    }

    public Integer getCustomerGroupId() {
        return customerGroupId;
    }

    public void setCustomerGroupId(Integer customerGroupId) {
        this.customerGroupId = customerGroupId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public BigDecimal getRulePrice() {
        return rulePrice;
    }

    public void setRulePrice(BigDecimal rulePrice) {
        this.rulePrice = rulePrice;
    }

    public Integer getWebsiteId() {
        return websiteId;
    }

    public void setWebsiteId(Integer websiteId) {
        this.websiteId = websiteId;
    }

    public LocalDateTime getLatestStartDate() {
        return latestStartDate;
    }

    public void setLatestStartDate(LocalDateTime latestStartDate) {
        this.latestStartDate = latestStartDate;
    }

    public LocalDateTime getEarliestEndDate() {
        return earliestEndDate;
    }

    public void setEarliestEndDate(LocalDateTime earliestEndDate) {
        this.earliestEndDate = earliestEndDate;
    }

}

