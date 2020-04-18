package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.DirectoryCountryRegion;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DirectoryCountryRegionMapper implements RowMapper<DirectoryCountryRegion> {

    @Override
    public DirectoryCountryRegion mapRow(ResultSet rs, int i) throws SQLException {
        DirectoryCountryRegion directoryCountryRegion = new DirectoryCountryRegion();
        directoryCountryRegion.setRegionId(rs.getInt("region_id"));
        directoryCountryRegion.setCountryId(rs.getString("country_id"));
        directoryCountryRegion.setCode(rs.getString("code"));
        directoryCountryRegion.setDefaultName(rs.getString("default_name"));
        return directoryCountryRegion;
    }

}

