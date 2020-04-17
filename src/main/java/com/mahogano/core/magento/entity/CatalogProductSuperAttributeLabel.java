package com.mahogano.core.magento.entity;

public class CatalogProductSuperAttributeLabel {

    private Integer valueId;

    private Integer productSuperAttributeId;

    private Integer storeId;

    private Integer useDefault;

    private String value;

    public Integer getValueId() {
        return valueId;
    }

    public void setValueId(Integer valueId) {
        this.valueId = valueId;
    }

    public Integer getProductSuperAttributeId() {
        return productSuperAttributeId;
    }

    public void setProductSuperAttributeId(Integer productSuperAttributeId) {
        this.productSuperAttributeId = productSuperAttributeId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getUseDefault() {
        return useDefault;
    }

    public void setUseDefault(Integer useDefault) {
        this.useDefault = useDefault;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}

