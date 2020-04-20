package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class Pagenotfound {

    private Integer idPagenotfound;

    private Integer idShop;

    private Integer idShopGroup;

    private String requestUri;

    private String httpReferer;

    private LocalDateTime dateAdd;

    public Integer getIdPagenotfound() {
        return idPagenotfound;
    }

    public void setIdPagenotfound(Integer idPagenotfound) {
        this.idPagenotfound = idPagenotfound;
    }

    public Integer getIdShop() {
        return idShop;
    }

    public void setIdShop(Integer idShop) {
        this.idShop = idShop;
    }

    public Integer getIdShopGroup() {
        return idShopGroup;
    }

    public void setIdShopGroup(Integer idShopGroup) {
        this.idShopGroup = idShopGroup;
    }

    public String getRequestUri() {
        return requestUri;
    }

    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri;
    }

    public String getHttpReferer() {
        return httpReferer;
    }

    public void setHttpReferer(String httpReferer) {
        this.httpReferer = httpReferer;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }

}

