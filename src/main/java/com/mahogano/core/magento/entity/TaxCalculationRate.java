package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

public class TaxCalculationRate {

    private Integer taxCalculationRateId;

    private String taxCountryId;

    private Integer taxRegionId;

    private String taxPostcode;

    private String code;

    private BigDecimal rate;

    private Integer zipIsRange;

    private Integer zipFrom;

    private Integer zipTo;

    public Integer getTaxCalculationRateId() {
        return taxCalculationRateId;
    }

    public void setTaxCalculationRateId(Integer taxCalculationRateId) {
        this.taxCalculationRateId = taxCalculationRateId;
    }

    public String getTaxCountryId() {
        return taxCountryId;
    }

    public void setTaxCountryId(String taxCountryId) {
        this.taxCountryId = taxCountryId;
    }

    public Integer getTaxRegionId() {
        return taxRegionId;
    }

    public void setTaxRegionId(Integer taxRegionId) {
        this.taxRegionId = taxRegionId;
    }

    public String getTaxPostcode() {
        return taxPostcode;
    }

    public void setTaxPostcode(String taxPostcode) {
        this.taxPostcode = taxPostcode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Integer getZipIsRange() {
        return zipIsRange;
    }

    public void setZipIsRange(Integer zipIsRange) {
        this.zipIsRange = zipIsRange;
    }

    public Integer getZipFrom() {
        return zipFrom;
    }

    public void setZipFrom(Integer zipFrom) {
        this.zipFrom = zipFrom;
    }

    public Integer getZipTo() {
        return zipTo;
    }

    public void setZipTo(Integer zipTo) {
        this.zipTo = zipTo;
    }

}

