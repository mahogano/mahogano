package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.DirectoryCountryFormat;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DirectoryCountryFormatMapper implements RowMapper<DirectoryCountryFormat> {

    @Override
    public DirectoryCountryFormat mapRow(ResultSet rs, int i) throws SQLException {
        DirectoryCountryFormat directoryCountryFormat = new DirectoryCountryFormat();
        directoryCountryFormat.setCountryFormatId(rs.getInt("country_format_id"));
        directoryCountryFormat.setCountryId(rs.getString("country_id"));
        directoryCountryFormat.setType(rs.getString("type"));
        directoryCountryFormat.setFormat(rs.getString("format"));
        return directoryCountryFormat;
    }

}

