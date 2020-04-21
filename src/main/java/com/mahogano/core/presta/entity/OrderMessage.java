package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class OrderMessage {

    private Integer idOrderMessage;

    private LocalDateTime dateAdd;

    public Integer getIdOrderMessage() {
        return idOrderMessage;
    }

    public void setIdOrderMessage(Integer idOrderMessage) {
        this.idOrderMessage = idOrderMessage;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }

}

