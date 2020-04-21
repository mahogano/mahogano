package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.OrderCarrier;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderCarrierMapper implements RowMapper<OrderCarrier> {

    @Override
    public OrderCarrier mapRow(ResultSet rs, int i) throws SQLException {
        OrderCarrier orderCarrier = new OrderCarrier();
        orderCarrier.setIdOrderCarrier(rs.getInt("id_order_carrier"));
        orderCarrier.setIdOrder(rs.getInt("id_order"));
        orderCarrier.setIdCarrier(rs.getInt("id_carrier"));
        orderCarrier.setIdOrderInvoice(rs.getInt("id_order_invoice"));
        orderCarrier.setWeight(rs.getBigDecimal("weight"));
        orderCarrier.setShippingCostTaxExcl(rs.getBigDecimal("shipping_cost_tax_excl"));
        orderCarrier.setShippingCostTaxIncl(rs.getBigDecimal("shipping_cost_tax_incl"));
        orderCarrier.setTrackingNumber(rs.getString("tracking_number"));
        orderCarrier.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        return orderCarrier;
    }

}

