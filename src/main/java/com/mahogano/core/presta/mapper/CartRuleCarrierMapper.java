package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CartRuleCarrier;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CartRuleCarrierMapper implements RowMapper<CartRuleCarrier> {

    @Override
    public CartRuleCarrier mapRow(ResultSet rs, int i) throws SQLException {
        CartRuleCarrier cartRuleCarrier = new CartRuleCarrier();
        cartRuleCarrier.setIdCartRule(rs.getInt("id_cart_rule"));
        cartRuleCarrier.setIdCarrier(rs.getInt("id_carrier"));
        return cartRuleCarrier;
    }

}

