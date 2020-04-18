package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductIndexPriceBundleIdx;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductIndexPriceBundleIdxMapper implements RowMapper<CatalogProductIndexPriceBundleIdx> {

    @Override
    public CatalogProductIndexPriceBundleIdx mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductIndexPriceBundleIdx catalogProductIndexPriceBundleIdx = new CatalogProductIndexPriceBundleIdx();
        catalogProductIndexPriceBundleIdx.setEntityId(rs.getInt("entity_id"));
        catalogProductIndexPriceBundleIdx.setCustomerGroupId(rs.getInt("customer_group_id"));
        catalogProductIndexPriceBundleIdx.setWebsiteId(rs.getInt("website_id"));
        catalogProductIndexPriceBundleIdx.setTaxClassId(rs.getInt("tax_class_id"));
        catalogProductIndexPriceBundleIdx.setPriceType(rs.getInt("price_type"));
        catalogProductIndexPriceBundleIdx.setSpecialPrice(rs.getBigDecimal("special_price"));
        catalogProductIndexPriceBundleIdx.setTierPercent(rs.getBigDecimal("tier_percent"));
        catalogProductIndexPriceBundleIdx.setOrigPrice(rs.getBigDecimal("orig_price"));
        catalogProductIndexPriceBundleIdx.setPrice(rs.getBigDecimal("price"));
        catalogProductIndexPriceBundleIdx.setMinPrice(rs.getBigDecimal("min_price"));
        catalogProductIndexPriceBundleIdx.setMaxPrice(rs.getBigDecimal("max_price"));
        catalogProductIndexPriceBundleIdx.setTierPrice(rs.getBigDecimal("tier_price"));
        catalogProductIndexPriceBundleIdx.setBaseTier(rs.getBigDecimal("base_tier"));
        catalogProductIndexPriceBundleIdx.setGroupPrice(rs.getBigDecimal("group_price"));
        catalogProductIndexPriceBundleIdx.setBaseGroupPrice(rs.getBigDecimal("base_group_price"));
        catalogProductIndexPriceBundleIdx.setGroupPricePercent(rs.getBigDecimal("group_price_percent"));
        return catalogProductIndexPriceBundleIdx;
    }

}

