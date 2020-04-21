package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.OrderPayment;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderPaymentMapper implements RowMapper<OrderPayment> {

    @Override
    public OrderPayment mapRow(ResultSet rs, int i) throws SQLException {
        OrderPayment orderPayment = new OrderPayment();
        orderPayment.setIdOrderPayment(rs.getInt("id_order_payment"));
        orderPayment.setOrderReference(rs.getString("order_reference"));
        orderPayment.setIdCurrency(rs.getInt("id_currency"));
        orderPayment.setAmount(rs.getBigDecimal("amount"));
        orderPayment.setPaymentMethod(rs.getString("payment_method"));
        orderPayment.setConversionRate(rs.getBigDecimal("conversion_rate"));
        orderPayment.setTransactionId(rs.getString("transaction_id"));
        orderPayment.setCardNumber(rs.getString("card_number"));
        orderPayment.setCardBrand(rs.getString("card_brand"));
        orderPayment.setCardExpiration(rs.getString("card_expiration"));
        orderPayment.setCardHolder(rs.getString("card_holder"));
        orderPayment.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        return orderPayment;
    }

}

