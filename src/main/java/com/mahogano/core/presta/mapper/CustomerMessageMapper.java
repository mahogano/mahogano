package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CustomerMessage;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerMessageMapper implements RowMapper<CustomerMessage> {

    @Override
    public CustomerMessage mapRow(ResultSet rs, int i) throws SQLException {
        CustomerMessage customerMessage = new CustomerMessage();
        customerMessage.setIdCustomerMessage(rs.getInt("id_customer_message"));
        customerMessage.setIdCustomerThread(rs.getInt("id_customer_thread"));
        customerMessage.setIdEmployee(rs.getInt("id_employee"));
        customerMessage.setMessage(rs.getString("message"));
        customerMessage.setFileName(rs.getString("file_name"));
        customerMessage.setIpAddress(rs.getString("ip_address"));
        customerMessage.setUserAgent(rs.getString("user_agent"));
        customerMessage.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        customerMessage.setDateUpd(rs.getTimestamp("date_upd").toLocalDateTime());
        customerMessage.setPrivateVariable(rs.getInt("private"));
        customerMessage.setRead(rs.getInt("read"));
        return customerMessage;
    }

}

