package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CartProduct;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CartProductMapper implements RowMapper<CartProduct> {

    @Override
    public CartProduct mapRow(ResultSet rs, int i) throws SQLException {
        CartProduct cartProduct = new CartProduct();
        cartProduct.setIdCart(rs.getInt("id_cart"));
        cartProduct.setIdProduct(rs.getInt("id_product"));
        cartProduct.setIdAddressDelivery(rs.getInt("id_address_delivery"));
        cartProduct.setIdShop(rs.getInt("id_shop"));
        cartProduct.setIdProductAttribute(rs.getInt("id_product_attribute"));
        cartProduct.setIdCustomization(rs.getInt("id_customization"));
        cartProduct.setQuantity(rs.getInt("quantity"));
        cartProduct.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        return cartProduct;
    }

}

