package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ShopUrl;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShopUrlMapper implements RowMapper<ShopUrl> {

    @Override
    public ShopUrl mapRow(ResultSet rs, int i) throws SQLException {
        ShopUrl shopUrl = new ShopUrl();
        shopUrl.setIdShopUrl(rs.getInt("id_shop_url"));
        shopUrl.setIdShop(rs.getInt("id_shop"));
        shopUrl.setDomain(rs.getString("domain"));
        shopUrl.setDomainSsl(rs.getString("domain_ssl"));
        shopUrl.setPhysicalUri(rs.getString("physical_uri"));
        shopUrl.setVirtualUri(rs.getString("virtual_uri"));
        shopUrl.setMain(rs.getInt("main"));
        shopUrl.setActive(rs.getInt("active"));
        return shopUrl;
    }

}

