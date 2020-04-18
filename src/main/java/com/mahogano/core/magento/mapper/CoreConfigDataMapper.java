package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CoreConfigData;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CoreConfigDataMapper implements RowMapper<CoreConfigData> {

    @Override
    public CoreConfigData mapRow(ResultSet rs, int i) throws SQLException {
        CoreConfigData coreConfigData = new CoreConfigData();
        coreConfigData.setConfigId(rs.getInt("config_id"));
        coreConfigData.setScope(rs.getString("scope"));
        coreConfigData.setScopeId(rs.getInt("scope_id"));
        coreConfigData.setPath(rs.getString("path"));
        coreConfigData.setValue(rs.getString("value"));
        coreConfigData.setUpdatedAt(rs.getTimestamp("updated_at").toLocalDateTime());
        return coreConfigData;
    }

}

