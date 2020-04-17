package com.mahogano.core.magento.entity;

public class CatalogCompareItem {

    private Integer catalogCompareItemId;

    private Integer visitorId;

    private Integer customerId;

    private Integer productId;

    private Integer storeId;

    public Integer getCatalogCompareItemId() {
        return catalogCompareItemId;
    }

    public void setCatalogCompareItemId(Integer catalogCompareItemId) {
        this.catalogCompareItemId = catalogCompareItemId;
    }

    public Integer getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(Integer visitorId) {
        this.visitorId = visitorId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

}

