package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class Manufacturer {

    private Integer idManufacturer;

    private String name;

    private LocalDateTime dateAdd;

    private LocalDateTime dateUpd;

    private Integer active;

    public Integer getIdManufacturer() {
        return idManufacturer;
    }

    public void setIdManufacturer(Integer idManufacturer) {
        this.idManufacturer = idManufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

}

