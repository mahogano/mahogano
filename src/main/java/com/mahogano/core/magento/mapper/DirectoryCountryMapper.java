package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.DirectoryCountry;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DirectoryCountryMapper implements RowMapper<DirectoryCountry> {

    @Override
    public DirectoryCountry mapRow(ResultSet rs, int i) throws SQLException {
        DirectoryCountry directoryCountry = new DirectoryCountry();
        directoryCountry.setCountryId(rs.getString("country_id"));
        directoryCountry.setIso2Code(rs.getString("iso2_code"));
        directoryCountry.setIso3Code(rs.getString("iso3_code"));
        return directoryCountry;
    }

}

