package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class OrderReturn {

    private Integer idOrderReturn;

    private Integer idCustomer;

    private Integer idOrder;

    private Integer state;

    private String question;

    private LocalDateTime dateAdd;

    private LocalDateTime dateUpd;

    public Integer getIdOrderReturn() {
        return idOrderReturn;
    }

    public void setIdOrderReturn(Integer idOrderReturn) {
        this.idOrderReturn = idOrderReturn;
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
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

