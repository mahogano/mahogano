package com.mahogano.core.presta.entity;

import java.time.LocalDateTime;

public class ProductDownload {

    private Integer idProductDownload;

    private Integer idProduct;

    private String displayFilename;

    private String filename;

    private LocalDateTime dateAdd;

    private LocalDateTime dateExpiration;

    private Integer nbDaysAccessible;

    private Integer nbDownloadable;

    private Integer active;

    private Integer isShareable;

    public Integer getIdProductDownload() {
        return idProductDownload;
    }

    public void setIdProductDownload(Integer idProductDownload) {
        this.idProductDownload = idProductDownload;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getDisplayFilename() {
        return displayFilename;
    }

    public void setDisplayFilename(String displayFilename) {
        this.displayFilename = displayFilename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public LocalDateTime getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(LocalDateTime dateAdd) {
        this.dateAdd = dateAdd;
    }

    public LocalDateTime getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(LocalDateTime dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public Integer getNbDaysAccessible() {
        return nbDaysAccessible;
    }

    public void setNbDaysAccessible(Integer nbDaysAccessible) {
        this.nbDaysAccessible = nbDaysAccessible;
    }

    public Integer getNbDownloadable() {
        return nbDownloadable;
    }

    public void setNbDownloadable(Integer nbDownloadable) {
        this.nbDownloadable = nbDownloadable;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getIsShareable() {
        return isShareable;
    }

    public void setIsShareable(Integer isShareable) {
        this.isShareable = isShareable;
    }

}

