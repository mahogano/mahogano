package com.mahogano.core.presta.entity;

import java.math.BigDecimal;

public class OrderSlipDetail {

    private Integer idOrderSlip;

    private Integer idOrderDetail;

    private Integer productQuantity;

    private BigDecimal unitPriceTaxExcl;

    private BigDecimal unitPriceTaxIncl;

    private BigDecimal totalPriceTaxExcl;

    private BigDecimal totalPriceTaxIncl;

    private BigDecimal amountTaxExcl;

    private BigDecimal amountTaxIncl;

    public Integer getIdOrderSlip() {
        return idOrderSlip;
    }

    public void setIdOrderSlip(Integer idOrderSlip) {
        this.idOrderSlip = idOrderSlip;
    }

    public Integer getIdOrderDetail() {
        return idOrderDetail;
    }

    public void setIdOrderDetail(Integer idOrderDetail) {
        this.idOrderDetail = idOrderDetail;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public BigDecimal getUnitPriceTaxExcl() {
        return unitPriceTaxExcl;
    }

    public void setUnitPriceTaxExcl(BigDecimal unitPriceTaxExcl) {
        this.unitPriceTaxExcl = unitPriceTaxExcl;
    }

    public BigDecimal getUnitPriceTaxIncl() {
        return unitPriceTaxIncl;
    }

    public void setUnitPriceTaxIncl(BigDecimal unitPriceTaxIncl) {
        this.unitPriceTaxIncl = unitPriceTaxIncl;
    }

    public BigDecimal getTotalPriceTaxExcl() {
        return totalPriceTaxExcl;
    }

    public void setTotalPriceTaxExcl(BigDecimal totalPriceTaxExcl) {
        this.totalPriceTaxExcl = totalPriceTaxExcl;
    }

    public BigDecimal getTotalPriceTaxIncl() {
        return totalPriceTaxIncl;
    }

    public void setTotalPriceTaxIncl(BigDecimal totalPriceTaxIncl) {
        this.totalPriceTaxIncl = totalPriceTaxIncl;
    }

    public BigDecimal getAmountTaxExcl() {
        return amountTaxExcl;
    }

    public void setAmountTaxExcl(BigDecimal amountTaxExcl) {
        this.amountTaxExcl = amountTaxExcl;
    }

    public BigDecimal getAmountTaxIncl() {
        return amountTaxIncl;
    }

    public void setAmountTaxIncl(BigDecimal amountTaxIncl) {
        this.amountTaxIncl = amountTaxIncl;
    }

}

