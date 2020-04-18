package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductIndexPriceFinalIdx;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductIndexPriceFinalIdxMapper implements RowMapper<CatalogProductIndexPriceFinalIdx> {

    @Override
    public CatalogProductIndexPriceFinalIdx mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductIndexPriceFinalIdx catalogProductIndexPriceFinalIdx = new CatalogProductIndexPriceFinalIdx();
        catalogProductIndexPriceFinalIdx.setEntityId(rs.getInt("entity_id"));
        catalogProductIndexPriceFinalIdx.setCustomerGroupId(rs.getInt("customer_group_id"));
        catalogProductIndexPriceFinalIdx.setWebsiteId(rs.getInt("website_id"));
        catalogProductIndexPriceFinalIdx.setTaxClassId(rs.getInt("tax_class_id"));
        catalogProductIndexPriceFinalIdx.setOrigPrice(rs.getBigDecimal("orig_price"));
        catalogProductIndexPriceFinalIdx.setPrice(rs.getBigDecimal("price"));
        catalogProductIndexPriceFinalIdx.setMinPrice(rs.getBigDecimal("min_price"));
        catalogProductIndexPriceFinalIdx.setMaxPrice(rs.getBigDecimal("max_price"));
        catalogProductIndexPriceFinalIdx.setTierPrice(rs.getBigDecimal("tier_price"));
        catalogProductIndexPriceFinalIdx.setBaseTier(rs.getBigDecimal("base_tier"));
        catalogProductIndexPriceFinalIdx.setGroupPrice(rs.getBigDecimal("group_price"));
        catalogProductIndexPriceFinalIdx.setBaseGroupPrice(rs.getBigDecimal("base_group_price"));
        return catalogProductIndexPriceFinalIdx;
    }

}

