package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

import java.time.LocalDateTime;

public class CataloginventoryStockItem {

    private Integer itemId;

    private Integer productId;

    private Integer stockId;

    private BigDecimal qty;

    private BigDecimal minQty;

    private Integer useConfigMinQty;

    private Integer isQtyDecimal;

    private Integer backorders;

    private Integer useConfigBackorders;

    private BigDecimal minSaleQty;

    private Integer useConfigMinSaleQty;

    private BigDecimal maxSaleQty;

    private Integer useConfigMaxSaleQty;

    private Integer isInStock;

    private LocalDateTime lowStockDate;

    private BigDecimal notifyStockQty;

    private Integer useConfigNotifyStockQty;

    private Integer manageStock;

    private Integer useConfigManageStock;

    private Integer stockStatusChangedAuto;

    private Integer useConfigQtyIncrements;

    private BigDecimal qtyIncrements;

    private Integer useConfigEnableQtyInc;

    private Integer enableQtyIncrements;

    private Integer isDecimalDivided;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public BigDecimal getMinQty() {
        return minQty;
    }

    public void setMinQty(BigDecimal minQty) {
        this.minQty = minQty;
    }

    public Integer getUseConfigMinQty() {
        return useConfigMinQty;
    }

    public void setUseConfigMinQty(Integer useConfigMinQty) {
        this.useConfigMinQty = useConfigMinQty;
    }

    public Integer getIsQtyDecimal() {
        return isQtyDecimal;
    }

    public void setIsQtyDecimal(Integer isQtyDecimal) {
        this.isQtyDecimal = isQtyDecimal;
    }

    public Integer getBackorders() {
        return backorders;
    }

    public void setBackorders(Integer backorders) {
        this.backorders = backorders;
    }

    public Integer getUseConfigBackorders() {
        return useConfigBackorders;
    }

    public void setUseConfigBackorders(Integer useConfigBackorders) {
        this.useConfigBackorders = useConfigBackorders;
    }

    public BigDecimal getMinSaleQty() {
        return minSaleQty;
    }

    public void setMinSaleQty(BigDecimal minSaleQty) {
        this.minSaleQty = minSaleQty;
    }

    public Integer getUseConfigMinSaleQty() {
        return useConfigMinSaleQty;
    }

    public void setUseConfigMinSaleQty(Integer useConfigMinSaleQty) {
        this.useConfigMinSaleQty = useConfigMinSaleQty;
    }

    public BigDecimal getMaxSaleQty() {
        return maxSaleQty;
    }

    public void setMaxSaleQty(BigDecimal maxSaleQty) {
        this.maxSaleQty = maxSaleQty;
    }

    public Integer getUseConfigMaxSaleQty() {
        return useConfigMaxSaleQty;
    }

    public void setUseConfigMaxSaleQty(Integer useConfigMaxSaleQty) {
        this.useConfigMaxSaleQty = useConfigMaxSaleQty;
    }

    public Integer getIsInStock() {
        return isInStock;
    }

    public void setIsInStock(Integer isInStock) {
        this.isInStock = isInStock;
    }

    public LocalDateTime getLowStockDate() {
        return lowStockDate;
    }

    public void setLowStockDate(LocalDateTime lowStockDate) {
        this.lowStockDate = lowStockDate;
    }

    public BigDecimal getNotifyStockQty() {
        return notifyStockQty;
    }

    public void setNotifyStockQty(BigDecimal notifyStockQty) {
        this.notifyStockQty = notifyStockQty;
    }

    public Integer getUseConfigNotifyStockQty() {
        return useConfigNotifyStockQty;
    }

    public void setUseConfigNotifyStockQty(Integer useConfigNotifyStockQty) {
        this.useConfigNotifyStockQty = useConfigNotifyStockQty;
    }

    public Integer getManageStock() {
        return manageStock;
    }

    public void setManageStock(Integer manageStock) {
        this.manageStock = manageStock;
    }

    public Integer getUseConfigManageStock() {
        return useConfigManageStock;
    }

    public void setUseConfigManageStock(Integer useConfigManageStock) {
        this.useConfigManageStock = useConfigManageStock;
    }

    public Integer getStockStatusChangedAuto() {
        return stockStatusChangedAuto;
    }

    public void setStockStatusChangedAuto(Integer stockStatusChangedAuto) {
        this.stockStatusChangedAuto = stockStatusChangedAuto;
    }

    public Integer getUseConfigQtyIncrements() {
        return useConfigQtyIncrements;
    }

    public void setUseConfigQtyIncrements(Integer useConfigQtyIncrements) {
        this.useConfigQtyIncrements = useConfigQtyIncrements;
    }

    public BigDecimal getQtyIncrements() {
        return qtyIncrements;
    }

    public void setQtyIncrements(BigDecimal qtyIncrements) {
        this.qtyIncrements = qtyIncrements;
    }

    public Integer getUseConfigEnableQtyInc() {
        return useConfigEnableQtyInc;
    }

    public void setUseConfigEnableQtyInc(Integer useConfigEnableQtyInc) {
        this.useConfigEnableQtyInc = useConfigEnableQtyInc;
    }

    public Integer getEnableQtyIncrements() {
        return enableQtyIncrements;
    }

    public void setEnableQtyIncrements(Integer enableQtyIncrements) {
        this.enableQtyIncrements = enableQtyIncrements;
    }

    public Integer getIsDecimalDivided() {
        return isDecimalDivided;
    }

    public void setIsDecimalDivided(Integer isDecimalDivided) {
        this.isDecimalDivided = isDecimalDivided;
    }

}

