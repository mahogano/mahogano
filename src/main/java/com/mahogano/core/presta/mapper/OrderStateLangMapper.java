package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.OrderStateLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderStateLangMapper implements RowMapper<OrderStateLang> {

    @Override
    public OrderStateLang mapRow(ResultSet rs, int i) throws SQLException {
        OrderStateLang orderStateLang = new OrderStateLang();
        orderStateLang.setIdOrderState(rs.getInt("id_order_state"));
        orderStateLang.setIdLang(rs.getInt("id_lang"));
        orderStateLang.setName(rs.getString("name"));
        orderStateLang.setTemplate(rs.getString("template"));
        return orderStateLang;
    }

}

