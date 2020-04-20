package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class StockMvtReason {

    private Integer idStockMvtReason;

    private Integer sign;

    private LocalDateTime dateAdd;

    private LocalDateTime dateUpd;

    private Integer deleted;

    public Integer getIdStockMvtReason() {
        return idStockMvtReason;
    }

    public void setIdStockMvtReason(Integer idStockMvtReason) {
        this.idStockMvtReason = idStockMvtReason;
    }

    public Integer getSign() {
        return sign;
    }

    public void setSign(Integer sign) {
        this.sign = sign;
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

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

}

