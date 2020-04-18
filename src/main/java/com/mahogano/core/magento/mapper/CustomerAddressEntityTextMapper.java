package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CustomerAddressEntityText;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerAddressEntityTextMapper implements RowMapper<CustomerAddressEntityText> {

    @Override
    public CustomerAddressEntityText mapRow(ResultSet rs, int i) throws SQLException {
        CustomerAddressEntityText customerAddressEntityText = new CustomerAddressEntityText();
        customerAddressEntityText.setValueId(rs.getInt("value_id"));
        customerAddressEntityText.setEntityTypeId(rs.getInt("entity_type_id"));
        customerAddressEntityText.setAttributeId(rs.getInt("attribute_id"));
        customerAddressEntityText.setEntityId(rs.getInt("entity_id"));
        customerAddressEntityText.setValue(rs.getString("value"));
        return customerAddressEntityText;
    }

}

