package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Attribute;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AttributeMapper implements RowMapper<Attribute> {

    @Override
    public Attribute mapRow(ResultSet rs, int i) throws SQLException {
        Attribute attribute = new Attribute();
        attribute.setIdAttribute(rs.getInt("id_attribute"));
        attribute.setIdAttributeGroup(rs.getInt("id_attribute_group"));
        attribute.setColor(rs.getString("color"));
        attribute.setPosition(rs.getInt("position"));
        return attribute;
    }

}

