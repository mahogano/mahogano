package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.OrderReturn;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderReturnMapper implements RowMapper<OrderReturn> {

    @Override
    public OrderReturn mapRow(ResultSet rs, int i) throws SQLException {
        OrderReturn orderReturn = new OrderReturn();
        orderReturn.setIdOrderReturn(rs.getInt("id_order_return"));
        orderReturn.setIdCustomer(rs.getInt("id_customer"));
        orderReturn.setIdOrder(rs.getInt("id_order"));
        orderReturn.setState(rs.getInt("state"));
        orderReturn.setQuestion(rs.getString("question"));
        orderReturn.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        orderReturn.setDateUpd(rs.getTimestamp("date_upd").toLocalDateTime());
        return orderReturn;
    }

}

