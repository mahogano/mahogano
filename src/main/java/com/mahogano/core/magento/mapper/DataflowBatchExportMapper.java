package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.DataflowBatchExport;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataflowBatchExportMapper implements RowMapper<DataflowBatchExport> {

    @Override
    public DataflowBatchExport mapRow(ResultSet rs, int i) throws SQLException {
        DataflowBatchExport dataflowBatchExport = new DataflowBatchExport();
        dataflowBatchExport.setBatchExportId(rs.getLong("batch_export_id"));
        dataflowBatchExport.setBatchId(rs.getInt("batch_id"));
        dataflowBatchExport.setBatchData(rs.getString("batch_data"));
        dataflowBatchExport.setStatus(rs.getInt("status"));
        return dataflowBatchExport;
    }

}

