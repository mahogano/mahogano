package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.OrderSlip;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderSlipMapper implements RowMapper<OrderSlip> {

    @Override
    public OrderSlip mapRow(ResultSet rs, int i) throws SQLException {
        OrderSlip orderSlip = new OrderSlip();
        orderSlip.setIdOrderSlip(rs.getInt("id_order_slip"));
        orderSlip.setConversionRate(rs.getBigDecimal("conversion_rate"));
        orderSlip.setIdCustomer(rs.getInt("id_customer"));
        orderSlip.setIdOrder(rs.getInt("id_order"));
        orderSlip.setTotalProductsTaxExcl(rs.getBigDecimal("total_products_tax_excl"));
        orderSlip.setTotalProductsTaxIncl(rs.getBigDecimal("total_products_tax_incl"));
        orderSlip.setTotalShippingTaxExcl(rs.getBigDecimal("total_shipping_tax_excl"));
        orderSlip.setTotalShippingTaxIncl(rs.getBigDecimal("total_shipping_tax_incl"));
        orderSlip.setShippingCost(rs.getInt("shipping_cost"));
        orderSlip.setAmount(rs.getBigDecimal("amount"));
        orderSlip.setShippingCostAmount(rs.getBigDecimal("shipping_cost_amount"));
        orderSlip.setPartial(rs.getInt("partial"));
        orderSlip.setOrderSlipType(rs.getInt("order_slip_type"));
        orderSlip.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        orderSlip.setDateUpd(rs.getTimestamp("date_upd").toLocalDateTime());
        return orderSlip;
    }

}

