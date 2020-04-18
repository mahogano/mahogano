package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.WishlistItemOption;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WishlistItemOptionMapper implements RowMapper<WishlistItemOption> {

    @Override
    public WishlistItemOption mapRow(ResultSet rs, int i) throws SQLException {
        WishlistItemOption wishlistItemOption = new WishlistItemOption();
        wishlistItemOption.setOptionId(rs.getInt("option_id"));
        wishlistItemOption.setWishlistItemId(rs.getInt("wishlist_item_id"));
        wishlistItemOption.setProductId(rs.getInt("product_id"));
        wishlistItemOption.setCode(rs.getString("code"));
        wishlistItemOption.setValue(rs.getString("value"));
        return wishlistItemOption;
    }

}

