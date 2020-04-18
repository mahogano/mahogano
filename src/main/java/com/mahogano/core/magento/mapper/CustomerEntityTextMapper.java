package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CustomerEntityText;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerEntityTextMapper implements RowMapper<CustomerEntityText> {

    @Override
    public CustomerEntityText mapRow(ResultSet rs, int i) throws SQLException {
        CustomerEntityText customerEntityText = new CustomerEntityText();
        customerEntityText.setValueId(rs.getInt("value_id"));
        customerEntityText.setEntityTypeId(rs.getInt("entity_type_id"));
        customerEntityText.setAttributeId(rs.getInt("attribute_id"));
        customerEntityText.setEntityId(rs.getInt("entity_id"));
        customerEntityText.setValue(rs.getString("value"));
        return customerEntityText;
    }

}

