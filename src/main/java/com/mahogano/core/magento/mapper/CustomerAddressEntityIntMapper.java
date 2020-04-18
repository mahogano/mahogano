package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CustomerAddressEntityInt;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerAddressEntityIntMapper implements RowMapper<CustomerAddressEntityInt> {

    @Override
    public CustomerAddressEntityInt mapRow(ResultSet rs, int i) throws SQLException {
        CustomerAddressEntityInt customerAddressEntityInt = new CustomerAddressEntityInt();
        customerAddressEntityInt.setValueId(rs.getInt("value_id"));
        customerAddressEntityInt.setEntityTypeId(rs.getInt("entity_type_id"));
        customerAddressEntityInt.setAttributeId(rs.getInt("attribute_id"));
        customerAddressEntityInt.setEntityId(rs.getInt("entity_id"));
        customerAddressEntityInt.setValue(rs.getInt("value"));
        return customerAddressEntityInt;
    }

}

