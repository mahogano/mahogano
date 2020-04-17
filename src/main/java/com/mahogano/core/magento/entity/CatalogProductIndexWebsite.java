package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class CatalogProductIndexWebsite {

    private Integer websiteId;

    private LocalDateTime websiteDate;

    private Float rate;

    public Integer getWebsiteId() {
        return websiteId;
    }

    public void setWebsiteId(Integer websiteId) {
        this.websiteId = websiteId;
    }

    public LocalDateTime getWebsiteDate() {
        return websiteDate;
    }

    public void setWebsiteDate(LocalDateTime websiteDate) {
        this.websiteDate = websiteDate;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

}

