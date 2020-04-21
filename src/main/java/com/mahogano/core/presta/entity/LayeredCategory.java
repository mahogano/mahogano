package com.mahogano.core.presta.entity;


public class LayeredCategory {

    private Integer idLayeredCategory;

    private Integer idShop;

    private Integer idCategory;

    private Integer idValue;

    private String type;

    private Integer position;

    private Integer filterType;

    private Integer filterShowLimit;

    public Integer getIdLayeredCategory() {
        return idLayeredCategory;
    }

    public void setIdLayeredCategory(Integer idLayeredCategory) {
        this.idLayeredCategory = idLayeredCategory;
    }

    public Integer getIdShop() {
        return idShop;
    }

    public void setIdShop(Integer idShop) {
        this.idShop = idShop;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public Integer getIdValue() {
        return idValue;
    }

    public void setIdValue(Integer idValue) {
        this.idValue = idValue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getFilterType() {
        return filterType;
    }

    public void setFilterType(Integer filterType) {
        this.filterType = filterType;
    }

    public Integer getFilterShowLimit() {
        return filterShowLimit;
    }

    public void setFilterShowLimit(Integer filterShowLimit) {
        this.filterShowLimit = filterShowLimit;
    }

}

