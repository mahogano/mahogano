package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class LayeredFilter {

    private Integer idLayeredFilter;

    private String name;

    private String filters;

    private Integer nCategories;

    private LocalDateTime dateAdd;

    public Integer getIdLayeredFilter() {
        return idLayeredFilter;
    }

    public void setIdLayeredFilter(Integer idLayeredFilter) {
        this.idLayeredFilter = idLayeredFilter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilters() {
        return filters;
    }

    public void setFilters(String filters) {
        this.filters = filters;
    }

    public Integer getNCategories() {
        return nCategories;
    }

    public void setNCategories(Integer nCategories) {
        this.nCategories = nCategories;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }

}

