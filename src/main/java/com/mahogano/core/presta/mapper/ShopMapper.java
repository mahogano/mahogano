package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Shop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShopMapper implements RowMapper<Shop> {

    @Override
    public Shop mapRow(ResultSet rs, int i) throws SQLException {
        Shop shop = new Shop();
        shop.setIdShop(rs.getInt("id_shop"));
        shop.setIdShopGroup(rs.getInt("id_shop_group"));
        shop.setName(rs.getString("name"));
        shop.setIdCategory(rs.getInt("id_category"));
        shop.setThemeName(rs.getString("theme_name"));
        shop.setActive(rs.getInt("active"));
        shop.setDeleted(rs.getInt("deleted"));
        return shop;
    }

}

