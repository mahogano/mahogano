package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;
import java.math.BigDecimal;

public class StockMvt {

    private Long idStockMvt;

    private Integer idStock;

    private Integer idOrder;

    private Integer idSupplyOrder;

    private Integer idStockMvtReason;

    private Integer idEmployee;

    private String employeeLastname;

    private String employeeFirstname;

    private Integer physicalQuantity;

    private LocalDateTime dateAdd;

    private Integer sign;

    private BigDecimal priceTe;

    private BigDecimal lastWa;

    private BigDecimal currentWa;

    private Long referer;

    public Long getIdStockMvt() {
        return idStockMvt;
    }

    public void setIdStockMvt(Long idStockMvt) {
        this.idStockMvt = idStockMvt;
    }

    public Integer getIdStock() {
        return idStock;
    }

    public void setIdStock(Integer idStock) {
        this.idStock = idStock;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Integer getIdSupplyOrder() {
        return idSupplyOrder;
    }

    public void setIdSupplyOrder(Integer idSupplyOrder) {
        this.idSupplyOrder = idSupplyOrder;
    }

    public Integer getIdStockMvtReason() {
        return idStockMvtReason;
    }

    public void setIdStockMvtReason(Integer idStockMvtReason) {
        this.idStockMvtReason = idStockMvtReason;
    }

    public Integer getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getEmployeeLastname() {
        return employeeLastname;
    }

    public void setEmployeeLastname(String employeeLastname) {
        this.employeeLastname = employeeLastname;
    }

    public String getEmployeeFirstname() {
        return employeeFirstname;
    }

    public void setEmployeeFirstname(String employeeFirstname) {
        this.employeeFirstname = employeeFirstname;
    }

    public Integer getPhysicalQuantity() {
        return physicalQuantity;
    }

    public void setPhysicalQuantity(Integer physicalQuantity) {
        this.physicalQuantity = physicalQuantity;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }

    public Integer getSign() {
        return sign;
    }

    public void setSign(Integer sign) {
        this.sign = sign;
    }

    public BigDecimal getPriceTe() {
        return priceTe;
    }

    public void setPriceTe(BigDecimal priceTe) {
        this.priceTe = priceTe;
    }

    public BigDecimal getLastWa() {
        return lastWa;
    }

    public void setLastWa(BigDecimal lastWa) {
        this.lastWa = lastWa;
    }

    public BigDecimal getCurrentWa() {
        return currentWa;
    }

    public void setCurrentWa(BigDecimal currentWa) {
        this.currentWa = currentWa;
    }

    public Long getReferer() {
        return referer;
    }

    public void setReferer(Long referer) {
        this.referer = referer;
    }

}

