package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CustomerEntity;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerEntityMapper implements RowMapper<CustomerEntity> {

    @Override
    public CustomerEntity mapRow(ResultSet rs, int i) throws SQLException {
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setEntityId(rs.getInt("entity_id"));
        customerEntity.setEntityTypeId(rs.getInt("entity_type_id"));
        customerEntity.setAttributeSetId(rs.getInt("attribute_set_id"));
        customerEntity.setWebsiteId(rs.getInt("website_id"));
        customerEntity.setEmail(rs.getString("email"));
        customerEntity.setGroupId(rs.getInt("group_id"));
        customerEntity.setIncrementId(rs.getString("increment_id"));
        customerEntity.setStoreId(rs.getInt("store_id"));
        customerEntity.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        customerEntity.setUpdatedAt(rs.getTimestamp("updated_at").toLocalDateTime());
        customerEntity.setIsActive(rs.getInt("is_active"));
        customerEntity.setDisableAutoGroupChange(rs.getInt("disable_auto_group_change"));
        return customerEntity;
    }

}

