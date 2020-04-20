package com.mahogano.core.presta.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderSlip {

    private Integer idOrderSlip;

    private BigDecimal conversionRate;

    private Integer idCustomer;

    private Integer idOrder;

    private BigDecimal totalProductsTaxExcl;

    private BigDecimal totalProductsTaxIncl;

    private BigDecimal totalShippingTaxExcl;

    private BigDecimal totalShippingTaxIncl;

    private Integer shippingCost;

    private BigDecimal amount;

    private BigDecimal shippingCostAmount;

    private Integer partial;

    private Integer orderSlipType;

    private LocalDateTime dateAdd;

    private LocalDateTime dateUpd;

    public Integer getIdOrderSlip() {
        return idOrderSlip;
    }

    public void setIdOrderSlip(Integer idOrderSlip) {
        this.idOrderSlip = idOrderSlip;
    }

    public BigDecimal getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(BigDecimal conversionRate) {
        this.conversionRate = conversionRate;
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public BigDecimal getTotalProductsTaxExcl() {
        return totalProductsTaxExcl;
    }

    public void setTotalProductsTaxExcl(BigDecimal totalProductsTaxExcl) {
        this.totalProductsTaxExcl = totalProductsTaxExcl;
    }

    public BigDecimal getTotalProductsTaxIncl() {
        return totalProductsTaxIncl;
    }

    public void setTotalProductsTaxIncl(BigDecimal totalProductsTaxIncl) {
        this.totalProductsTaxIncl = totalProductsTaxIncl;
    }

    public BigDecimal getTotalShippingTaxExcl() {
        return totalShippingTaxExcl;
    }

    public void setTotalShippingTaxExcl(BigDecimal totalShippingTaxExcl) {
        this.totalShippingTaxExcl = totalShippingTaxExcl;
    }

    public BigDecimal getTotalShippingTaxIncl() {
        return totalShippingTaxIncl;
    }

    public void setTotalShippingTaxIncl(BigDecimal totalShippingTaxIncl) {
        this.totalShippingTaxIncl = totalShippingTaxIncl;
    }

    public Integer getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(Integer shippingCost) {
        this.shippingCost = shippingCost;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getShippingCostAmount() {
        return shippingCostAmount;
    }

    public void setShippingCostAmount(BigDecimal shippingCostAmount) {
        this.shippingCostAmount = shippingCostAmount;
    }

    public Integer getPartial() {
        return partial;
    }

    public void setPartial(Integer partial) {
        this.partial = partial;
    }

    public Integer getOrderSlipType() {
        return orderSlipType;
    }

    public void setOrderSlipType(Integer orderSlipType) {
        this.orderSlipType = orderSlipType;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }

    public LocalDateTime getDateUpd() {
        return dateUpd;
    }

    public void setDateUpd(LocalDateTime dateUpd) {
        this.dateUpd = dateUpd;
    }

}

