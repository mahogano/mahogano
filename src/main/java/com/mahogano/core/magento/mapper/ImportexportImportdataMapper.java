package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.ImportexportImportdata;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ImportexportImportdataMapper implements RowMapper<ImportexportImportdata> {

    @Override
    public ImportexportImportdata mapRow(ResultSet rs, int i) throws SQLException {
        ImportexportImportdata importexportImportdata = new ImportexportImportdata();
        importexportImportdata.setId(rs.getInt("id"));
        importexportImportdata.setEntity(rs.getString("entity"));
        importexportImportdata.setBehavior(rs.getString("behavior"));
        importexportImportdata.setData(rs.getString("data"));
        return importexportImportdata;
    }

}

