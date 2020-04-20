package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CustomerGroup;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerGroupMapper implements RowMapper<CustomerGroup> {

    @Override
    public CustomerGroup mapRow(ResultSet rs, int i) throws SQLException {
        CustomerGroup customerGroup = new CustomerGroup();
        customerGroup.setIdCustomer(rs.getInt("id_customer"));
        customerGroup.setIdGroup(rs.getInt("id_group"));
        return customerGroup;
    }

}

