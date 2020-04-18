package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CmsPageStore;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CmsPageStoreMapper implements RowMapper<CmsPageStore> {

    @Override
    public CmsPageStore mapRow(ResultSet rs, int i) throws SQLException {
        CmsPageStore cmsPageStore = new CmsPageStore();
        cmsPageStore.setPageId(rs.getInt("page_id"));
        cmsPageStore.setStoreId(rs.getInt("store_id"));
        return cmsPageStore;
    }

}

