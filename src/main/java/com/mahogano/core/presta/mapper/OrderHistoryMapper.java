package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.OrderHistory;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderHistoryMapper implements RowMapper<OrderHistory> {

    @Override
    public OrderHistory mapRow(ResultSet rs, int i) throws SQLException {
        OrderHistory orderHistory = new OrderHistory();
        orderHistory.setIdOrderHistory(rs.getInt("id_order_history"));
        orderHistory.setIdEmployee(rs.getInt("id_employee"));
        orderHistory.setIdOrder(rs.getInt("id_order"));
        orderHistory.setIdOrderState(rs.getInt("id_order_state"));
        orderHistory.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        return orderHistory;
    }

}

