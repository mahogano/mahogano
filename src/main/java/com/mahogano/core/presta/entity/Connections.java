package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class Connections {

    private Integer idConnections;

    private Integer idShopGroup;

    private Integer idShop;

    private Integer idGuest;

    private Integer idPage;

    private Long ipAddress;

    private LocalDateTime dateAdd;

    private String httpReferer;

    public Integer getIdConnections() {
        return idConnections;
    }

    public void setIdConnections(Integer idConnections) {
        this.idConnections = idConnections;
    }

    public Integer getIdShopGroup() {
        return idShopGroup;
    }

    public void setIdShopGroup(Integer idShopGroup) {
        this.idShopGroup = idShopGroup;
    }

    public Integer getIdShop() {
        return idShop;
    }

    public void setIdShop(Integer idShop) {
        this.idShop = idShop;
    }

    public Integer getIdGuest() {
        return idGuest;
    }

    public void setIdGuest(Integer idGuest) {
        this.idGuest = idGuest;
    }

    public Integer getIdPage() {
        return idPage;
    }

    public void setIdPage(Integer idPage) {
        this.idPage = idPage;
    }

    public Long getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(Long ipAddress) {
        this.ipAddress = ipAddress;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }

    public String getHttpReferer() {
        return httpReferer;
    }

    public void setHttpReferer(String httpReferer) {
        this.httpReferer = httpReferer;
    }

}

