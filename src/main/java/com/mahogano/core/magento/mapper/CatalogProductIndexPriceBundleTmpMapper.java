package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductIndexPriceBundleTmp;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductIndexPriceBundleTmpMapper implements RowMapper<CatalogProductIndexPriceBundleTmp> {

    @Override
    public CatalogProductIndexPriceBundleTmp mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductIndexPriceBundleTmp catalogProductIndexPriceBundleTmp = new CatalogProductIndexPriceBundleTmp();
        catalogProductIndexPriceBundleTmp.setEntityId(rs.getInt("entity_id"));
        catalogProductIndexPriceBundleTmp.setCustomerGroupId(rs.getInt("customer_group_id"));
        catalogProductIndexPriceBundleTmp.setWebsiteId(rs.getInt("website_id"));
        catalogProductIndexPriceBundleTmp.setTaxClassId(rs.getInt("tax_class_id"));
        catalogProductIndexPriceBundleTmp.setPriceType(rs.getInt("price_type"));
        catalogProductIndexPriceBundleTmp.setSpecialPrice(rs.getBigDecimal("special_price"));
        catalogProductIndexPriceBundleTmp.setTierPercent(rs.getBigDecimal("tier_percent"));
        catalogProductIndexPriceBundleTmp.setOrigPrice(rs.getBigDecimal("orig_price"));
        catalogProductIndexPriceBundleTmp.setPrice(rs.getBigDecimal("price"));
        catalogProductIndexPriceBundleTmp.setMinPrice(rs.getBigDecimal("min_price"));
        catalogProductIndexPriceBundleTmp.setMaxPrice(rs.getBigDecimal("max_price"));
        catalogProductIndexPriceBundleTmp.setTierPrice(rs.getBigDecimal("tier_price"));
        catalogProductIndexPriceBundleTmp.setBaseTier(rs.getBigDecimal("base_tier"));
        catalogProductIndexPriceBundleTmp.setGroupPrice(rs.getBigDecimal("group_price"));
        catalogProductIndexPriceBundleTmp.setBaseGroupPrice(rs.getBigDecimal("base_group_price"));
        catalogProductIndexPriceBundleTmp.setGroupPricePercent(rs.getBigDecimal("group_price_percent"));
        return catalogProductIndexPriceBundleTmp;
    }

}

