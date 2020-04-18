package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductBundleStockIndex;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductBundleStockIndexMapper implements RowMapper<CatalogProductBundleStockIndex> {

    @Override
    public CatalogProductBundleStockIndex mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductBundleStockIndex catalogProductBundleStockIndex = new CatalogProductBundleStockIndex();
        catalogProductBundleStockIndex.setEntityId(rs.getInt("entity_id"));
        catalogProductBundleStockIndex.setWebsiteId(rs.getInt("website_id"));
        catalogProductBundleStockIndex.setStockId(rs.getInt("stock_id"));
        catalogProductBundleStockIndex.setOptionId(rs.getInt("option_id"));
        catalogProductBundleStockIndex.setStockStatus(rs.getInt("stock_status"));
        return catalogProductBundleStockIndex;
    }

}

