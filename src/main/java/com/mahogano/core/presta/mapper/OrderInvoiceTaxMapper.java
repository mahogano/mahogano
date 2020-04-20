package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.OrderInvoiceTax;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderInvoiceTaxMapper implements RowMapper<OrderInvoiceTax> {

    @Override
    public OrderInvoiceTax mapRow(ResultSet rs, int i) throws SQLException {
        OrderInvoiceTax orderInvoiceTax = new OrderInvoiceTax();
        orderInvoiceTax.setIdOrderInvoice(rs.getInt("id_order_invoice"));
        orderInvoiceTax.setType(rs.getString("type"));
        orderInvoiceTax.setIdTax(rs.getInt("id_tax"));
        orderInvoiceTax.setAmount(rs.getBigDecimal("amount"));
        return orderInvoiceTax;
    }

}

