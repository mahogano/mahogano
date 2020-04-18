package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CustomerFormAttribute;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerFormAttributeMapper implements RowMapper<CustomerFormAttribute> {

    @Override
    public CustomerFormAttribute mapRow(ResultSet rs, int i) throws SQLException {
        CustomerFormAttribute customerFormAttribute = new CustomerFormAttribute();
        customerFormAttribute.setFormCode(rs.getString("form_code"));
        customerFormAttribute.setAttributeId(rs.getInt("attribute_id"));
        return customerFormAttribute;
    }

}

