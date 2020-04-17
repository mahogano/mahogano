package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

public class CatalogProductOptionTypePrice {

    private Integer optionTypePriceId;

    private Integer optionTypeId;

    private Integer storeId;

    private BigDecimal price;

    private String priceType;

    public Integer getOptionTypePriceId() {
        return optionTypePriceId;
    }

    public void setOptionTypePriceId(Integer optionTypePriceId) {
        this.optionTypePriceId = optionTypePriceId;
    }

    public Integer getOptionTypeId() {
        return optionTypeId;
    }

    public void setOptionTypeId(Integer optionTypeId) {
        this.optionTypeId = optionTypeId;
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

