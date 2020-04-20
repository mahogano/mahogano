package com.mahogano.core.presta.entity;


public class ModulePreference {

    private Integer idModulePreference;

    private Integer idEmployee;

    private String module;

    private Integer interest;

    private Integer favorite;

    public Integer getIdModulePreference() {
        return idModulePreference;
    }

    public void setIdModulePreference(Integer idModulePreference) {
        this.idModulePreference = idModulePreference;
    }

    public Integer getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public Integer getInterest() {
        return interest;
    }

    public void setInterest(Integer interest) {
        this.interest = interest;
    }

    public Integer getFavorite() {
        return favorite;
    }

    public void setFavorite(Integer favorite) {
        this.favorite = favorite;
    }

}

