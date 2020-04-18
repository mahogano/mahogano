package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.EavEntityAttribute;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EavEntityAttributeMapper implements RowMapper<EavEntityAttribute> {

    @Override
    public EavEntityAttribute mapRow(ResultSet rs, int i) throws SQLException {
        EavEntityAttribute eavEntityAttribute = new EavEntityAttribute();
        eavEntityAttribute.setEntityAttributeId(rs.getInt("entity_attribute_id"));
        eavEntityAttribute.setEntityTypeId(rs.getInt("entity_type_id"));
        eavEntityAttribute.setAttributeSetId(rs.getInt("attribute_set_id"));
        eavEntityAttribute.setAttributeGroupId(rs.getInt("attribute_group_id"));
        eavEntityAttribute.setAttributeId(rs.getInt("attribute_id"));
        eavEntityAttribute.setSortOrder(rs.getInt("sort_order"));
        return eavEntityAttribute;
    }

}

