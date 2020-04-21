package com.mahogano.core.presta.entity;


public class ShopUrl {

    private Integer idShopUrl;

    private Integer idShop;

    private String domain;

    private String domainSsl;

    private String physicalUri;

    private String virtualUri;

    private Integer main;

    private Integer active;

    public Integer getIdShopUrl() {
        return idShopUrl;
    }

    public void setIdShopUrl(Integer idShopUrl) {
        this.idShopUrl = idShopUrl;
    }

    public Integer getIdShop() {
        return idShop;
    }

    public void setIdShop(Integer idShop) {
        this.idShop = idShop;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getDomainSsl() {
        return domainSsl;
    }

    public void setDomainSsl(String domainSsl) {
        this.domainSsl = domainSsl;
    }

    public String getPhysicalUri() {
        return physicalUri;
    }

    public void setPhysicalUri(String physicalUri) {
        this.physicalUri = physicalUri;
    }

    public String getVirtualUri() {
        return virtualUri;
    }

    public void setVirtualUri(String virtualUri) {
        this.virtualUri = virtualUri;
    }

    public Integer getMain() {
        return main;
    }

    public void setMain(Integer main) {
        this.main = main;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

}

