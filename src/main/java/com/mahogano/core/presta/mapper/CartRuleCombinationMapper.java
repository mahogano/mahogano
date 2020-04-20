package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CartRuleCombination;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CartRuleCombinationMapper implements RowMapper<CartRuleCombination> {

    @Override
    public CartRuleCombination mapRow(ResultSet rs, int i) throws SQLException {
        CartRuleCombination cartRuleCombination = new CartRuleCombination();
        cartRuleCombination.setIdCartRule1(rs.getInt("id_cart_rule_1"));
        cartRuleCombination.setIdCartRule2(rs.getInt("id_cart_rule_2"));
        return cartRuleCombination;
    }

}

