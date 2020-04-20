package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Message;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MessageMapper implements RowMapper<Message> {

    @Override
    public Message mapRow(ResultSet rs, int i) throws SQLException {
        Message message = new Message();
        message.setIdMessage(rs.getInt("id_message"));
        message.setIdCart(rs.getInt("id_cart"));
        message.setIdCustomer(rs.getInt("id_customer"));
        message.setIdEmployee(rs.getInt("id_employee"));
        message.setIdOrder(rs.getInt("id_order"));
        message.setMessage(rs.getString("message"));
        message.setPrivateVariable(rs.getInt("private"));
        message.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        return message;
    }

}

