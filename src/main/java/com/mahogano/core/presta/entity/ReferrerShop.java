package com.mahogano.core.presta.entity;

import java.math.BigDecimal;

public class ReferrerShop {

    private Integer idReferrer;

    private Integer idShop;

    private Integer cacheVisitors;

    private Integer cacheVisits;

    private Integer cachePages;

    private Integer cacheRegistrations;

    private Integer cacheOrders;

    private BigDecimal cacheSales;

    private BigDecimal cacheRegRate;

    private BigDecimal cacheOrderRate;

    public Integer getIdReferrer() {
        return idReferrer;
    }

    public void setIdReferrer(Integer idReferrer) {
        this.idReferrer = idReferrer;
    }

    public Integer getIdShop() {
        return idShop;
    }

    public void setIdShop(Integer idShop) {
        this.idShop = idShop;
    }

    public Integer getCacheVisitors() {
        return cacheVisitors;
    }

    public void setCacheVisitors(Integer cacheVisitors) {
        this.cacheVisitors = cacheVisitors;
    }

    public Integer getCacheVisits() {
        return cacheVisits;
    }

    public void setCacheVisits(Integer cacheVisits) {
        this.cacheVisits = cacheVisits;
    }

    public Integer getCachePages() {
        return cachePages;
    }

    public void setCachePages(Integer cachePages) {
        this.cachePages = cachePages;
    }

    public Integer getCacheRegistrations() {
        return cacheRegistrations;
    }

    public void setCacheRegistrations(Integer cacheRegistrations) {
        this.cacheRegistrations = cacheRegistrations;
    }

    public Integer getCacheOrders() {
        return cacheOrders;
    }

    public void setCacheOrders(Integer cacheOrders) {
        this.cacheOrders = cacheOrders;
    }

    public BigDecimal getCacheSales() {
        return cacheSales;
    }

    public void setCacheSales(BigDecimal cacheSales) {
        this.cacheSales = cacheSales;
    }

    public BigDecimal getCacheRegRate() {
        return cacheRegRate;
    }

    public void setCacheRegRate(BigDecimal cacheRegRate) {
        this.cacheRegRate = cacheRegRate;
    }

    public BigDecimal getCacheOrderRate() {
        return cacheOrderRate;
    }

    public void setCacheOrderRate(BigDecimal cacheOrderRate) {
        this.cacheOrderRate = cacheOrderRate;
    }

}

