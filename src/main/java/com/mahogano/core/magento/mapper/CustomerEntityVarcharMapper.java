package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CustomerEntityVarchar;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerEntityVarcharMapper implements RowMapper<CustomerEntityVarchar> {

    @Override
    public CustomerEntityVarchar mapRow(ResultSet rs, int i) throws SQLException {
        CustomerEntityVarchar customerEntityVarchar = new CustomerEntityVarchar();
        customerEntityVarchar.setValueId(rs.getInt("value_id"));
        customerEntityVarchar.setEntityTypeId(rs.getInt("entity_type_id"));
        customerEntityVarchar.setAttributeId(rs.getInt("attribute_id"));
        customerEntityVarchar.setEntityId(rs.getInt("entity_id"));
        customerEntityVarchar.setValue(rs.getString("value"));
        return customerEntityVarchar;
    }

}

