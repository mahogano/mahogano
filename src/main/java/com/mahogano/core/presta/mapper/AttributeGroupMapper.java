package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.AttributeGroup;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AttributeGroupMapper implements RowMapper<AttributeGroup> {

    @Override
    public AttributeGroup mapRow(ResultSet rs, int i) throws SQLException {
        AttributeGroup attributeGroup = new AttributeGroup();
        attributeGroup.setIdAttributeGroup(rs.getInt("id_attribute_group"));
        attributeGroup.setIsColorGroup(rs.getInt("is_color_group"));
        attributeGroup.setGroupType(rs.getString("group_type"));
        attributeGroup.setPosition(rs.getInt("position"));
        return attributeGroup;
    }

}

