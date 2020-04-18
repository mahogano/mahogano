package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CoreResource;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CoreResourceMapper implements RowMapper<CoreResource> {

    @Override
    public CoreResource mapRow(ResultSet rs, int i) throws SQLException {
        CoreResource coreResource = new CoreResource();
        coreResource.setCode(rs.getString("code"));
        coreResource.setVersion(rs.getString("version"));
        coreResource.setDataVersion(rs.getString("data_version"));
        return coreResource;
    }

}

