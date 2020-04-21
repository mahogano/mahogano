package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.AttributeShop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AttributeShopMapper implements RowMapper<AttributeShop> {

    @Override
    public AttributeShop mapRow(ResultSet rs, int i) throws SQLException {
        AttributeShop attributeShop = new AttributeShop();
        attributeShop.setIdAttribute(rs.getInt("id_attribute"));
        attributeShop.setIdShop(rs.getInt("id_shop"));
        return attributeShop;
    }

}

