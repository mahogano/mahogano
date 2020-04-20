package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class SupplyOrderHistory {

    private Integer idSupplyOrderHistory;

    private Integer idSupplyOrder;

    private Integer idEmployee;

    private String employeeLastname;

    private String employeeFirstname;

    private Integer idState;

    private LocalDateTime dateAdd;

    public Integer getIdSupplyOrderHistory() {
        return idSupplyOrderHistory;
    }

    public void setIdSupplyOrderHistory(Integer idSupplyOrderHistory) {
        this.idSupplyOrderHistory = idSupplyOrderHistory;
    }

    public Integer getIdSupplyOrder() {
        return idSupplyOrder;
    }

    public void setIdSupplyOrder(Integer idSupplyOrder) {
        this.idSupplyOrder = idSupplyOrder;
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

    public Integer getIdState() {
        return idState;
    }

    public void setIdState(Integer idState) {
        this.idState = idState;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }

}

