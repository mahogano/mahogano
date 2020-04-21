package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class Sekeyword {

    private Integer idSekeyword;

    private Integer idShop;

    private Integer idShopGroup;

    private String keyword;

    private LocalDateTime dateAdd;

    public Integer getIdSekeyword() {
        return idSekeyword;
    }

    public void setIdSekeyword(Integer idSekeyword) {
        this.idSekeyword = idSekeyword;
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

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }

}

