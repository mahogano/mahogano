package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductSuperAttribute;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductSuperAttributeMapper implements RowMapper<CatalogProductSuperAttribute> {

    @Override
    public CatalogProductSuperAttribute mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductSuperAttribute catalogProductSuperAttribute = new CatalogProductSuperAttribute();
        catalogProductSuperAttribute.setProductSuperAttributeId(rs.getInt("product_super_attribute_id"));
        catalogProductSuperAttribute.setProductId(rs.getInt("product_id"));
        catalogProductSuperAttribute.setAttributeId(rs.getInt("attribute_id"));
        catalogProductSuperAttribute.setPosition(rs.getInt("position"));
        return catalogProductSuperAttribute;
    }

}

