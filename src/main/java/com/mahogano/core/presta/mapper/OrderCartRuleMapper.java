package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.OrderCartRule;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderCartRuleMapper implements RowMapper<OrderCartRule> {

    @Override
    public OrderCartRule mapRow(ResultSet rs, int i) throws SQLException {
        OrderCartRule orderCartRule = new OrderCartRule();
        orderCartRule.setIdOrderCartRule(rs.getInt("id_order_cart_rule"));
        orderCartRule.setIdOrder(rs.getInt("id_order"));
        orderCartRule.setIdCartRule(rs.getInt("id_cart_rule"));
        orderCartRule.setIdOrderInvoice(rs.getInt("id_order_invoice"));
        orderCartRule.setName(rs.getString("name"));
        orderCartRule.setValue(rs.getBigDecimal("value"));
        orderCartRule.setValueTaxExcl(rs.getBigDecimal("value_tax_excl"));
        orderCartRule.setFreeShipping(rs.getInt("free_shipping"));
        return orderCartRule;
    }

}

