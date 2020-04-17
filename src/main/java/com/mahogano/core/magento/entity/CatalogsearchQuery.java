package com.mahogano.core.magento.entity;

import java.time.LocalDateTime;

public class CatalogsearchQuery {

    private Integer queryId;

    private String queryText;

    private Integer numResults;

    private Integer popularity;

    private String redirect;

    private String synonymFor;

    private Integer storeId;

    private Integer displayInTerms;

    private Integer isActive;

    private Integer isProcessed;

    private LocalDateTime updatedAt;

    public Integer getQueryId() {
        return queryId;
    }

    public void setQueryId(Integer queryId) {
        this.queryId = queryId;
    }

    public String getQueryText() {
        return queryText;
    }

    public void setQueryText(String queryText) {
        this.queryText = queryText;
    }

    public Integer getNumResults() {
        return numResults;
    }

    public void setNumResults(Integer numResults) {
        this.numResults = numResults;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public String getRedirect() {
        return redirect;
    }

    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }

    public String getSynonymFor() {
        return synonymFor;
    }

    public void setSynonymFor(String synonymFor) {
        this.synonymFor = synonymFor;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getDisplayInTerms() {
        return displayInTerms;
    }

    public void setDisplayInTerms(Integer displayInTerms) {
        this.displayInTerms = displayInTerms;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Integer getIsProcessed() {
        return isProcessed;
    }

    public void setIsProcessed(Integer isProcessed) {
        this.isProcessed = isProcessed;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

}

