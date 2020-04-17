package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class Sitemap {

    private Integer sitemapId;

    private String sitemapType;

    private String sitemapFilename;

    private String sitemapPath;

    private LocalDateTime sitemapTime;

    private Integer storeId;

    public Integer getSitemapId() {
        return sitemapId;
    }

    public void setSitemapId(Integer sitemapId) {
        this.sitemapId = sitemapId;
    }

    public String getSitemapType() {
        return sitemapType;
    }

    public void setSitemapType(String sitemapType) {
        this.sitemapType = sitemapType;
    }

    public String getSitemapFilename() {
        return sitemapFilename;
    }

    public void setSitemapFilename(String sitemapFilename) {
        this.sitemapFilename = sitemapFilename;
    }

    public String getSitemapPath() {
        return sitemapPath;
    }

    public void setSitemapPath(String sitemapPath) {
        this.sitemapPath = sitemapPath;
    }

    public LocalDateTime getSitemapTime() {
        return sitemapTime;
    }

    public void setSitemapTime(LocalDateTime sitemapTime) {
        this.sitemapTime = sitemapTime;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

}

