package com.mahogano.core.magento.entity;

public class TagSummary {

    private Integer tagId;

    private Integer storeId;

    private Integer customers;

    private Integer products;

    private Integer uses;

    private Integer historicalUses;

    private Integer popularity;

    private Integer basePopularity;

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getCustomers() {
        return customers;
    }

    public void setCustomers(Integer customers) {
        this.customers = customers;
    }

    public Integer getProducts() {
        return products;
    }

    public void setProducts(Integer products) {
        this.products = products;
    }

    public Integer getUses() {
        return uses;
    }

    public void setUses(Integer uses) {
        this.uses = uses;
    }

    public Integer getHistoricalUses() {
        return historicalUses;
    }

    public void setHistoricalUses(Integer historicalUses) {
        this.historicalUses = historicalUses;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public Integer getBasePopularity() {
        return basePopularity;
    }

    public void setBasePopularity(Integer basePopularity) {
        this.basePopularity = basePopularity;
    }

}

