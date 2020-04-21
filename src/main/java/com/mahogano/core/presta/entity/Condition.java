package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class Condition {

    private Integer idCondition;

    private Integer idPsCondition;

    private String type;

    private String request;

    private String operator;

    private String value;

    private String result;

    private String calculationType;

    private String calculationDetail;

    private Integer validated;

    private LocalDateTime dateAdd;

    private LocalDateTime dateUpd;

    public Integer getIdCondition() {
        return idCondition;
    }

    public void setIdCondition(Integer idCondition) {
        this.idCondition = idCondition;
    }

    public Integer getIdPsCondition() {
        return idPsCondition;
    }

    public void setIdPsCondition(Integer idPsCondition) {
        this.idPsCondition = idPsCondition;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getCalculationType() {
        return calculationType;
    }

    public void setCalculationType(String calculationType) {
        this.calculationType = calculationType;
    }

    public String getCalculationDetail() {
        return calculationDetail;
    }

    public void setCalculationDetail(String calculationDetail) {
        this.calculationDetail = calculationDetail;
    }

    public Integer getValidated() {
        return validated;
    }

    public void setValidated(Integer validated) {
        this.validated = validated;
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

