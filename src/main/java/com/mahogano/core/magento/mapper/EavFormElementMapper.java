package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.EavFormElement;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EavFormElementMapper implements RowMapper<EavFormElement> {

    @Override
    public EavFormElement mapRow(ResultSet rs, int i) throws SQLException {
        EavFormElement eavFormElement = new EavFormElement();
        eavFormElement.setElementId(rs.getInt("element_id"));
        eavFormElement.setTypeId(rs.getInt("type_id"));
        eavFormElement.setFieldsetId(rs.getInt("fieldset_id"));
        eavFormElement.setAttributeId(rs.getInt("attribute_id"));
        eavFormElement.setSortOrder(rs.getInt("sort_order"));
        return eavFormElement;
    }

}

