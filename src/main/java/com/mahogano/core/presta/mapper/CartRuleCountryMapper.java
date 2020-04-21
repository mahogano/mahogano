package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CartRuleCountry;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CartRuleCountryMapper implements RowMapper<CartRuleCountry> {

    @Override
    public CartRuleCountry mapRow(ResultSet rs, int i) throws SQLException {
        CartRuleCountry cartRuleCountry = new CartRuleCountry();
        cartRuleCountry.setIdCartRule(rs.getInt("id_cart_rule"));
        cartRuleCountry.setIdCountry(rs.getInt("id_country"));
        return cartRuleCountry;
    }

}

