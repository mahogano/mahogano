package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.EavEntityText;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EavEntityTextMapper implements RowMapper<EavEntityText> {

    @Override
    public EavEntityText mapRow(ResultSet rs, int i) throws SQLException {
        EavEntityText eavEntityText = new EavEntityText();
        eavEntityText.setValueId(rs.getInt("value_id"));
        eavEntityText.setEntityTypeId(rs.getInt("entity_type_id"));
        eavEntityText.setAttributeId(rs.getInt("attribute_id"));
        eavEntityText.setStoreId(rs.getInt("store_id"));
        eavEntityText.setEntityId(rs.getInt("entity_id"));
        eavEntityText.setValue(rs.getString("value"));
        return eavEntityText;
    }

}

