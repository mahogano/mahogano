package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.AttributeImpact;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AttributeImpactMapper implements RowMapper<AttributeImpact> {

    @Override
    public AttributeImpact mapRow(ResultSet rs, int i) throws SQLException {
        AttributeImpact attributeImpact = new AttributeImpact();
        attributeImpact.setIdAttributeImpact(rs.getInt("id_attribute_impact"));
        attributeImpact.setIdProduct(rs.getInt("id_product"));
        attributeImpact.setIdAttribute(rs.getInt("id_attribute"));
        attributeImpact.setWeight(rs.getBigDecimal("weight"));
        attributeImpact.setPrice(rs.getBigDecimal("price"));
        return attributeImpact;
    }

}

