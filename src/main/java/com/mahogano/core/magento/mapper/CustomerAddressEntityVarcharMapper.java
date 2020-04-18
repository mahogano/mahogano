package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CustomerAddressEntityVarchar;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerAddressEntityVarcharMapper implements RowMapper<CustomerAddressEntityVarchar> {

    @Override
    public CustomerAddressEntityVarchar mapRow(ResultSet rs, int i) throws SQLException {
        CustomerAddressEntityVarchar customerAddressEntityVarchar = new CustomerAddressEntityVarchar();
        customerAddressEntityVarchar.setValueId(rs.getInt("value_id"));
        customerAddressEntityVarchar.setEntityTypeId(rs.getInt("entity_type_id"));
        customerAddressEntityVarchar.setAttributeId(rs.getInt("attribute_id"));
        customerAddressEntityVarchar.setEntityId(rs.getInt("entity_id"));
        customerAddressEntityVarchar.setValue(rs.getString("value"));
        return customerAddressEntityVarchar;
    }

}

