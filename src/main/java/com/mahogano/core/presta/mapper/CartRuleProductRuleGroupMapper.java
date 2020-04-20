package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CartRuleProductRuleGroup;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CartRuleProductRuleGroupMapper implements RowMapper<CartRuleProductRuleGroup> {

    @Override
    public CartRuleProductRuleGroup mapRow(ResultSet rs, int i) throws SQLException {
        CartRuleProductRuleGroup cartRuleProductRuleGroup = new CartRuleProductRuleGroup();
        cartRuleProductRuleGroup.setIdProductRuleGroup(rs.getInt("id_product_rule_group"));
        cartRuleProductRuleGroup.setIdCartRule(rs.getInt("id_cart_rule"));
        cartRuleProductRuleGroup.setQuantity(rs.getInt("quantity"));
        return cartRuleProductRuleGroup;
    }

}

