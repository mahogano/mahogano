package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.OrderMessageLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderMessageLangMapper implements RowMapper<OrderMessageLang> {

    @Override
    public OrderMessageLang mapRow(ResultSet rs, int i) throws SQLException {
        OrderMessageLang orderMessageLang = new OrderMessageLang();
        orderMessageLang.setIdOrderMessage(rs.getInt("id_order_message"));
        orderMessageLang.setIdLang(rs.getInt("id_lang"));
        orderMessageLang.setName(rs.getString("name"));
        orderMessageLang.setMessage(rs.getString("message"));
        return orderMessageLang;
    }

}

