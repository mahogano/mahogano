package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CustomerFlowpassword;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerFlowpasswordMapper implements RowMapper<CustomerFlowpassword> {

    @Override
    public CustomerFlowpassword mapRow(ResultSet rs, int i) throws SQLException {
        CustomerFlowpassword customerFlowpassword = new CustomerFlowpassword();
        customerFlowpassword.setFlowpasswordId(rs.getInt("flowpassword_id"));
        customerFlowpassword.setIp(rs.getString("ip"));
        customerFlowpassword.setEmail(rs.getString("email"));
        customerFlowpassword.setRequestedDate(rs.getString("requested_date"));
        return customerFlowpassword;
    }

}

