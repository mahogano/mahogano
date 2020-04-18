package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.WishlistItem;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WishlistItemMapper implements RowMapper<WishlistItem> {

    @Override
    public WishlistItem mapRow(ResultSet rs, int i) throws SQLException {
        WishlistItem wishlistItem = new WishlistItem();
        wishlistItem.setWishlistItemId(rs.getInt("wishlist_item_id"));
        wishlistItem.setWishlistId(rs.getInt("wishlist_id"));
        wishlistItem.setProductId(rs.getInt("product_id"));
        wishlistItem.setStoreId(rs.getInt("store_id"));
        wishlistItem.setAddedAt(rs.getTimestamp("added_at") != null ? rs.getTimestamp("added_at").toLocalDateTime() : null);
        wishlistItem.setDescription(rs.getString("description"));
        wishlistItem.setQty(rs.getBigDecimal("qty"));
        return wishlistItem;
    }

}

