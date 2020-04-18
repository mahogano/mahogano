package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CustomerEntityDecimal;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerEntityDecimalMapper implements RowMapper<CustomerEntityDecimal> {

    @Override
    public CustomerEntityDecimal mapRow(ResultSet rs, int i) throws SQLException {
        CustomerEntityDecimal customerEntityDecimal = new CustomerEntityDecimal();
        customerEntityDecimal.setValueId(rs.getInt("value_id"));
        customerEntityDecimal.setEntityTypeId(rs.getInt("entity_type_id"));
        customerEntityDecimal.setAttributeId(rs.getInt("attribute_id"));
        customerEntityDecimal.setEntityId(rs.getInt("entity_id"));
        customerEntityDecimal.setValue(rs.getBigDecimal("value"));
        return customerEntityDecimal;
    }

}

