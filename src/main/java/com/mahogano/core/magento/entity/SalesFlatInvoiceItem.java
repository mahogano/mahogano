package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

public class SalesFlatInvoiceItem {

    private Integer entityId;

    private Integer parentId;

    private BigDecimal basePrice;

    private BigDecimal taxAmount;

    private BigDecimal baseRowTotal;

    private BigDecimal discountAmount;

    private BigDecimal rowTotal;

    private BigDecimal baseDiscountAmount;

    private BigDecimal priceInclTax;

    private BigDecimal baseTaxAmount;

    private BigDecimal basePriceInclTax;

    private BigDecimal qty;

    private BigDecimal baseCost;

    private BigDecimal price;

    private BigDecimal baseRowTotalInclTax;

    private BigDecimal rowTotalInclTax;

    private Integer productId;

    private Integer orderItemId;

    private String additionalData;

    private String description;

    private String sku;

    private String name;

    private BigDecimal hiddenTaxAmount;

    private BigDecimal baseHiddenTaxAmount;

    private BigDecimal baseWeeeTaxAppliedAmount;

    private BigDecimal baseWeeeTaxAppliedRowAmnt;

    private BigDecimal weeeTaxAppliedAmount;

    private BigDecimal weeeTaxAppliedRowAmount;

    private String weeeTaxApplied;

    private BigDecimal weeeTaxDisposition;

    private BigDecimal weeeTaxRowDisposition;

    private BigDecimal baseWeeeTaxDisposition;

    private BigDecimal baseWeeeTaxRowDisposition;

    public Integer getEntityId() {
        return entityId;
    }

    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public BigDecimal getBaseRowTotal() {
        return baseRowTotal;
    }

    public void setBaseRowTotal(BigDecimal baseRowTotal) {
        this.baseRowTotal = baseRowTotal;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public BigDecimal getRowTotal() {
        return rowTotal;
    }

    public void setRowTotal(BigDecimal rowTotal) {
        this.rowTotal = rowTotal;
    }

    public BigDecimal getBaseDiscountAmount() {
        return baseDiscountAmount;
    }

    public void setBaseDiscountAmount(BigDecimal baseDiscountAmount) {
        this.baseDiscountAmount = baseDiscountAmount;
    }

    public BigDecimal getPriceInclTax() {
        return priceInclTax;
    }

    public void setPriceInclTax(BigDecimal priceInclTax) {
        this.priceInclTax = priceInclTax;
    }

    public BigDecimal getBaseTaxAmount() {
        return baseTaxAmount;
    }

    public void setBaseTaxAmount(BigDecimal baseTaxAmount) {
        this.baseTaxAmount = baseTaxAmount;
    }

    public BigDecimal getBasePriceInclTax() {
        return basePriceInclTax;
    }

    public void setBasePriceInclTax(BigDecimal basePriceInclTax) {
        this.basePriceInclTax = basePriceInclTax;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
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

    public BigDecimal getBaseRowTotalInclTax() {
        return baseRowTotalInclTax;
    }

    public void setBaseRowTotalInclTax(BigDecimal baseRowTotalInclTax) {
        this.baseRowTotalInclTax = baseRowTotalInclTax;
    }

    public BigDecimal getRowTotalInclTax() {
        return rowTotalInclTax;
    }

    public void setRowTotalInclTax(BigDecimal rowTotalInclTax) {
        this.rowTotalInclTax = rowTotalInclTax;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Integer orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(String additionalData) {
        this.additionalData = additionalData;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

