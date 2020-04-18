package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CoreStore;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CoreStoreMapper implements RowMapper<CoreStore> {

    @Override
    public CoreStore mapRow(ResultSet rs, int i) throws SQLException {
        CoreStore coreStore = new CoreStore();
        coreStore.setStoreId(rs.getInt("store_id"));
        coreStore.setCode(rs.getString("code"));
        coreStore.setWebsiteId(rs.getInt("website_id"));
        coreStore.setGroupId(rs.getInt("group_id"));
        coreStore.setName(rs.getString("name"));
        coreStore.setSortOrder(rs.getInt("sort_order"));
        coreStore.setIsActive(rs.getInt("is_active"));
        return coreStore;
    }

}

