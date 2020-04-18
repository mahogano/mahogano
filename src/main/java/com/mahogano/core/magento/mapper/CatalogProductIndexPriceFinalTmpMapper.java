package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductIndexPriceFinalTmp;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductIndexPriceFinalTmpMapper implements RowMapper<CatalogProductIndexPriceFinalTmp> {

    @Override
    public CatalogProductIndexPriceFinalTmp mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductIndexPriceFinalTmp catalogProductIndexPriceFinalTmp = new CatalogProductIndexPriceFinalTmp();
        catalogProductIndexPriceFinalTmp.setEntityId(rs.getInt("entity_id"));
        catalogProductIndexPriceFinalTmp.setCustomerGroupId(rs.getInt("customer_group_id"));
        catalogProductIndexPriceFinalTmp.setWebsiteId(rs.getInt("website_id"));
        catalogProductIndexPriceFinalTmp.setTaxClassId(rs.getInt("tax_class_id"));
        catalogProductIndexPriceFinalTmp.setOrigPrice(rs.getBigDecimal("orig_price"));
        catalogProductIndexPriceFinalTmp.setPrice(rs.getBigDecimal("price"));
        catalogProductIndexPriceFinalTmp.setMinPrice(rs.getBigDecimal("min_price"));
        catalogProductIndexPriceFinalTmp.setMaxPrice(rs.getBigDecimal("max_price"));
        catalogProductIndexPriceFinalTmp.setTierPrice(rs.getBigDecimal("tier_price"));
        catalogProductIndexPriceFinalTmp.setBaseTier(rs.getBigDecimal("base_tier"));
        catalogProductIndexPriceFinalTmp.setGroupPrice(rs.getBigDecimal("group_price"));
        catalogProductIndexPriceFinalTmp.setBaseGroupPrice(rs.getBigDecimal("base_group_price"));
        return catalogProductIndexPriceFinalTmp;
    }

}

