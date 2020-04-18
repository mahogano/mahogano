package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CustomerEntityDatetime;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerEntityDatetimeMapper implements RowMapper<CustomerEntityDatetime> {

    @Override
    public CustomerEntityDatetime mapRow(ResultSet rs, int i) throws SQLException {
        CustomerEntityDatetime customerEntityDatetime = new CustomerEntityDatetime();
        customerEntityDatetime.setValueId(rs.getInt("value_id"));
        customerEntityDatetime.setEntityTypeId(rs.getInt("entity_type_id"));
        customerEntityDatetime.setAttributeId(rs.getInt("attribute_id"));
        customerEntityDatetime.setEntityId(rs.getInt("entity_id"));
        customerEntityDatetime.setValue(rs.getTimestamp("value").toLocalDateTime());
        return customerEntityDatetime;
    }

}

