package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CustomerGroup;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerGroupMapper implements RowMapper<CustomerGroup> {

    @Override
    public CustomerGroup mapRow(ResultSet rs, int i) throws SQLException {
        CustomerGroup customerGroup = new CustomerGroup();
        customerGroup.setCustomerGroupId(rs.getInt("customer_group_id"));
        customerGroup.setCustomerGroupCode(rs.getString("customer_group_code"));
        customerGroup.setTaxClassId(rs.getInt("tax_class_id"));
        return customerGroup;
    }

}

