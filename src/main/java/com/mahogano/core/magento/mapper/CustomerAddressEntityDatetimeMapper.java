package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CustomerAddressEntityDatetime;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerAddressEntityDatetimeMapper implements RowMapper<CustomerAddressEntityDatetime> {

    @Override
    public CustomerAddressEntityDatetime mapRow(ResultSet rs, int i) throws SQLException {
        CustomerAddressEntityDatetime customerAddressEntityDatetime = new CustomerAddressEntityDatetime();
        customerAddressEntityDatetime.setValueId(rs.getInt("value_id"));
        customerAddressEntityDatetime.setEntityTypeId(rs.getInt("entity_type_id"));
        customerAddressEntityDatetime.setAttributeId(rs.getInt("attribute_id"));
        customerAddressEntityDatetime.setEntityId(rs.getInt("entity_id"));
        customerAddressEntityDatetime.setValue(rs.getTimestamp("value").toLocalDateTime());
        return customerAddressEntityDatetime;
    }

}

