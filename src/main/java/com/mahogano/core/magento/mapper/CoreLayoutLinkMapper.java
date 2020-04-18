package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CoreLayoutLink;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CoreLayoutLinkMapper implements RowMapper<CoreLayoutLink> {

    @Override
    public CoreLayoutLink mapRow(ResultSet rs, int i) throws SQLException {
        CoreLayoutLink coreLayoutLink = new CoreLayoutLink();
        coreLayoutLink.setLayoutLinkId(rs.getInt("layout_link_id"));
        coreLayoutLink.setStoreId(rs.getInt("store_id"));
        coreLayoutLink.setArea(rs.getString("area"));
        coreLayoutLink.setPackageVariable(rs.getString("package"));
        coreLayoutLink.setTheme(rs.getString("theme"));
        coreLayoutLink.setLayoutUpdateId(rs.getInt("layout_update_id"));
        return coreLayoutLink;
    }

}

