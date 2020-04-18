package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductSuperAttributePricing;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductSuperAttributePricingMapper implements RowMapper<CatalogProductSuperAttributePricing> {

    @Override
    public CatalogProductSuperAttributePricing mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductSuperAttributePricing catalogProductSuperAttributePricing = new CatalogProductSuperAttributePricing();
        catalogProductSuperAttributePricing.setValueId(rs.getInt("value_id"));
        catalogProductSuperAttributePricing.setProductSuperAttributeId(rs.getInt("product_super_attribute_id"));
        catalogProductSuperAttributePricing.setValueIndex(rs.getString("value_index"));
        catalogProductSuperAttributePricing.setIsPercent(rs.getInt("is_percent"));
        catalogProductSuperAttributePricing.setPricingValue(rs.getBigDecimal("pricing_value"));
        catalogProductSuperAttributePricing.setWebsiteId(rs.getInt("website_id"));
        return catalogProductSuperAttributePricing;
    }

}

