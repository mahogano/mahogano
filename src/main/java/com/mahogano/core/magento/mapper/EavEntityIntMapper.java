package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.EavEntityInt;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EavEntityIntMapper implements RowMapper<EavEntityInt> {

    @Override
    public EavEntityInt mapRow(ResultSet rs, int i) throws SQLException {
        EavEntityInt eavEntityInt = new EavEntityInt();
        eavEntityInt.setValueId(rs.getInt("value_id"));
        eavEntityInt.setEntityTypeId(rs.getInt("entity_type_id"));
        eavEntityInt.setAttributeId(rs.getInt("attribute_id"));
        eavEntityInt.setStoreId(rs.getInt("store_id"));
        eavEntityInt.setEntityId(rs.getInt("entity_id"));
        eavEntityInt.setValue(rs.getInt("value"));
        return eavEntityInt;
    }

}

