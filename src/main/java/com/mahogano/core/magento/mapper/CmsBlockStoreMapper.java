package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CmsBlockStore;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CmsBlockStoreMapper implements RowMapper<CmsBlockStore> {

    @Override
    public CmsBlockStore mapRow(ResultSet rs, int i) throws SQLException {
        CmsBlockStore cmsBlockStore = new CmsBlockStore();
        cmsBlockStore.setBlockId(rs.getInt("block_id"));
        cmsBlockStore.setStoreId(rs.getInt("store_id"));
        return cmsBlockStore;
    }

}

