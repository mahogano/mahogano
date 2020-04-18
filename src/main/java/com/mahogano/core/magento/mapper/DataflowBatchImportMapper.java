package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.DataflowBatchImport;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataflowBatchImportMapper implements RowMapper<DataflowBatchImport> {

    @Override
    public DataflowBatchImport mapRow(ResultSet rs, int i) throws SQLException {
        DataflowBatchImport dataflowBatchImport = new DataflowBatchImport();
        dataflowBatchImport.setBatchImportId(rs.getLong("batch_import_id"));
        dataflowBatchImport.setBatchId(rs.getInt("batch_id"));
        dataflowBatchImport.setBatchData(rs.getString("batch_data"));
        dataflowBatchImport.setStatus(rs.getInt("status"));
        return dataflowBatchImport;
    }

}

