package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductLinkAttributeDecimal;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductLinkAttributeDecimalMapper implements RowMapper<CatalogProductLinkAttributeDecimal> {

    @Override
    public CatalogProductLinkAttributeDecimal mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductLinkAttributeDecimal catalogProductLinkAttributeDecimal = new CatalogProductLinkAttributeDecimal();
        catalogProductLinkAttributeDecimal.setValueId(rs.getInt("value_id"));
        catalogProductLinkAttributeDecimal.setProductLinkAttributeId(rs.getInt("product_link_attribute_id"));
        catalogProductLinkAttributeDecimal.setLinkId(rs.getInt("link_id"));
        catalogProductLinkAttributeDecimal.setValue(rs.getBigDecimal("value"));
        return catalogProductLinkAttributeDecimal;
    }

}

