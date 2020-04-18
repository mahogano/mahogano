package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogCompareItem;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogCompareItemMapper implements RowMapper<CatalogCompareItem> {

    @Override
    public CatalogCompareItem mapRow(ResultSet rs, int i) throws SQLException {
        CatalogCompareItem catalogCompareItem = new CatalogCompareItem();
        catalogCompareItem.setCatalogCompareItemId(rs.getInt("catalog_compare_item_id"));
        catalogCompareItem.setVisitorId(rs.getInt("visitor_id"));
        catalogCompareItem.setCustomerId(rs.getInt("customer_id"));
        catalogCompareItem.setProductId(rs.getInt("product_id"));
        catalogCompareItem.setStoreId(rs.getInt("store_id"));
        return catalogCompareItem;
    }

}

