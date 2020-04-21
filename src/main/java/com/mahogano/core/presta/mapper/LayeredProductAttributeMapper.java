package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.LayeredProductAttribute;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LayeredProductAttributeMapper implements RowMapper<LayeredProductAttribute> {

    @Override
    public LayeredProductAttribute mapRow(ResultSet rs, int i) throws SQLException {
        LayeredProductAttribute layeredProductAttribute = new LayeredProductAttribute();
        layeredProductAttribute.setIdAttribute(rs.getInt("id_attribute"));
        layeredProductAttribute.setIdProduct(rs.getInt("id_product"));
        layeredProductAttribute.setIdAttributeGroup(rs.getInt("id_attribute_group"));
        layeredProductAttribute.setIdShop(rs.getInt("id_shop"));
        return layeredProductAttribute;
    }

}

