package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CartCartRule;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CartCartRuleMapper implements RowMapper<CartCartRule> {

    @Override
    public CartCartRule mapRow(ResultSet rs, int i) throws SQLException {
        CartCartRule cartCartRule = new CartCartRule();
        cartCartRule.setIdCart(rs.getInt("id_cart"));
        cartCartRule.setIdCartRule(rs.getInt("id_cart_rule"));
        return cartCartRule;
    }

}

