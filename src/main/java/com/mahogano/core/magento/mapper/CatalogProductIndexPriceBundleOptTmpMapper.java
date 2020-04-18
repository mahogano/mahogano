package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductIndexPriceBundleOptTmp;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductIndexPriceBundleOptTmpMapper implements RowMapper<CatalogProductIndexPriceBundleOptTmp> {

    @Override
    public CatalogProductIndexPriceBundleOptTmp mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductIndexPriceBundleOptTmp catalogProductIndexPriceBundleOptTmp = new CatalogProductIndexPriceBundleOptTmp();
        catalogProductIndexPriceBundleOptTmp.setEntityId(rs.getInt("entity_id"));
        catalogProductIndexPriceBundleOptTmp.setCustomerGroupId(rs.getInt("customer_group_id"));
        catalogProductIndexPriceBundleOptTmp.setWebsiteId(rs.getInt("website_id"));
        catalogProductIndexPriceBundleOptTmp.setOptionId(rs.getInt("option_id"));
        catalogProductIndexPriceBundleOptTmp.setMinPrice(rs.getBigDecimal("min_price"));
        catalogProductIndexPriceBundleOptTmp.setAltPrice(rs.getBigDecimal("alt_price"));
        catalogProductIndexPriceBundleOptTmp.setMaxPrice(rs.getBigDecimal("max_price"));
        catalogProductIndexPriceBundleOptTmp.setTierPrice(rs.getBigDecimal("tier_price"));
        catalogProductIndexPriceBundleOptTmp.setAltTierPrice(rs.getBigDecimal("alt_tier_price"));
        catalogProductIndexPriceBundleOptTmp.setGroupPrice(rs.getBigDecimal("group_price"));
        catalogProductIndexPriceBundleOptTmp.setAltGroupPrice(rs.getBigDecimal("alt_group_price"));
        return catalogProductIndexPriceBundleOptTmp;
    }

}

