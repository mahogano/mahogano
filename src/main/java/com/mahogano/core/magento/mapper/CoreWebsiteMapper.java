package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CoreWebsite;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CoreWebsiteMapper implements RowMapper<CoreWebsite> {

    @Override
    public CoreWebsite mapRow(ResultSet rs, int i) throws SQLException {
        CoreWebsite coreWebsite = new CoreWebsite();
        coreWebsite.setWebsiteId(rs.getInt("website_id"));
        coreWebsite.setCode(rs.getString("code"));
        coreWebsite.setName(rs.getString("name"));
        coreWebsite.setSortOrder(rs.getInt("sort_order"));
        coreWebsite.setDefaultGroupId(rs.getInt("default_group_id"));
        coreWebsite.setIsDefault(rs.getInt("is_default"));
        return coreWebsite;
    }

}

