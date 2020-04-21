package com.mahogano.core.presta.entity;

import java.math.BigDecimal;

public class GroupReduction {

    private Integer idGroupReduction;

    private Integer idGroup;

    private Integer idCategory;

    private BigDecimal reduction;

    public Integer getIdGroupReduction() {
        return idGroupReduction;
    }

    public void setIdGroupReduction(Integer idGroupReduction) {
        this.idGroupReduction = idGroupReduction;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public BigDecimal getReduction() {
        return reduction;
    }

    public void setReduction(BigDecimal reduction) {
        this.reduction = reduction;
    }

}

