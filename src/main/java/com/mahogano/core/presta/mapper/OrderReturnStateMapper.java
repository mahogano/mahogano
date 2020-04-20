package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.OrderReturnState;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderReturnStateMapper implements RowMapper<OrderReturnState> {

    @Override
    public OrderReturnState mapRow(ResultSet rs, int i) throws SQLException {
        OrderReturnState orderReturnState = new OrderReturnState();
        orderReturnState.setIdOrderReturnState(rs.getInt("id_order_return_state"));
        orderReturnState.setColor(rs.getString("color"));
        return orderReturnState;
    }

}

