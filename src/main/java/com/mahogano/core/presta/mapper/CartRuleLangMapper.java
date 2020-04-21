package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CartRuleLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CartRuleLangMapper implements RowMapper<CartRuleLang> {

    @Override
    public CartRuleLang mapRow(ResultSet rs, int i) throws SQLException {
        CartRuleLang cartRuleLang = new CartRuleLang();
        cartRuleLang.setIdCartRule(rs.getInt("id_cart_rule"));
        cartRuleLang.setIdLang(rs.getInt("id_lang"));
        cartRuleLang.setName(rs.getString("name"));
        return cartRuleLang;
    }

}

