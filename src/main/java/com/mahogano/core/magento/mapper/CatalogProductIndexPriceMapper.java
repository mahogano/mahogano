package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductIndexPrice;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductIndexPriceMapper implements RowMapper<CatalogProductIndexPrice> {

    @Override
    public CatalogProductIndexPrice mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductIndexPrice catalogProductIndexPrice = new CatalogProductIndexPrice();
        catalogProductIndexPrice.setEntityId(rs.getInt("entity_id"));
        catalogProductIndexPrice.setCustomerGroupId(rs.getInt("customer_group_id"));
        catalogProductIndexPrice.setWebsiteId(rs.getInt("website_id"));
        catalogProductIndexPrice.setTaxClassId(rs.getInt("tax_class_id"));
        catalogProductIndexPrice.setPrice(rs.getBigDecimal("price"));
        catalogProductIndexPrice.setFinalPrice(rs.getBigDecimal("final_price"));
        catalogProductIndexPrice.setMinPrice(rs.getBigDecimal("min_price"));
        catalogProductIndexPrice.setMaxPrice(rs.getBigDecimal("max_price"));
        catalogProductIndexPrice.setTierPrice(rs.getBigDecimal("tier_price"));
        catalogProductIndexPrice.setGroupPrice(rs.getBigDecimal("group_price"));
        return catalogProductIndexPrice;
    }

}

