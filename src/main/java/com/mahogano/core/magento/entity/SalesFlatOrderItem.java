package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

import java.time.LocalDateTime;

public class SalesFlatOrderItem {

    private Integer itemId;

    private Integer orderId;

    private Integer parentItemId;

    private Integer quoteItemId;

    private Integer storeId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private Integer productId;

    private String productType;

    private String productOptions;

    private BigDecimal weight;

    private Integer isVirtual;

    private String sku;

    private String name;

    private String description;

    private String appliedRuleIds;

    private String additionalData;

    private Integer freeShipping;

    private Integer isQtyDecimal;

    private Integer noDiscount;

    private BigDecimal qtyBackordered;

    private BigDecimal qtyCanceled;

    private BigDecimal qtyInvoiced;

    private BigDecimal qtyOrdered;

    private BigDecimal qtyRefunded;

    private BigDecimal qtyShipped;

    private BigDecimal baseCost;

    private BigDecimal price;

    private BigDecimal basePrice;

    private BigDecimal originalPrice;

    private BigDecimal baseOriginalPrice;

    private BigDecimal taxPercent;

    private BigDecimal taxAmount;

    private BigDecimal baseTaxAmount;

    private BigDecimal taxInvoiced;

    private BigDecimal baseTaxInvoiced;

    private BigDecimal discountPercent;

    private BigDecimal discountAmount;

    private BigDecimal baseDiscountAmount;

    private BigDecimal discountInvoiced;

    private BigDecimal baseDiscountInvoiced;

    private BigDecimal amountRefunded;

    private BigDecimal baseAmountRefunded;

    private BigDecimal rowTotal;

    private BigDecimal baseRowTotal;

    private BigDecimal rowInvoiced;

    private BigDecimal baseRowInvoiced;

    private BigDecimal rowWeight;

    private BigDecimal baseTaxBeforeDiscount;

    private BigDecimal taxBeforeDiscount;

    private String extOrderItemId;

    private Integer lockedDoInvoice;

    private Integer lockedDoShip;

    private BigDecimal priceInclTax;

    private BigDecimal basePriceInclTax;

    private BigDecimal rowTotalInclTax;

    private BigDecimal baseRowTotalInclTax;

    private BigDecimal hiddenTaxAmount;

    private BigDecimal baseHiddenTaxAmount;

    private BigDecimal hiddenTaxInvoiced;

    private BigDecimal baseHiddenTaxInvoiced;

    private BigDecimal hiddenTaxRefunded;

    private BigDecimal baseHiddenTaxRefunded;

    private Integer isNominal;

    private BigDecimal taxCanceled;

    private BigDecimal hiddenTaxCanceled;

    private BigDecimal taxRefunded;

    private BigDecimal baseTaxRefunded;

    private BigDecimal discountRefunded;

    private BigDecimal baseDiscountRefunded;

    private Integer giftMessageId;

    private Integer giftMessageAvailable;

    private BigDecimal baseWeeeTaxAppliedAmount;

    private BigDecimal baseWeeeTaxAppliedRowAmnt;

    private BigDecimal weeeTaxAppliedAmount;

    private BigDecimal weeeTaxAppliedRowAmount;

    private String weeeTaxApplied;

    private BigDecimal weeeTaxDisposition;

    private BigDecimal weeeTaxRowDisposition;

    private BigDecimal baseWeeeTaxDisposition;

    private BigDecimal baseWeeeTaxRowDisposition;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getParentItemId() {
        return parentItemId;
    }

    public void setParentItemId(Integer parentItemId) {
        this.parentItemId = parentItemId;
    }

    public Integer getQuoteItemId() {
        return quoteItemId;
    }

