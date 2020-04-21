package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class SupplyOrderReceiptHistory {

    private Integer idSupplyOrderReceiptHistory;

    private Integer idSupplyOrderDetail;

    private Integer idEmployee;

    private String employeeLastname;

    private String employeeFirstname;

    private Integer idSupplyOrderState;

    private Integer quantity;

    private LocalDateTime dateAdd;

    public Integer getIdSupplyOrderReceiptHistory() {
        return idSupplyOrderReceiptHistory;
    }

    public void setIdSupplyOrderReceiptHistory(Integer idSupplyOrderReceiptHistory) {
        this.idSupplyOrderReceiptHistory = idSupplyOrderReceiptHistory;
    }

    public Integer getIdSupplyOrderDetail() {
        return idSupplyOrderDetail;
    }

    public void setIdSupplyOrderDetail(Integer idSupplyOrderDetail) {
        this.idSupplyOrderDetail = idSupplyOrderDetail;
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

    public Integer getIdSupplyOrderState() {
        return idSupplyOrderState;
    }

    public void setIdSupplyOrderState(Integer idSupplyOrderState) {
        this.idSupplyOrderState = idSupplyOrderState;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }

}

