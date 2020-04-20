package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.AttributeGroupShop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AttributeGroupShopMapper implements RowMapper<AttributeGroupShop> {

    @Override
    public AttributeGroupShop mapRow(ResultSet rs, int i) throws SQLException {
        AttributeGroupShop attributeGroupShop = new AttributeGroupShop();
        attributeGroupShop.setIdAttributeGroup(rs.getInt("id_attribute_group"));
        attributeGroupShop.setIdShop(rs.getInt("id_shop"));
        return attributeGroupShop;
    }

}

