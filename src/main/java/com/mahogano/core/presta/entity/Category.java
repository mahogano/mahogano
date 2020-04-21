package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class Category {

    private Integer idCategory;

    private Integer idParent;

    private Integer idShopDefault;

    private Integer levelDepth;

    private Integer nleft;

    private Integer nright;

    private Integer active;

    private LocalDateTime dateAdd;

    private LocalDateTime dateUpd;

    private Integer position;

    private Integer isRootCategory;

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public Integer getIdParent() {
        return idParent;
    }

    public void setIdParent(Integer idParent) {
        this.idParent = idParent;
    }

    public Integer getIdShopDefault() {
        return idShopDefault;
    }

    public void setIdShopDefault(Integer idShopDefault) {
        this.idShopDefault = idShopDefault;
    }

    public Integer getLevelDepth() {
        return levelDepth;
    }

    public void setLevelDepth(Integer levelDepth) {
        this.levelDepth = levelDepth;
    }

    public Integer getNleft() {
        return nleft;
    }

    public void setNleft(Integer nleft) {
        this.nleft = nleft;
    }

    public Integer getNright() {
        return nright;
    }

    public void setNright(Integer nright) {
        this.nright = nright;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }

    public LocalDateTime getDateUpd() {
        return dateUpd;
    }

    public void setDateUpd(LocalDateTime dateUpd) {
        this.dateUpd = dateUpd;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getIsRootCategory() {
        return isRootCategory;
    }

    public void setIsRootCategory(Integer isRootCategory) {
        this.isRootCategory = isRootCategory;
    }

}

