package com.mahogano.core.magento.entity;

public class DataflowBatchExport {

    private Long batchExportId;

    private Integer batchId;

    private String batchData;

    private Integer status;

    public Long getBatchExportId() {
        return batchExportId;
    }

    public void setBatchExportId(Long batchExportId) {
        this.batchExportId = batchExportId;
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

