package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

import java.time.LocalDateTime;

public class SalesFlatQuoteItem {

    private Integer itemId;

    private Integer quoteId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private Integer productId;

    private Integer storeId;

    private Integer parentItemId;

    private Integer isVirtual;

    private String sku;

    private String name;

    private String description;

    private String appliedRuleIds;

    private String additionalData;

    private Integer freeShipping;

    private Integer isQtyDecimal;

    private Integer noDiscount;

    private BigDecimal weight;

    private BigDecimal qty;

    private BigDecimal price;

    private BigDecimal basePrice;

    private BigDecimal customPrice;

    private BigDecimal discountPercent;

    private BigDecimal discountAmount;

    private BigDecimal baseDiscountAmount;

    private BigDecimal taxPercent;

    private BigDecimal taxAmount;

    private BigDecimal baseTaxAmount;

    private BigDecimal rowTotal;

    private BigDecimal baseRowTotal;

    private BigDecimal rowTotalWithDiscount;

    private BigDecimal rowWeight;

    private String productType;

    private BigDecimal baseTaxBeforeDiscount;

    private BigDecimal taxBeforeDiscount;

    private BigDecimal originalCustomPrice;

    private String redirectUrl;

    private BigDecimal baseCost;

    private BigDecimal priceInclTax;

    private BigDecimal basePriceInclTax;

    private BigDecimal rowTotalInclTax;

    private BigDecimal baseRowTotalInclTax;

    private BigDecimal hiddenTaxAmount;

    private BigDecimal baseHiddenTaxAmount;

    private Integer giftMessageId;

    private BigDecimal weeeTaxDisposition;

    private BigDecimal weeeTaxRowDisposition;

    private BigDecimal baseWeeeTaxDisposition;

    private BigDecimal baseWeeeTaxRowDisposition;

    private String weeeTaxApplied;

    private BigDecimal weeeTaxAppliedAmount;

    private BigDecimal weeeTaxAppliedRowAmount;

    private BigDecimal baseWeeeTaxAppliedAmount;

    private BigDecimal baseWeeeTaxAppliedRowAmnt;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(Integer quoteId) {
        this.quoteId = quoteId;
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

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getParentItemId() {
        return parentItemId;
    }

    public void setParentItemId(Integer parentItemId) {
        this.parentItemId = parentItemId;
    }

    public Integer getIsVirtual() {
        return isVirtual;
    }

    public void setIsVirtual(Integer isVirtual) {
        this.isVirtual = isVirtual;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
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

    public Integer getNoDiscount() {
        return noDiscount;
    }

    public void setNoDiscount(Integer noDiscount) {
        this.noDiscount = noDiscount;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    public BigDecimal getCustomPrice() {
        return customPrice;
    }

    public void setCustomPrice(BigDecimal customPrice) {
        this.customPrice = customPrice;
    }

    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(BigDecimal discountPercent) {
        this.discountPercent = discountPercent;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public BigDecimal getBaseDiscountAmount() {
        return baseDiscountAmount;
    }

    public void setBaseDiscountAmount(BigDecimal baseDiscountAmount) {
        this.baseDiscountAmount = baseDiscountAmount;
    }

    public BigDecimal getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(BigDecimal taxPercent) {
        this.taxPercent = taxPercent;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public BigDecimal getBaseTaxAmount() {
        return baseTaxAmount;
    }

    public void setBaseTaxAmount(BigDecimal baseTaxAmount) {
        this.baseTaxAmount = baseTaxAmount;
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

    public BigDecimal getRowWeight() {
        return rowWeight;
    }

    public void setRowWeight(BigDecimal rowWeight) {
        this.rowWeight = rowWeight;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public BigDecimal getBaseTaxBeforeDiscount() {
        return baseTaxBeforeDiscount;
    }

    public void setBaseTaxBeforeDiscount(BigDecimal baseTaxBeforeDiscount) {
        this.baseTaxBeforeDiscount = baseTaxBeforeDiscount;
    }

    public BigDecimal getTaxBeforeDiscount() {
        return taxBeforeDiscount;
    }

    public void setTaxBeforeDiscount(BigDecimal taxBeforeDiscount) {
        this.taxBeforeDiscount = taxBeforeDiscount;
    }

    public BigDecimal getOriginalCustomPrice() {
        return originalCustomPrice;
    }

    public void setOriginalCustomPrice(BigDecimal originalCustomPrice) {
        this.originalCustomPrice = originalCustomPrice;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
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

    public BigDecimal getWeeeTaxDisposition() {
        return weeeTaxDisposition;
    }

    public void setWeeeTaxDisposition(BigDecimal weeeTaxDisposition) {
        this.weeeTaxDisposition = weeeTaxDisposition;
    }

    public BigDecimal getWeeeTaxRowDisposition() {
        return weeeTaxRowDisposition;
    }

    public void setWeeeTaxRowDisposition(BigDecimal weeeTaxRowDisposition) {
        this.weeeTaxRowDisposition = weeeTaxRowDisposition;
    }

    public BigDecimal getBaseWeeeTaxDisposition() {
        return baseWeeeTaxDisposition;
    }

    public void setBaseWeeeTaxDisposition(BigDecimal baseWeeeTaxDisposition) {
        this.baseWeeeTaxDisposition = baseWeeeTaxDisposition;
    }

    public BigDecimal getBaseWeeeTaxRowDisposition() {
        return baseWeeeTaxRowDisposition;
    }

    public void setBaseWeeeTaxRowDisposition(BigDecimal baseWeeeTaxRowDisposition) {
        this.baseWeeeTaxRowDisposition = baseWeeeTaxRowDisposition;
    }

    public String getWeeeTaxApplied() {
        return weeeTaxApplied;
    }

    public void setWeeeTaxApplied(String weeeTaxApplied) {
        this.weeeTaxApplied = weeeTaxApplied;
    }

    public BigDecimal getWeeeTaxAppliedAmount() {
        return weeeTaxAppliedAmount;
    }

    public void setWeeeTaxAppliedAmount(BigDecimal weeeTaxAppliedAmount) {
        this.weeeTaxAppliedAmount = weeeTaxAppliedAmount;
    }

    public BigDecimal getWeeeTaxAppliedRowAmount() {
        return weeeTaxAppliedRowAmount;
    }

    public void setWeeeTaxAppliedRowAmount(BigDecimal weeeTaxAppliedRowAmount) {
        this.weeeTaxAppliedRowAmount = weeeTaxAppliedRowAmount;
    }

    public BigDecimal getBaseWeeeTaxAppliedAmount() {
        return baseWeeeTaxAppliedAmount;
    }

    public void setBaseWeeeTaxAppliedAmount(BigDecimal baseWeeeTaxAppliedAmount) {
        this.baseWeeeTaxAppliedAmount = baseWeeeTaxAppliedAmount;
    }

    public BigDecimal getBaseWeeeTaxAppliedRowAmnt() {
        return baseWeeeTaxAppliedRowAmnt;
    }

    public void setBaseWeeeTaxAppliedRowAmnt(BigDecimal baseWeeeTaxAppliedRowAmnt) {
        this.baseWeeeTaxAppliedRowAmnt = baseWeeeTaxAppliedRowAmnt;
    }

}

