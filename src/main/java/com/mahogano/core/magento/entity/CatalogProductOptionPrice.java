package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

public class CatalogProductOptionPrice {

    private Integer optionPriceId;

    private Integer optionId;

    private Integer storeId;

    private BigDecimal price;

    private String priceType;

    public Integer getOptionPriceId() {
        return optionPriceId;
    }

    public void setOptionPriceId(Integer optionPriceId) {
        this.optionPriceId = optionPriceId;
    }

    public Integer getOptionId() {
        return optionId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

}

