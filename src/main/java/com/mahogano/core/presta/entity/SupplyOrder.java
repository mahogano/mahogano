package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;
import java.math.BigDecimal;

public class SupplyOrder {

    private Integer idSupplyOrder;

    private Integer idSupplier;

    private String supplierName;

    private Integer idLang;

    private Integer idWarehouse;

    private Integer idSupplyOrderState;

    private Integer idCurrency;

    private Integer idRefCurrency;

    private String reference;

    private LocalDateTime dateAdd;

    private LocalDateTime dateUpd;

    private LocalDateTime dateDeliveryExpected;

    private BigDecimal totalTe;

    private BigDecimal totalWithDiscountTe;

    private BigDecimal totalTax;

    private BigDecimal totalTi;

    private BigDecimal discountRate;

    private BigDecimal discountValueTe;

    private Integer isTemplate;

    public Integer getIdSupplyOrder() {
        return idSupplyOrder;
    }

    public void setIdSupplyOrder(Integer idSupplyOrder) {
        this.idSupplyOrder = idSupplyOrder;
    }

    public Integer getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(Integer idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Integer getIdLang() {
        return idLang;
    }

    public void setIdLang(Integer idLang) {
        this.idLang = idLang;
    }

    public Integer getIdWarehouse() {
        return idWarehouse;
    }

    public void setIdWarehouse(Integer idWarehouse) {
        this.idWarehouse = idWarehouse;
    }

    public Integer getIdSupplyOrderState() {
        return idSupplyOrderState;
    }

    public void setIdSupplyOrderState(Integer idSupplyOrderState) {
        this.idSupplyOrderState = idSupplyOrderState;
    }

    public Integer getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(Integer idCurrency) {
        this.idCurrency = idCurrency;
    }

    public Integer getIdRefCurrency() {
        return idRefCurrency;
    }

    public void setIdRefCurrency(Integer idRefCurrency) {
        this.idRefCurrency = idRefCurrency;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
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

    public LocalDateTime getDateDeliveryExpected() {
        return dateDeliveryExpected;
    }

    public void setDateDeliveryExpected(LocalDateTime dateDeliveryExpected) {
        this.dateDeliveryExpected = dateDeliveryExpected;
    }

    public BigDecimal getTotalTe() {
        return totalTe;
    }

    public void setTotalTe(BigDecimal totalTe) {
        this.totalTe = totalTe;
    }

    public BigDecimal getTotalWithDiscountTe() {
        return totalWithDiscountTe;
    }

    public void setTotalWithDiscountTe(BigDecimal totalWithDiscountTe) {
        this.totalWithDiscountTe = totalWithDiscountTe;
    }

    public BigDecimal getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(BigDecimal totalTax) {
        this.totalTax = totalTax;
    }

    public BigDecimal getTotalTi() {
        return totalTi;
    }

    public void setTotalTi(BigDecimal totalTi) {
        this.totalTi = totalTi;
    }

    public BigDecimal getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(BigDecimal discountRate) {
        this.discountRate = discountRate;
    }

    public BigDecimal getDiscountValueTe() {
        return discountValueTe;
    }

    public void setDiscountValueTe(BigDecimal discountValueTe) {
        this.discountValueTe = discountValueTe;
    }

    public Integer getIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(Integer isTemplate) {
        this.isTemplate = isTemplate;
    }

}

