package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class Statssearch {

    private Integer idStatssearch;

    private Integer idShop;

    private Integer idShopGroup;

    private String keywords;

    private Integer results;

    private LocalDateTime dateAdd;

    public Integer getIdStatssearch() {
        return idStatssearch;
    }

    public void setIdStatssearch(Integer idStatssearch) {
        this.idStatssearch = idStatssearch;
    }

    public Integer getIdShop() {
        return idShop;
    }

    public void setIdShop(Integer idShop) {
        this.idShop = idShop;
    }

    public Integer getIdShopGroup() {
        return idShopGroup;
    }

    public void setIdShopGroup(Integer idShopGroup) {
        this.idShopGroup = idShopGroup;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Integer getResults() {
        return results;
    }

    public void setResults(Integer results) {
        this.results = results;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }

}

