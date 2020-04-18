package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.DirectoryCountryRegionName;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DirectoryCountryRegionNameMapper implements RowMapper<DirectoryCountryRegionName> {

    @Override
    public DirectoryCountryRegionName mapRow(ResultSet rs, int i) throws SQLException {
        DirectoryCountryRegionName directoryCountryRegionName = new DirectoryCountryRegionName();
        directoryCountryRegionName.setLocale(rs.getString("locale"));
        directoryCountryRegionName.setRegionId(rs.getInt("region_id"));
        directoryCountryRegionName.setName(rs.getString("name"));
        return directoryCountryRegionName;
    }

}

