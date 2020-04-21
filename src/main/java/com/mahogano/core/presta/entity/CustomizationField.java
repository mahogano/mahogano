package com.mahogano.core.presta.entity;


public class CustomizationField {

    private Integer idCustomizationField;

    private Integer idProduct;

    private Integer type;

    private Integer required;

    private Integer isModule;

    private Integer isDeleted;

    public Integer getIdCustomizationField() {
        return idCustomizationField;
    }

    public void setIdCustomizationField(Integer idCustomizationField) {
        this.idCustomizationField = idCustomizationField;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getRequired() {
        return required;
    }

    public void setRequired(Integer required) {
        this.required = required;
    }

    public Integer getIsModule() {
        return isModule;
    }

    public void setIsModule(Integer isModule) {
        this.isModule = isModule;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

}

