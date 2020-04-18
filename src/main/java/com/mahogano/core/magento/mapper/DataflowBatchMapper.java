package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.DataflowBatch;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataflowBatchMapper implements RowMapper<DataflowBatch> {

    @Override
    public DataflowBatch mapRow(ResultSet rs, int i) throws SQLException {
        DataflowBatch dataflowBatch = new DataflowBatch();
        dataflowBatch.setBatchId(rs.getInt("batch_id"));
        dataflowBatch.setProfileId(rs.getInt("profile_id"));
        dataflowBatch.setStoreId(rs.getInt("store_id"));
        dataflowBatch.setAdapter(rs.getString("adapter"));
        dataflowBatch.setParams(rs.getString("params"));
        dataflowBatch.setCreatedAt(rs.getTimestamp("created_at") != null ? rs.getTimestamp("created_at").toLocalDateTime() : null);
        return dataflowBatch;
    }

}

