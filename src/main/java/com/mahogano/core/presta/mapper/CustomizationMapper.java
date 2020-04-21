package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Customization;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomizationMapper implements RowMapper<Customization> {

    @Override
    public Customization mapRow(ResultSet rs, int i) throws SQLException {
        Customization customization = new Customization();
        customization.setIdCustomization(rs.getInt("id_customization"));
        customization.setIdProductAttribute(rs.getInt("id_product_attribute"));
        customization.setIdAddressDelivery(rs.getInt("id_address_delivery"));
        customization.setIdCart(rs.getInt("id_cart"));
        customization.setIdProduct(rs.getInt("id_product"));
        customization.setQuantity(rs.getInt("quantity"));
        customization.setQuantityRefunded(rs.getInt("quantity_refunded"));
        customization.setQuantityReturned(rs.getInt("quantity_returned"));
        customization.setInCart(rs.getInt("in_cart"));
        return customization;
    }

}

