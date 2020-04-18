package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.Wishlist;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WishlistMapper implements RowMapper<Wishlist> {

    @Override
    public Wishlist mapRow(ResultSet rs, int i) throws SQLException {
        Wishlist wishlist = new Wishlist();
        wishlist.setWishlistId(rs.getInt("wishlist_id"));
        wishlist.setCustomerId(rs.getInt("customer_id"));
        wishlist.setShared(rs.getInt("shared"));
        wishlist.setSharingCode(rs.getString("sharing_code"));
        wishlist.setUpdatedAt(rs.getTimestamp("updated_at") != null ? rs.getTimestamp("updated_at").toLocalDateTime() : null);
        return wishlist;
    }

}

