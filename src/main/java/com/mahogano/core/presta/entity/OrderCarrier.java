package com.mahogano.core.presta.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderCarrier {

    private Integer idOrderCarrier;

    private Integer idOrder;

    private Integer idCarrier;

    private Integer idOrderInvoice;

    private BigDecimal weight;

    private BigDecimal shippingCostTaxExcl;

    private BigDecimal shippingCostTaxIncl;

    private String trackingNumber;

    private LocalDateTime dateAdd;

    public Integer getIdOrderCarrier() {
        return idOrderCarrier;
    }

    public void setIdOrderCarrier(Integer idOrderCarrier) {
        this.idOrderCarrier = idOrderCarrier;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Integer getIdCarrier() {
        return idCarrier;
    }

    public void setIdCarrier(Integer idCarrier) {
        this.idCarrier = idCarrier;
    }

    public Integer getIdOrderInvoice() {
        return idOrderInvoice;
    }

    public void setIdOrderInvoice(Integer idOrderInvoice) {
        this.idOrderInvoice = idOrderInvoice;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getShippingCostTaxExcl() {
        return shippingCostTaxExcl;
    }

    public void setShippingCostTaxExcl(BigDecimal shippingCostTaxExcl) {
        this.shippingCostTaxExcl = shippingCostTaxExcl;
    }

    public BigDecimal getShippingCostTaxIncl() {
        return shippingCostTaxIncl;
    }

    public void setShippingCostTaxIncl(BigDecimal shippingCostTaxIncl) {
        this.shippingCostTaxIncl = shippingCostTaxIncl;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }

}

