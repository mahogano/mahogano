package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class Emailsubscription {

    private Integer id;

    private Integer idShop;

    private Integer idShopGroup;

    private String email;

    private LocalDateTime newsletterDateAdd;

    private String ipRegistrationNewsletter;

    private String httpReferer;

    private Integer active;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getNewsletterDateAdd() {
        return newsletterDateAdd;
    }

    public void setNewsletterDateAdd(LocalDateTime newsletterDateAdd) {
        this.newsletterDateAdd = newsletterDateAdd;
    }

    public String getIpRegistrationNewsletter() {
        return ipRegistrationNewsletter;
    }

    public void setIpRegistrationNewsletter(String ipRegistrationNewsletter) {
        this.ipRegistrationNewsletter = ipRegistrationNewsletter;
    }

    public String getHttpReferer() {
        return httpReferer;
    }

    public void setHttpReferer(String httpReferer) {
        this.httpReferer = httpReferer;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

}

