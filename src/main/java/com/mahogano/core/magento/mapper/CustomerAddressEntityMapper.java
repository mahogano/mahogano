package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CustomerAddressEntity;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerAddressEntityMapper implements RowMapper<CustomerAddressEntity> {

    @Override
    public CustomerAddressEntity mapRow(ResultSet rs, int i) throws SQLException {
        CustomerAddressEntity customerAddressEntity = new CustomerAddressEntity();
        customerAddressEntity.setEntityId(rs.getInt("entity_id"));
        customerAddressEntity.setEntityTypeId(rs.getInt("entity_type_id"));
        customerAddressEntity.setAttributeSetId(rs.getInt("attribute_set_id"));
        customerAddressEntity.setIncrementId(rs.getString("increment_id"));
        customerAddressEntity.setParentId(rs.getInt("parent_id"));
        customerAddressEntity.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        customerAddressEntity.setUpdatedAt(rs.getTimestamp("updated_at").toLocalDateTime());
        customerAddressEntity.setIsActive(rs.getInt("is_active"));
        return customerAddressEntity;
    }

}

