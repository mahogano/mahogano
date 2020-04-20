package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class CmsCategory {

    private Integer idCmsCategory;

    private Integer idParent;

    private Integer levelDepth;

    private Integer active;

    private LocalDateTime dateAdd;

    private LocalDateTime dateUpd;

    private Integer position;

    public Integer getIdCmsCategory() {
        return idCmsCategory;
    }

    public void setIdCmsCategory(Integer idCmsCategory) {
        this.idCmsCategory = idCmsCategory;
    }

    public Integer getIdParent() {
        return idParent;
    }

    public void setIdParent(Integer idParent) {
        this.idParent = idParent;
    }

    public Integer getLevelDepth() {
        return levelDepth;
    }

    public void setLevelDepth(Integer levelDepth) {
        this.levelDepth = levelDepth;
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

}

