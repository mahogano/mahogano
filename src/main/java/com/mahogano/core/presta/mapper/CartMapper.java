package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Cart;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CartMapper implements RowMapper<Cart> {

    @Override
    public Cart mapRow(ResultSet rs, int i) throws SQLException {
        Cart cart = new Cart();
        cart.setIdCart(rs.getInt("id_cart"));
        cart.setIdShopGroup(rs.getInt("id_shop_group"));
        cart.setIdShop(rs.getInt("id_shop"));
        cart.setIdCarrier(rs.getInt("id_carrier"));
        cart.setDeliveryOption(rs.getString("delivery_option"));
        cart.setIdLang(rs.getInt("id_lang"));
        cart.setIdAddressDelivery(rs.getInt("id_address_delivery"));
        cart.setIdAddressInvoice(rs.getInt("id_address_invoice"));
        cart.setIdCurrency(rs.getInt("id_currency"));
        cart.setIdCustomer(rs.getInt("id_customer"));
        cart.setIdGuest(rs.getInt("id_guest"));
        cart.setSecureKey(rs.getString("secure_key"));
        cart.setRecyclable(rs.getInt("recyclable"));
        cart.setGift(rs.getInt("gift"));
        cart.setGiftMessage(rs.getString("gift_message"));
        cart.setMobileTheme(rs.getInt("mobile_theme"));
        cart.setAllowSeperatedPackage(rs.getInt("allow_seperated_package"));
        cart.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        cart.setDateUpd(rs.getTimestamp("date_upd").toLocalDateTime());
        cart.setCheckoutSessionData(rs.getString("checkout_session_data"));
        return cart;
    }

}

