package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CustomerEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerEntityMapper implements RowMapper<CustomerEntity> {

    @Override
    public CustomerEntity mapRow(ResultSet rs, int i) throws SQLException {
        CustomerEntity customer = new CustomerEntity();
        customer.setEntityId(rs.getInt("entity_id"));
        customer.setEntityTypeId(rs.getInt("entity_type_id"));
        customer.setAttributeSetId(rs.getInt("attribute_set_id"));
        customer.setWebsiteId(rs.getInt("website_id"));
        customer.setEmail(rs.getString("email"));
        customer.setGroupId(rs.getInt("group_id"));
        customer.setIncrementId(rs.getString("increment_id"));
        customer.setStoreId(rs.getInt("store_id"));
        customer.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        customer.setUpdatedAt(rs.getTimestamp("updated_at").toLocalDateTime());
        customer.setIsActive(rs.getInt("is_active"));
        customer.setDisableAutoGroupChange(rs.getInt("disable_auto_group_change"));
        return customer;
    }

}
