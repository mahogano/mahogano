package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CustomerEntityInt;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerEntityIntMapper implements RowMapper<CustomerEntityInt> {

    @Override
    public CustomerEntityInt mapRow(ResultSet rs, int i) throws SQLException {
        CustomerEntityInt customerEntityInt = new CustomerEntityInt();
        customerEntityInt.setValueId(rs.getInt("value_id"));
        customerEntityInt.setEntityTypeId(rs.getInt("entity_type_id"));
        customerEntityInt.setAttributeId(rs.getInt("attribute_id"));
        customerEntityInt.setEntityId(rs.getInt("entity_id"));
        customerEntityInt.setValue(rs.getInt("value"));
        return customerEntityInt;
    }

}

