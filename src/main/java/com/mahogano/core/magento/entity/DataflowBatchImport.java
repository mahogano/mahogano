package com.mahogano.core.magento.entity;

public class DataflowBatchImport {

    private Long batchImportId;

    private Integer batchId;

    private String batchData;

    private Integer status;

    public Long getBatchImportId() {
        return batchImportId;
    }

    public void setBatchImportId(Long batchImportId) {
        this.batchImportId = batchImportId;
    }

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    public String getBatchData() {
        return batchData;
    }

    public void setBatchData(String batchData) {
        this.batchData = batchData;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}

