package com.mahogano.core.presta.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class SpecificPriceRule {

    private Integer idSpecificPriceRule;

    private String name;

    private Integer idShop;

    private Integer idCurrency;

    private Integer idCountry;

    private Integer idGroup;

    private Integer fromQuantity;

    private BigDecimal price;

    private BigDecimal reduction;

    private Integer reductionTax;

    private String reductionType;

    private LocalDateTime from;

    private LocalDateTime to;

    public Integer getIdSpecificPriceRule() {
        return idSpecificPriceRule;
    }

    public void setIdSpecificPriceRule(Integer idSpecificPriceRule) {
        this.idSpecificPriceRule = idSpecificPriceRule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdShop() {
        return idShop;
    }

    public void setIdShop(Integer idShop) {
        this.idShop = idShop;
    }

    public Integer getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(Integer idCurrency) {
        this.idCurrency = idCurrency;
    }

    public Integer getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Integer idCountry) {
        this.idCountry = idCountry;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    public Integer getFromQuantity() {
        return fromQuantity;
    }

    public void setFromQuantity(Integer fromQuantity) {
        this.fromQuantity = fromQuantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getReduction() {
        return reduction;
    }

    public void setReduction(BigDecimal reduction) {
        this.reduction = reduction;
    }

    public Integer getReductionTax() {
        return reductionTax;
    }

    public void setReductionTax(Integer reductionTax) {
        this.reductionTax = reductionTax;
    }

    public String getReductionType() {
        return reductionType;
    }

    public void setReductionType(String reductionType) {
        this.reductionType = reductionType;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public void setFrom(LocalDateTime from) {
        this.from = from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public void setTo(LocalDateTime to) {
        this.to = to;
    }

}

