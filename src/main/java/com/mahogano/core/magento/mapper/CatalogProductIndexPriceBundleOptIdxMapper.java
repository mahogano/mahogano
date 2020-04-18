package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductIndexPriceBundleOptIdx;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductIndexPriceBundleOptIdxMapper implements RowMapper<CatalogProductIndexPriceBundleOptIdx> {

    @Override
    public CatalogProductIndexPriceBundleOptIdx mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductIndexPriceBundleOptIdx catalogProductIndexPriceBundleOptIdx = new CatalogProductIndexPriceBundleOptIdx();
        catalogProductIndexPriceBundleOptIdx.setEntityId(rs.getInt("entity_id"));
        catalogProductIndexPriceBundleOptIdx.setCustomerGroupId(rs.getInt("customer_group_id"));
        catalogProductIndexPriceBundleOptIdx.setWebsiteId(rs.getInt("website_id"));
        catalogProductIndexPriceBundleOptIdx.setOptionId(rs.getInt("option_id"));
        catalogProductIndexPriceBundleOptIdx.setMinPrice(rs.getBigDecimal("min_price"));
        catalogProductIndexPriceBundleOptIdx.setAltPrice(rs.getBigDecimal("alt_price"));
        catalogProductIndexPriceBundleOptIdx.setMaxPrice(rs.getBigDecimal("max_price"));
        catalogProductIndexPriceBundleOptIdx.setTierPrice(rs.getBigDecimal("tier_price"));
        catalogProductIndexPriceBundleOptIdx.setAltTierPrice(rs.getBigDecimal("alt_tier_price"));
        catalogProductIndexPriceBundleOptIdx.setGroupPrice(rs.getBigDecimal("group_price"));
        catalogProductIndexPriceBundleOptIdx.setAltGroupPrice(rs.getBigDecimal("alt_group_price"));
        return catalogProductIndexPriceBundleOptIdx;
    }

}

