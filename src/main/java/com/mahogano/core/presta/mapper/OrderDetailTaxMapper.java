package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.OrderDetailTax;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderDetailTaxMapper implements RowMapper<OrderDetailTax> {

    @Override
    public OrderDetailTax mapRow(ResultSet rs, int i) throws SQLException {
        OrderDetailTax orderDetailTax = new OrderDetailTax();
        orderDetailTax.setIdOrderDetail(rs.getInt("id_order_detail"));
        orderDetailTax.setIdTax(rs.getInt("id_tax"));
        orderDetailTax.setUnitAmount(rs.getBigDecimal("unit_amount"));
        orderDetailTax.setTotalAmount(rs.getBigDecimal("total_amount"));
        return orderDetailTax;
    }

}

