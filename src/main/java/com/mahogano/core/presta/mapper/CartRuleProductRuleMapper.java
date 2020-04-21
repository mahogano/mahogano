package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CartRuleProductRule;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CartRuleProductRuleMapper implements RowMapper<CartRuleProductRule> {

    @Override
    public CartRuleProductRule mapRow(ResultSet rs, int i) throws SQLException {
        CartRuleProductRule cartRuleProductRule = new CartRuleProductRule();
        cartRuleProductRule.setIdProductRule(rs.getInt("id_product_rule"));
        cartRuleProductRule.setIdProductRuleGroup(rs.getInt("id_product_rule_group"));
        cartRuleProductRule.setType(rs.getString("type"));
        return cartRuleProductRule;
    }

}

