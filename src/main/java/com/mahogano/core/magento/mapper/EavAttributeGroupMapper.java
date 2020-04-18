package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.EavAttributeGroup;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EavAttributeGroupMapper implements RowMapper<EavAttributeGroup> {

    @Override
    public EavAttributeGroup mapRow(ResultSet rs, int i) throws SQLException {
        EavAttributeGroup eavAttributeGroup = new EavAttributeGroup();
        eavAttributeGroup.setAttributeGroupId(rs.getInt("attribute_group_id"));
        eavAttributeGroup.setAttributeSetId(rs.getInt("attribute_set_id"));
        eavAttributeGroup.setAttributeGroupName(rs.getString("attribute_group_name"));
        eavAttributeGroup.setSortOrder(rs.getInt("sort_order"));
        eavAttributeGroup.setDefaultId(rs.getInt("default_id"));
        return eavAttributeGroup;
    }

}

