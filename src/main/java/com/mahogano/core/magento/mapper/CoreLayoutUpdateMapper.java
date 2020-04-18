package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CoreLayoutUpdate;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CoreLayoutUpdateMapper implements RowMapper<CoreLayoutUpdate> {

    @Override
    public CoreLayoutUpdate mapRow(ResultSet rs, int i) throws SQLException {
        CoreLayoutUpdate coreLayoutUpdate = new CoreLayoutUpdate();
        coreLayoutUpdate.setLayoutUpdateId(rs.getInt("layout_update_id"));
        coreLayoutUpdate.setHandle(rs.getString("handle"));
        coreLayoutUpdate.setXml(rs.getString("xml"));
        coreLayoutUpdate.setSortOrder(rs.getInt("sort_order"));
        return coreLayoutUpdate;
    }

}

