package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class OrderHistory {

    private Integer idOrderHistory;

    private Integer idEmployee;

    private Integer idOrder;

    private Integer idOrderState;

    private LocalDateTime dateAdd;

    public Integer getIdOrderHistory() {
        return idOrderHistory;
    }

    public void setIdOrderHistory(Integer idOrderHistory) {
        this.idOrderHistory = idOrderHistory;
    }

    public Integer getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Integer getIdOrderState() {
        return idOrderState;
    }

    public void setIdOrderState(Integer idOrderState) {
        this.idOrderState = idOrderState;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }

}

