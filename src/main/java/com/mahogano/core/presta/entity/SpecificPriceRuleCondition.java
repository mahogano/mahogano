package com.mahogano.core.presta.entity;


public class SpecificPriceRuleCondition {

    private Integer idSpecificPriceRuleCondition;

    private Integer idSpecificPriceRuleConditionGroup;

    private String type;

    private String value;

    public Integer getIdSpecificPriceRuleCondition() {
        return idSpecificPriceRuleCondition;
    }

    public void setIdSpecificPriceRuleCondition(Integer idSpecificPriceRuleCondition) {
        this.idSpecificPriceRuleCondition = idSpecificPriceRuleCondition;
    }

    public Integer getIdSpecificPriceRuleConditionGroup() {
        return idSpecificPriceRuleConditionGroup;
    }

    public void setIdSpecificPriceRuleConditionGroup(Integer idSpecificPriceRuleConditionGroup) {
        this.idSpecificPriceRuleConditionGroup = idSpecificPriceRuleConditionGroup;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}

