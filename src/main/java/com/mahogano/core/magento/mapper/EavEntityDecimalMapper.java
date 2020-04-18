package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.EavEntityDecimal;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EavEntityDecimalMapper implements RowMapper<EavEntityDecimal> {

    @Override
    public EavEntityDecimal mapRow(ResultSet rs, int i) throws SQLException {
        EavEntityDecimal eavEntityDecimal = new EavEntityDecimal();
        eavEntityDecimal.setValueId(rs.getInt("value_id"));
        eavEntityDecimal.setEntityTypeId(rs.getInt("entity_type_id"));
        eavEntityDecimal.setAttributeId(rs.getInt("attribute_id"));
        eavEntityDecimal.setStoreId(rs.getInt("store_id"));
        eavEntityDecimal.setEntityId(rs.getInt("entity_id"));
        eavEntityDecimal.setValue(rs.getBigDecimal("value"));
        return eavEntityDecimal;
    }

}

