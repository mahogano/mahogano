package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CustomerAddressEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerAddressEntityMapper implements RowMapper<CustomerAddressEntity> {

    @Override
    public CustomerAddressEntity mapRow(ResultSet rs, int i) throws SQLException {
        CustomerAddressEntity customerAddress = new CustomerAddressEntity();
        customerAddress.setEntityId(rs.getInt("entity_id"));
        customerAddress.setEntityTypeId(rs.getInt("entity_type_id"));
        customerAddress.setAttributeSetId(rs.getInt("attribute_set_id"));
        customerAddress.setIncrementId(rs.getString("increment_id"));
        customerAddress.setParentId(rs.getInt("parent_id"));
        customerAddress.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        customerAddress.setUpdatedAt(rs.getTimestamp("updated_at").toLocalDateTime());
        customerAddress.setIsActive(rs.getInt("is_active"));
        return customerAddress;
    }

}
