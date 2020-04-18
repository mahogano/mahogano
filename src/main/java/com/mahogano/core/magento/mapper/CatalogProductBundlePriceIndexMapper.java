package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductBundlePriceIndex;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductBundlePriceIndexMapper implements RowMapper<CatalogProductBundlePriceIndex> {

    @Override
    public CatalogProductBundlePriceIndex mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductBundlePriceIndex catalogProductBundlePriceIndex = new CatalogProductBundlePriceIndex();
        catalogProductBundlePriceIndex.setEntityId(rs.getInt("entity_id"));
        catalogProductBundlePriceIndex.setWebsiteId(rs.getInt("website_id"));
        catalogProductBundlePriceIndex.setCustomerGroupId(rs.getInt("customer_group_id"));
        catalogProductBundlePriceIndex.setMinPrice(rs.getBigDecimal("min_price"));
        catalogProductBundlePriceIndex.setMaxPrice(rs.getBigDecimal("max_price"));
        return catalogProductBundlePriceIndex;
    }

}

