package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.EavAttributeOptionValue;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EavAttributeOptionValueMapper implements RowMapper<EavAttributeOptionValue> {

    @Override
    public EavAttributeOptionValue mapRow(ResultSet rs, int i) throws SQLException {
        EavAttributeOptionValue eavAttributeOptionValue = new EavAttributeOptionValue();
        eavAttributeOptionValue.setValueId(rs.getInt("value_id"));
        eavAttributeOptionValue.setOptionId(rs.getInt("option_id"));
        eavAttributeOptionValue.setStoreId(rs.getInt("store_id"));
        eavAttributeOptionValue.setValue(rs.getString("value"));
        return eavAttributeOptionValue;
    }

}

