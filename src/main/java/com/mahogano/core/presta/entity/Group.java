package com.mahogano.core.presta.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Group {

    private Integer idGroup;

    private BigDecimal reduction;

    private Integer priceDisplayMethod;

    private Integer showPrices;

    private LocalDateTime dateAdd;

    private LocalDateTime dateUpd;

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    public BigDecimal getReduction() {
        return reduction;
    }

    public void setReduction(BigDecimal reduction) {
        this.reduction = reduction;
    }

    public Integer getPriceDisplayMethod() {
        return priceDisplayMethod;
    }

    public void setPriceDisplayMethod(Integer priceDisplayMethod) {
        this.priceDisplayMethod = priceDisplayMethod;
    }

    public Integer getShowPrices() {
        return showPrices;
    }

    public void setShowPrices(Integer showPrices) {
        this.showPrices = showPrices;
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

