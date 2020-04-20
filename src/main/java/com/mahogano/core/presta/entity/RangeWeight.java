package com.mahogano.core.presta.entity;

import java.math.BigDecimal;

public class RangeWeight {

    private Integer idRangeWeight;

    private Integer idCarrier;

    private BigDecimal delimiter1;

    private BigDecimal delimiter2;

    public Integer getIdRangeWeight() {
        return idRangeWeight;
    }

    public void setIdRangeWeight(Integer idRangeWeight) {
        this.idRangeWeight = idRangeWeight;
    }

    public Integer getIdCarrier() {
        return idCarrier;
    }

    public void setIdCarrier(Integer idCarrier) {
        this.idCarrier = idCarrier;
    }

    public BigDecimal getDelimiter1() {
        return delimiter1;
    }

    public void setDelimiter1(BigDecimal delimiter1) {
        this.delimiter1 = delimiter1;
    }

    public BigDecimal getDelimiter2() {
        return delimiter2;
    }

    public void setDelimiter2(BigDecimal delimiter2) {
        this.delimiter2 = delimiter2;
    }

}

