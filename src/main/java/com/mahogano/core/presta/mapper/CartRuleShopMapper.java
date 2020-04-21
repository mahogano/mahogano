package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CartRuleShop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CartRuleShopMapper implements RowMapper<CartRuleShop> {

    @Override
    public CartRuleShop mapRow(ResultSet rs, int i) throws SQLException {
        CartRuleShop cartRuleShop = new CartRuleShop();
        cartRuleShop.setIdCartRule(rs.getInt("id_cart_rule"));
        cartRuleShop.setIdShop(rs.getInt("id_shop"));
        return cartRuleShop;
    }

}

