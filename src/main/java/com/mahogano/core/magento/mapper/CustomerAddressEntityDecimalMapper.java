package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CustomerAddressEntityDecimal;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerAddressEntityDecimalMapper implements RowMapper<CustomerAddressEntityDecimal> {

    @Override
    public CustomerAddressEntityDecimal mapRow(ResultSet rs, int i) throws SQLException {
        CustomerAddressEntityDecimal customerAddressEntityDecimal = new CustomerAddressEntityDecimal();
        customerAddressEntityDecimal.setValueId(rs.getInt("value_id"));
        customerAddressEntityDecimal.setEntityTypeId(rs.getInt("entity_type_id"));
        customerAddressEntityDecimal.setAttributeId(rs.getInt("attribute_id"));
        customerAddressEntityDecimal.setEntityId(rs.getInt("entity_id"));
        customerAddressEntityDecimal.setValue(rs.getBigDecimal("value"));
        return customerAddressEntityDecimal;
    }

}

