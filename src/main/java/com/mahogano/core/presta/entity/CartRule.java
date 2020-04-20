package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;
import java.math.BigDecimal;

public class CartRule {

    private Integer idCartRule;

    private Integer idCustomer;

    private LocalDateTime dateFrom;

    private LocalDateTime dateTo;

    private String description;

    private Integer quantity;

    private Integer quantityPerUser;

    private Integer priority;

    private Integer partialUse;

    private String code;

    private BigDecimal minimumAmount;

    private Integer minimumAmountTax;

    private Integer minimumAmountCurrency;

    private Integer minimumAmountShipping;

    private Integer countryRestriction;

    private Integer carrierRestriction;

    private Integer groupRestriction;

    private Integer cartRuleRestriction;

    private Integer productRestriction;

    private Integer shopRestriction;

    private Integer freeShipping;

    private BigDecimal reductionPercent;

    private BigDecimal reductionAmount;

    private Integer reductionTax;

    private Integer reductionCurrency;

    private Integer reductionProduct;

    private Integer reductionExcludeSpecial;

    private Integer giftProduct;

    private Integer giftProductAttribute;

    private Integer highlight;

    private Integer active;

    private LocalDateTime dateAdd;

    private LocalDateTime dateUpd;

    public Integer getIdCartRule() {
        return idCartRule;
    }

    public void setIdCartRule(Integer idCartRule) {
        this.idCartRule = idCartRule;
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public LocalDateTime getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDateTime dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDateTime getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDateTime dateTo) {
        this.dateTo = dateTo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantityPerUser() {
        return quantityPerUser;
    }

    public void setQuantityPerUser(Integer quantityPerUser) {
        this.quantityPerUser = quantityPerUser;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getPartialUse() {
        return partialUse;
    }

    public void setPartialUse(Integer partialUse) {
        this.partialUse = partialUse;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getMinimumAmount() {
        return minimumAmount;
    }

    public void setMinimumAmount(BigDecimal minimumAmount) {
        this.minimumAmount = minimumAmount;
    }

    public Integer getMinimumAmountTax() {
        return minimumAmountTax;
    }

    public void setMinimumAmountTax(Integer minimumAmountTax) {
        this.minimumAmountTax = minimumAmountTax;
    }

    public Integer getMinimumAmountCurrency() {
        return minimumAmountCurrency;
    }

    public void setMinimumAmountCurrency(Integer minimumAmountCurrency) {
        this.minimumAmountCurrency = minimumAmountCurrency;
    }

    public Integer getMinimumAmountShipping() {
        return minimumAmountShipping;
    }

    public void setMinimumAmountShipping(Integer minimumAmountShipping) {
        this.minimumAmountShipping = minimumAmountShipping;
    }

    public Integer getCountryRestriction() {
        return countryRestriction;
    }

    public void setCountryRestriction(Integer countryRestriction) {
        this.countryRestriction = countryRestriction;
    }

    public Integer getCarrierRestriction() {
        return carrierRestriction;
    }

    public void setCarrierRestriction(Integer carrierRestriction) {
        this.carrierRestriction = carrierRestriction;
    }

    public Integer getGroupRestriction() {
        return groupRestriction;
    }

    public void setGroupRestriction(Integer groupRestriction) {
        this.groupRestriction = groupRestriction;
    }

    public Integer getCartRuleRestriction() {
        return cartRuleRestriction;
    }

    public void setCartRuleRestriction(Integer cartRuleRestriction) {
        this.cartRuleRestriction = cartRuleRestriction;
    }

    public Integer getProductRestriction() {
        return productRestriction;
    }

    public void setProductRestriction(Integer productRestriction) {
        this.productRestriction = productRestriction;
    }

    public Integer getShopRestriction() {
        return shopRestriction;
    }

    public void setShopRestriction(Integer shopRestriction) {
        this.shopRestriction = shopRestriction;
    }

    public Integer getFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(Integer freeShipping) {
        this.freeShipping = freeShipping;
    }

    public BigDecimal getReductionPercent() {
        return reductionPercent;
    }

    public void setReductionPercent(BigDecimal reductionPercent) {
        this.reductionPercent = reductionPercent;
    }

    public BigDecimal getReductionAmount() {
        return reductionAmount;
    }

    public void setReductionAmount(BigDecimal reductionAmount) {
        this.reductionAmount = reductionAmount;
    }

    public Integer getReductionTax() {
        return reductionTax;
    }

    public void setReductionTax(Integer reductionTax) {
        this.reductionTax = reductionTax;
    }

    public Integer getReductionCurrency() {
        return reductionCurrency;
    }

    public void setReductionCurrency(Integer reductionCurrency) {
        this.reductionCurrency = reductionCurrency;
    }

    public Integer getReductionProduct() {
        return reductionProduct;
    }

    public void setReductionProduct(Integer reductionProduct) {
        this.reductionProduct = reductionProduct;
    }

    public Integer getReductionExcludeSpecial() {
        return reductionExcludeSpecial;
    }

    public void setReductionExcludeSpecial(Integer reductionExcludeSpecial) {
        this.reductionExcludeSpecial = reductionExcludeSpecial;
    }

    public Integer getGiftProduct() {
        return giftProduct;
    }

    public void setGiftProduct(Integer giftProduct) {
        this.giftProduct = giftProduct;
    }

    public Integer getGiftProductAttribute() {
        return giftProductAttribute;
    }

    public void setGiftProductAttribute(Integer giftProductAttribute) {
        this.giftProductAttribute = giftProductAttribute;
    }

    public Integer getHighlight() {
        return highlight;
    }

    public void setHighlight(Integer highlight) {
        this.highlight = highlight;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
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

}

