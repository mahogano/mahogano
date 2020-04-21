package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.OrderInvoicePayment;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderInvoicePaymentMapper implements RowMapper<OrderInvoicePayment> {

    @Override
    public OrderInvoicePayment mapRow(ResultSet rs, int i) throws SQLException {
        OrderInvoicePayment orderInvoicePayment = new OrderInvoicePayment();
        orderInvoicePayment.setIdOrderInvoice(rs.getInt("id_order_invoice"));
        orderInvoicePayment.setIdOrderPayment(rs.getInt("id_order_payment"));
        orderInvoicePayment.setIdOrder(rs.getInt("id_order"));
        return orderInvoicePayment;
    }

}

