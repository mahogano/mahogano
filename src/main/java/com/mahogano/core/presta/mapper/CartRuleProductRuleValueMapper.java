package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CartRuleProductRuleValue;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CartRuleProductRuleValueMapper implements RowMapper<CartRuleProductRuleValue> {

    @Override
    public CartRuleProductRuleValue mapRow(ResultSet rs, int i) throws SQLException {
        CartRuleProductRuleValue cartRuleProductRuleValue = new CartRuleProductRuleValue();
        cartRuleProductRuleValue.setIdProductRule(rs.getInt("id_product_rule"));
        cartRuleProductRuleValue.setIdItem(rs.getInt("id_item"));
        return cartRuleProductRuleValue;
    }

}

