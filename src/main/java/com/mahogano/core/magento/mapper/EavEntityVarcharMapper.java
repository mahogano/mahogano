package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.EavEntityVarchar;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EavEntityVarcharMapper implements RowMapper<EavEntityVarchar> {

    @Override
    public EavEntityVarchar mapRow(ResultSet rs, int i) throws SQLException {
        EavEntityVarchar eavEntityVarchar = new EavEntityVarchar();
        eavEntityVarchar.setValueId(rs.getInt("value_id"));
        eavEntityVarchar.setEntityTypeId(rs.getInt("entity_type_id"));
        eavEntityVarchar.setAttributeId(rs.getInt("attribute_id"));
        eavEntityVarchar.setStoreId(rs.getInt("store_id"));
        eavEntityVarchar.setEntityId(rs.getInt("entity_id"));
        eavEntityVarchar.setValue(rs.getString("value"));
        return eavEntityVarchar;
    }

}

