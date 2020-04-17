package com.mahogano.core.magento.entity;

public class CatalogsearchFulltext {

    private Integer fulltextId;

    private Integer productId;

    private Integer storeId;

    private String dataIndex;

    public Integer getFulltextId() {
        return fulltextId;
    }

    public void setFulltextId(Integer fulltextId) {
        this.fulltextId = fulltextId;
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

    public String getDataIndex() {
        return dataIndex;
    }

    public void setDataIndex(String dataIndex) {
        this.dataIndex = dataIndex;
    }

}

