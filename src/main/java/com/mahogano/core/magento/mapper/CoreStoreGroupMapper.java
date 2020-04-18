package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CoreStoreGroup;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CoreStoreGroupMapper implements RowMapper<CoreStoreGroup> {

    @Override
    public CoreStoreGroup mapRow(ResultSet rs, int i) throws SQLException {
        CoreStoreGroup coreStoreGroup = new CoreStoreGroup();
        coreStoreGroup.setGroupId(rs.getInt("group_id"));
        coreStoreGroup.setWebsiteId(rs.getInt("website_id"));
        coreStoreGroup.setName(rs.getString("name"));
        coreStoreGroup.setRootCategoryId(rs.getInt("root_category_id"));
        coreStoreGroup.setDefaultStoreId(rs.getInt("default_store_id"));
        return coreStoreGroup;
    }

}

