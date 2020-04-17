package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

import java.time.LocalDateTime;

public class SalesFlatQuoteAddressItem {

    private Integer addressItemId;

    private Integer parentItemId;

    private Integer quoteAddressId;

    private Integer quoteItemId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private String appliedRuleIds;

    private String additionalData;

    private BigDecimal weight;

    private BigDecimal qty;

    private BigDecimal discountAmount;

    private BigDecimal taxAmount;

    private BigDecimal rowTotal;

    private BigDecimal baseRowTotal;

    private BigDecimal rowTotalWithDiscount;

    private BigDecimal baseDiscountAmount;

    private BigDecimal baseTaxAmount;

    private BigDecimal rowWeight;

    private Integer productId;

    private Integer superProductId;

    private Integer parentProductId;

    private String sku;

    private String image;

    private String name;

    private String description;

    private Integer freeShipping;

    private Integer isQtyDecimal;

    private BigDecimal price;

    private BigDecimal discountPercent;

    private Integer noDiscount;

    private BigDecimal taxPercent;

    private BigDecimal basePrice;

    private BigDecimal baseCost;

    private BigDecimal priceInclTax;

    private BigDecimal basePriceInclTax;

    private BigDecimal rowTotalInclTax;

    private BigDecimal baseRowTotalInclTax;

    private BigDecimal hiddenTaxAmount;

    private BigDecimal baseHiddenTaxAmount;

    private Integer giftMessageId;

    public Integer getAddressItemId() {
        return addressItemId;
    }

    public void setAddressItemId(Integer addressItemId) {
        this.addressItemId = addressItemId;
    }

    public Integer getParentItemId() {
        return parentItemId;
    }

    public void setParentItemId(Integer parentItemId) {
        this.parentItemId = parentItemId;
    }

    public Integer getQuoteAddressId() {
        return quoteAddressId;
    }

    public void setQuoteAddressId(Integer quoteAddressId) {
        this.quoteAddressId = quoteAddressId;
    }

    public Integer getQuoteItemId() {
        return quoteItemId;
    }

    public void setQuoteItemId(Integer quoteItemId) {
        this.quoteItemId = quoteItemId;
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

    public String getAppliedRuleIds() {
        return appliedRuleIds;
    }

    public void setAppliedRuleIds(String appliedRuleIds) {
        this.appliedRuleIds = appliedRuleIds;
    }

    public String getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(String additionalData) {
        this.additionalData = additionalData;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public BigDecimal getRowTotal() {
        return rowTotal;
    }

    public void setRowTotal(BigDecimal rowTotal) {
        this.rowTotal = rowTotal;
    }

    public BigDecimal getBaseRowTotal() {
        return baseRowTotal;
    }

    public void setBaseRowTotal(BigDecimal baseRowTotal) {
        this.baseRowTotal = baseRowTotal;
    }

    public BigDecimal getRowTotalWithDiscount() {
        return rowTotalWithDiscount;
    }

    public void setRowTotalWithDiscount(BigDecimal rowTotalWithDiscount) {
        this.rowTotalWithDiscount = rowTotalWithDiscount;
    }

    public BigDecimal getBaseDiscountAmount() {
        return baseDiscountAmount;
    }

    public void setBaseDiscountAmount(BigDecimal baseDiscountAmount) {
        this.baseDiscountAmount = baseDiscountAmount;
    }

    public BigDecimal getBaseTaxAmount() {
        return baseTaxAmount;
    }

    public void setBaseTaxAmount(BigDecimal baseTaxAmount) {
        this.baseTaxAmount = baseTaxAmount;
    }

    public BigDecimal getRowWeight() {
        return rowWeight;
    }

    public void setRowWeight(BigDecimal rowWeight) {
        this.rowWeight = rowWeight;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getSuperProductId() {
        return superProductId;
    }

    public void setSuperProductId(Integer superProductId) {
        this.superProductId = superProductId;
    }

    public Integer getParentProductId() {
        return parentProductId;
    }

    public void setParentProductId(Integer parentProductId) {
        this.parentProductId = parentProductId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(Integer freeShipping) {
        this.freeShipping = freeShipping;
    }

    public Integer getIsQtyDecimal() {
        return isQtyDecimal;
    }

    public void setIsQtyDecimal(Integer isQtyDecimal) {
        this.isQtyDecimal = isQtyDecimal;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(BigDecimal discountPercent) {
        this.discountPercent = discountPercent;
    }

    public Integer getNoDiscount() {
        return noDiscount;
    }

    public void setNoDiscount(Integer noDiscount) {
        this.noDiscount = noDiscount;
    }

    public BigDecimal getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(BigDecimal taxPercent) {
        this.taxPercent = taxPercent;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    public BigDecimal getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(BigDecimal baseCost) {
        this.baseCost = baseCost;
    }

    public BigDecimal getPriceInclTax() {
        return priceInclTax;
    }

    public void setPriceInclTax(BigDecimal priceInclTax) {
        this.priceInclTax = priceInclTax;
    }

    public BigDecimal getBasePriceInclTax() {
        return basePriceInclTax;
    }

    public void setBasePriceInclTax(BigDecimal basePriceInclTax) {
        this.basePriceInclTax = basePriceInclTax;
    }

    public BigDecimal getRowTotalInclTax() {
        return rowTotalInclTax;
    }

    public void setRowTotalInclTax(BigDecimal rowTotalInclTax) {
        this.rowTotalInclTax = rowTotalInclTax;
    }

    public BigDecimal getBaseRowTotalInclTax() {
        return baseRowTotalInclTax;
    }

    public void setBaseRowTotalInclTax(BigDecimal baseRowTotalInclTax) {
        this.baseRowTotalInclTax = baseRowTotalInclTax;
    }

    public BigDecimal getHiddenTaxAmount() {
        return hiddenTaxAmount;
    }

    public void setHiddenTaxAmount(BigDecimal hiddenTaxAmount) {
        this.hiddenTaxAmount = hiddenTaxAmount;
    }

    public BigDecimal getBaseHiddenTaxAmount() {
        return baseHiddenTaxAmount;
    }

    public void setBaseHiddenTaxAmount(BigDecimal baseHiddenTaxAmount) {
        this.baseHiddenTaxAmount = baseHiddenTaxAmount;
    }

    public Integer getGiftMessageId() {
        return giftMessageId;
    }

    public void setGiftMessageId(Integer giftMessageId) {
        this.giftMessageId = giftMessageId;
    }

}

