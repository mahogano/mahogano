package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.LayeredIndexableAttributeGroup;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LayeredIndexableAttributeGroupMapper implements RowMapper<LayeredIndexableAttributeGroup> {

    @Override
    public LayeredIndexableAttributeGroup mapRow(ResultSet rs, int i) throws SQLException {
        LayeredIndexableAttributeGroup layeredIndexableAttributeGroup = new LayeredIndexableAttributeGroup();
        layeredIndexableAttributeGroup.setIdAttributeGroup(rs.getInt("id_attribute_group"));
        layeredIndexableAttributeGroup.setIndexable(rs.getInt("indexable"));
        return layeredIndexableAttributeGroup;
    }

}

