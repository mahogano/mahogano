package com.mahogano.core.magento.entity;

public class SalesruleCustomer {

    private Integer ruleCustomerId;

    private Integer ruleId;

    private Integer customerId;

    private Integer timesUsed;

    public Integer getRuleCustomerId() {
        return ruleCustomerId;
    }

    public void setRuleCustomerId(Integer ruleCustomerId) {
        this.ruleCustomerId = ruleCustomerId;
    }

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getTimesUsed() {
        return timesUsed;
    }

    public void setTimesUsed(Integer timesUsed) {
        this.timesUsed = timesUsed;
    }

}

