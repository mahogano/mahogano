package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class DesignChange {

    private Integer designChangeId;

    private Integer storeId;

    private String design;

    private LocalDateTime dateFrom;

    private LocalDateTime dateTo;

    public Integer getDesignChangeId() {
        return designChangeId;
    }

    public void setDesignChangeId(Integer designChangeId) {
        this.designChangeId = designChangeId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public LocalDateTime getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDateTime dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDateTime getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDateTime dateTo) {
        this.dateTo = dateTo;
    }

}

