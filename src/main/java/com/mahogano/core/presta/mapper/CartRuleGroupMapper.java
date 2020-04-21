package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CartRuleGroup;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CartRuleGroupMapper implements RowMapper<CartRuleGroup> {

    @Override
    public CartRuleGroup mapRow(ResultSet rs, int i) throws SQLException {
        CartRuleGroup cartRuleGroup = new CartRuleGroup();
        cartRuleGroup.setIdCartRule(rs.getInt("id_cart_rule"));
        cartRuleGroup.setIdGroup(rs.getInt("id_group"));
        return cartRuleGroup;
    }

}

