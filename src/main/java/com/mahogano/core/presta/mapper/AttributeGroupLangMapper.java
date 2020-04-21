package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.AttributeGroupLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AttributeGroupLangMapper implements RowMapper<AttributeGroupLang> {

    @Override
    public AttributeGroupLang mapRow(ResultSet rs, int i) throws SQLException {
        AttributeGroupLang attributeGroupLang = new AttributeGroupLang();
        attributeGroupLang.setIdAttributeGroup(rs.getInt("id_attribute_group"));
        attributeGroupLang.setIdLang(rs.getInt("id_lang"));
        attributeGroupLang.setName(rs.getString("name"));
        attributeGroupLang.setPublicName(rs.getString("public_name"));
        return attributeGroupLang;
    }

}

