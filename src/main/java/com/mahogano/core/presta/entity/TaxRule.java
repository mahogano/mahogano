package com.mahogano.core.presta.entity;


public class TaxRule {

    private Integer idTaxRule;

    private Integer idTaxRulesGroup;

    private Integer idCountry;

    private Integer idState;

    private String zipcodeFrom;

    private String zipcodeTo;

    private Integer idTax;

    private Integer behavior;

    private String description;

    public Integer getIdTaxRule() {
        return idTaxRule;
    }

    public void setIdTaxRule(Integer idTaxRule) {
        this.idTaxRule = idTaxRule;
    }

    public Integer getIdTaxRulesGroup() {
        return idTaxRulesGroup;
    }

    public void setIdTaxRulesGroup(Integer idTaxRulesGroup) {
        this.idTaxRulesGroup = idTaxRulesGroup;
    }

    public Integer getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Integer idCountry) {
        this.idCountry = idCountry;
    }

    public Integer getIdState() {
        return idState;
    }

    public void setIdState(Integer idState) {
        this.idState = idState;
    }

    public String getZipcodeFrom() {
        return zipcodeFrom;
    }

    public void setZipcodeFrom(String zipcodeFrom) {
        this.zipcodeFrom = zipcodeFrom;
    }

    public String getZipcodeTo() {
        return zipcodeTo;
    }

    public void setZipcodeTo(String zipcodeTo) {
        this.zipcodeTo = zipcodeTo;
    }

    public Integer getIdTax() {
        return idTax;
    }

    public void setIdTax(Integer idTax) {
        this.idTax = idTax;
    }

    public Integer getBehavior() {
        return behavior;
    }

    public void setBehavior(Integer behavior) {
        this.behavior = behavior;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

