package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ShopGroup;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShopGroupMapper implements RowMapper<ShopGroup> {

    @Override
    public ShopGroup mapRow(ResultSet rs, int i) throws SQLException {
        ShopGroup shopGroup = new ShopGroup();
        shopGroup.setIdShopGroup(rs.getInt("id_shop_group"));
        shopGroup.setName(rs.getString("name"));
        shopGroup.setShareCustomer(rs.getInt("share_customer"));
        shopGroup.setShareOrder(rs.getInt("share_order"));
        shopGroup.setShareStock(rs.getInt("share_stock"));
        shopGroup.setActive(rs.getInt("active"));
        shopGroup.setDeleted(rs.getInt("deleted"));
        return shopGroup;
    }

}

