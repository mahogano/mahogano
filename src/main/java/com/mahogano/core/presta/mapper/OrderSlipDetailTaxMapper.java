package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.OrderSlipDetailTax;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderSlipDetailTaxMapper implements RowMapper<OrderSlipDetailTax> {

    @Override
    public OrderSlipDetailTax mapRow(ResultSet rs, int i) throws SQLException {
        OrderSlipDetailTax orderSlipDetailTax = new OrderSlipDetailTax();
        orderSlipDetailTax.setIdOrderSlipDetail(rs.getInt("id_order_slip_detail"));
        orderSlipDetailTax.setIdTax(rs.getInt("id_tax"));
        orderSlipDetailTax.setUnitAmount(rs.getBigDecimal("unit_amount"));
        orderSlipDetailTax.setTotalAmount(rs.getBigDecimal("total_amount"));
        return orderSlipDetailTax;
    }

}