    public void setQuoteItemId(Integer quoteItemId) {
        this.quoteItemId = quoteItemId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
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

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductOptions() {
        return productOptions;
    }

    public void setProductOptions(String productOptions) {
        this.productOptions = productOptions;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
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

    public BigDecimal getQtyBackordered() {
        return qtyBackordered;
    }

    public void setQtyBackordered(BigDecimal qtyBackordered) {
        this.qtyBackordered = qtyBackordered;
    }

    public BigDecimal getQtyCanceled() {
        return qtyCanceled;
    }

    public void setQtyCanceled(BigDecimal qtyCanceled) {
        this.qtyCanceled = qtyCanceled;
    }

    public BigDecimal getQtyInvoiced() {
        return qtyInvoiced;
    }

    public void setQtyInvoiced(BigDecimal qtyInvoiced) {
        this.qtyInvoiced = qtyInvoiced;
    }

    public BigDecimal getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(BigDecimal qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public BigDecimal getQtyRefunded() {
        return qtyRefunded;
    }

    public void setQtyRefunded(BigDecimal qtyRefunded) {
        this.qtyRefunded = qtyRefunded;
    }

    public BigDecimal getQtyShipped() {
        return qtyShipped;
    }

    public void setQtyShipped(BigDecimal qtyShipped) {
        this.qtyShipped = qtyShipped;
    }

    public BigDecimal getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(BigDecimal baseCost) {
        this.baseCost = baseCost;
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

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public BigDecimal getBaseOriginalPrice() {
        return baseOriginalPrice;
    }

    public void setBaseOriginalPrice(BigDecimal baseOriginalPrice) {
        this.baseOriginalPrice = baseOriginalPrice;
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

    public BigDecimal getTaxInvoiced() {
        return taxInvoiced;
    }

    public void setTaxInvoiced(BigDecimal taxInvoiced) {
        this.taxInvoiced = taxInvoiced;
    }

    public BigDecimal getBaseTaxInvoiced() {
        return baseTaxInvoiced;
    }

    public void setBaseTaxInvoiced(BigDecimal baseTaxInvoiced) {
        this.baseTaxInvoiced = baseTaxInvoiced;
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

    public BigDecimal getDiscountInvoiced() {
        return discountInvoiced;
    }

    public void setDiscountInvoiced(BigDecimal discountInvoiced) {
        this.discountInvoiced = discountInvoiced;
    }

    public BigDecimal getBaseDiscountInvoiced() {
        return baseDiscountInvoiced;
    }

    public void setBaseDiscountInvoiced(BigDecimal baseDiscountInvoiced) {
        this.baseDiscountInvoiced = baseDiscountInvoiced;
    }

    public BigDecimal getAmountRefunded() {
        return amountRefunded;
    }

    public void setAmountRefunded(BigDecimal amountRefunded) {
        this.amountRefunded = amountRefunded;
    }

    public BigDecimal getBaseAmountRefunded() {
        return baseAmountRefunded;
    }

    public void setBaseAmountRefunded(BigDecimal baseAmountRefunded) {
        this.baseAmountRefunded = baseAmountRefunded;
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

    public BigDecimal getRowInvoiced() {
        return rowInvoiced;
    }

    public void setRowInvoiced(BigDecimal rowInvoiced) {
        this.rowInvoiced = rowInvoiced;
    }

    public BigDecimal getBaseRowInvoiced() {
        return baseRowInvoiced;
    }

    public void setBaseRowInvoiced(BigDecimal baseRowInvoiced) {
        this.baseRowInvoiced = baseRowInvoiced;
    }

    public BigDecimal getRowWeight() {
        return rowWeight;
    }

    public void setRowWeight(BigDecimal rowWeight) {
        this.rowWeight = rowWeight;
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

    public String getExtOrderItemId() {
        return extOrderItemId;
    }

    public void setExtOrderItemId(String extOrderItemId) {
        this.extOrderItemId = extOrderItemId;
    }

    public Integer getLockedDoInvoice() {
        return lockedDoInvoice;
    }

    public void setLockedDoInvoice(Integer lockedDoInvoice) {
        this.lockedDoInvoice = lockedDoInvoice;
    }

    public Integer getLockedDoShip() {
        return lockedDoShip;
    }

    public void setLockedDoShip(Integer lockedDoShip) {
        this.lockedDoShip = lockedDoShip;
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

    public BigDecimal getHiddenTaxInvoiced() {
        return hiddenTaxInvoiced;
    }

    public void setHiddenTaxInvoiced(BigDecimal hiddenTaxInvoiced) {
        this.hiddenTaxInvoiced = hiddenTaxInvoiced;
    }

    public BigDecimal getBaseHiddenTaxInvoiced() {
        return baseHiddenTaxInvoiced;
    }

    public void setBaseHiddenTaxInvoiced(BigDecimal baseHiddenTaxInvoiced) {
        this.baseHiddenTaxInvoiced = baseHiddenTaxInvoiced;
    }

    public BigDecimal getHiddenTaxRefunded() {
        return hiddenTaxRefunded;
    }

    public void setHiddenTaxRefunded(BigDecimal hiddenTaxRefunded) {
        this.hiddenTaxRefunded = hiddenTaxRefunded;
    }

    public BigDecimal getBaseHiddenTaxRefunded() {
        return baseHiddenTaxRefunded;
    }

    public void setBaseHiddenTaxRefunded(BigDecimal baseHiddenTaxRefunded) {
        this.baseHiddenTaxRefunded = baseHiddenTaxRefunded;
    }

    public Integer getIsNominal() {
        return isNominal;
    }

    public void setIsNominal(Integer isNominal) {
        this.isNominal = isNominal;
    }

    public BigDecimal getTaxCanceled() {
        return taxCanceled;
    }

    public void setTaxCanceled(BigDecimal taxCanceled) {
        this.taxCanceled = taxCanceled;
    }

    public BigDecimal getHiddenTaxCanceled() {
        return hiddenTaxCanceled;
    }

    public void setHiddenTaxCanceled(BigDecimal hiddenTaxCanceled) {
        this.hiddenTaxCanceled = hiddenTaxCanceled;
    }

    public BigDecimal getTaxRefunded() {
        return taxRefunded;
    }

    public void setTaxRefunded(BigDecimal taxRefunded) {
        this.taxRefunded = taxRefunded;
    }

    public BigDecimal getBaseTaxRefunded() {
        return baseTaxRefunded;
    }

    public void setBaseTaxRefunded(BigDecimal baseTaxRefunded) {
        this.baseTaxRefunded = baseTaxRefunded;
    }

    public BigDecimal getDiscountRefunded() {
        return discountRefunded;
    }

    public void setDiscountRefunded(BigDecimal discountRefunded) {
        this.discountRefunded = discountRefunded;
    }

    public BigDecimal getBaseDiscountRefunded() {
        return baseDiscountRefunded;
    }

    public void setBaseDiscountRefunded(BigDecimal baseDiscountRefunded) {
        this.baseDiscountRefunded = baseDiscountRefunded;
    }

    public Integer getGiftMessageId() {
        return giftMessageId;
    }

    public void setGiftMessageId(Integer giftMessageId) {
        this.giftMessageId = giftMessageId;
    }

    public Integer getGiftMessageAvailable() {
        return giftMessageAvailable;
    }

    public void setGiftMessageAvailable(Integer giftMessageAvailable) {
        this.giftMessageAvailable = giftMessageAvailable;
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

    public String getWeeeTaxApplied() {
        return weeeTaxApplied;
    }

    public void setWeeeTaxApplied(String weeeTaxApplied) {
        this.weeeTaxApplied = weeeTaxApplied;
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

}

