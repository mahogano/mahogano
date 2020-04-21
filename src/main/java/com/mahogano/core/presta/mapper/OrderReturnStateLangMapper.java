package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.OrderReturnStateLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderReturnStateLangMapper implements RowMapper<OrderReturnStateLang> {

    @Override
    public OrderReturnStateLang mapRow(ResultSet rs, int i) throws SQLException {
        OrderReturnStateLang orderReturnStateLang = new OrderReturnStateLang();
        orderReturnStateLang.setIdOrderReturnState(rs.getInt("id_order_return_state"));
        orderReturnStateLang.setIdLang(rs.getInt("id_lang"));
        orderReturnStateLang.setName(rs.getString("name"));
        return orderReturnStateLang;
    }

}

