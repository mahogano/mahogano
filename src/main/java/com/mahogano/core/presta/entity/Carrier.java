package com.mahogano.core.presta.entity;

import java.math.BigDecimal;

public class Carrier {

    private Integer idCarrier;

    private Integer idReference;

    private Integer idTaxRulesGroup;

    private String name;

    private String url;

    private Integer active;

    private Integer deleted;

    private Integer shippingHandling;

    private Integer rangeBehavior;

    private Integer isModule;

    private Integer isFree;

    private Integer shippingExternal;

    private Integer needRange;

    private String externalModuleName;

    private Integer shippingMethod;

    private Integer position;

    private Integer maxWidth;

    private Integer maxHeight;

    private Integer maxDepth;

    private BigDecimal maxWeight;

    private Integer grade;

    public Integer getIdCarrier() {
        return idCarrier;
    }

    public void setIdCarrier(Integer idCarrier) {
        this.idCarrier = idCarrier;
    }

    public Integer getIdReference() {
        return idReference;
    }

    public void setIdReference(Integer idReference) {
        this.idReference = idReference;
    }

    public Integer getIdTaxRulesGroup() {
        return idTaxRulesGroup;
    }

    public void setIdTaxRulesGroup(Integer idTaxRulesGroup) {
        this.idTaxRulesGroup = idTaxRulesGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Integer getShippingHandling() {
        return shippingHandling;
    }

    public void setShippingHandling(Integer shippingHandling) {
        this.shippingHandling = shippingHandling;
    }

    public Integer getRangeBehavior() {
        return rangeBehavior;
    }

    public void setRangeBehavior(Integer rangeBehavior) {
        this.rangeBehavior = rangeBehavior;
    }

    public Integer getIsModule() {
        return isModule;
    }

    public void setIsModule(Integer isModule) {
        this.isModule = isModule;
    }

    public Integer getIsFree() {
        return isFree;
    }

    public void setIsFree(Integer isFree) {
        this.isFree = isFree;
    }

    public Integer getShippingExternal() {
        return shippingExternal;
    }

    public void setShippingExternal(Integer shippingExternal) {
        this.shippingExternal = shippingExternal;
    }

    public Integer getNeedRange() {
        return needRange;
    }

    public void setNeedRange(Integer needRange) {
        this.needRange = needRange;
    }

    public String getExternalModuleName() {
        return externalModuleName;
    }

    public void setExternalModuleName(String externalModuleName) {
        this.externalModuleName = externalModuleName;
    }

    public Integer getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(Integer shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getMaxWidth() {
        return maxWidth;
    }

    public void setMaxWidth(Integer maxWidth) {
        this.maxWidth = maxWidth;
    }

    public Integer getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(Integer maxHeight) {
        this.maxHeight = maxHeight;
    }

    public Integer getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(Integer maxDepth) {
        this.maxDepth = maxDepth;
    }

    public BigDecimal getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(BigDecimal maxWeight) {
        this.maxWeight = maxWeight;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

}

