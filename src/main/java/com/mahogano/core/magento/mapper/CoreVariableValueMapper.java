package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CoreVariableValue;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CoreVariableValueMapper implements RowMapper<CoreVariableValue> {

    @Override
    public CoreVariableValue mapRow(ResultSet rs, int i) throws SQLException {
        CoreVariableValue coreVariableValue = new CoreVariableValue();
        coreVariableValue.setValueId(rs.getInt("value_id"));
        coreVariableValue.setVariableId(rs.getInt("variable_id"));
        coreVariableValue.setStoreId(rs.getInt("store_id"));
        coreVariableValue.setPlainValue(rs.getString("plain_value"));
        coreVariableValue.setHtmlValue(rs.getString("html_value"));
        return coreVariableValue;
    }

}

