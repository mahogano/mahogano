package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductEnabledIndex;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductEnabledIndexMapper implements RowMapper<CatalogProductEnabledIndex> {

    @Override
    public CatalogProductEnabledIndex mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductEnabledIndex catalogProductEnabledIndex = new CatalogProductEnabledIndex();
        catalogProductEnabledIndex.setProductId(rs.getInt("product_id"));
        catalogProductEnabledIndex.setStoreId(rs.getInt("store_id"));
        catalogProductEnabledIndex.setVisibility(rs.getInt("visibility"));
        return catalogProductEnabledIndex;
    }

}

