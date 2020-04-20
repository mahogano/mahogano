package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.OrderMessage;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderMessageMapper implements RowMapper<OrderMessage> {

    @Override
    public OrderMessage mapRow(ResultSet rs, int i) throws SQLException {
        OrderMessage orderMessage = new OrderMessage();
        orderMessage.setIdOrderMessage(rs.getInt("id_order_message"));
        orderMessage.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        return orderMessage;
    }

}

