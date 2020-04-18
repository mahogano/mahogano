package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.DataflowImportData;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataflowImportDataMapper implements RowMapper<DataflowImportData> {

    @Override
    public DataflowImportData mapRow(ResultSet rs, int i) throws SQLException {
        DataflowImportData dataflowImportData = new DataflowImportData();
        dataflowImportData.setImportId(rs.getInt("import_id"));
        dataflowImportData.setSessionId(rs.getInt("session_id"));
        dataflowImportData.setSerialNumber(rs.getInt("serial_number"));
        dataflowImportData.setValue(rs.getString("value"));
        dataflowImportData.setStatus(rs.getInt("status"));
        return dataflowImportData;
    }

}

