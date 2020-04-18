package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.EavAttributeSet;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EavAttributeSetMapper implements RowMapper<EavAttributeSet> {

    @Override
    public EavAttributeSet mapRow(ResultSet rs, int i) throws SQLException {
        EavAttributeSet eavAttributeSet = new EavAttributeSet();
        eavAttributeSet.setAttributeSetId(rs.getInt("attribute_set_id"));
        eavAttributeSet.setEntityTypeId(rs.getInt("entity_type_id"));
        eavAttributeSet.setAttributeSetName(rs.getString("attribute_set_name"));
        eavAttributeSet.setSortOrder(rs.getInt("sort_order"));
        return eavAttributeSet;
    }

}

