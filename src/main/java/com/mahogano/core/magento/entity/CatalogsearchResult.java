package com.mahogano.core.magento.entity;

import java.math.BigDecimal;

public class CatalogsearchResult {

    private Integer queryId;

    private Integer productId;

    private BigDecimal relevance;

    public Integer getQueryId() {
        return queryId;
    }

    public void setQueryId(Integer queryId) {
        this.queryId = queryId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public BigDecimal getRelevance() {
        return relevance;
    }

    public void setRelevance(BigDecimal relevance) {
        this.relevance = relevance;
    }

}

