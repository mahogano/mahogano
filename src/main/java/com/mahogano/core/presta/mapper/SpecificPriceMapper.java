package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.SpecificPrice;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SpecificPriceMapper implements RowMapper<SpecificPrice> {

    @Override
    public SpecificPrice mapRow(ResultSet rs, int i) throws SQLException {
        SpecificPrice specificPrice = new SpecificPrice();
        specificPrice.setIdSpecificPrice(rs.getInt("id_specific_price"));
        specificPrice.setIdSpecificPriceRule(rs.getInt("id_specific_price_rule"));
        specificPrice.setIdCart(rs.getInt("id_cart"));
        specificPrice.setIdProduct(rs.getInt("id_product"));
        specificPrice.setIdShop(rs.getInt("id_shop"));
        specificPrice.setIdShopGroup(rs.getInt("id_shop_group"));
        specificPrice.setIdCurrency(rs.getInt("id_currency"));
        specificPrice.setIdCountry(rs.getInt("id_country"));
        specificPrice.setIdGroup(rs.getInt("id_group"));
        specificPrice.setIdCustomer(rs.getInt("id_customer"));
        specificPrice.setIdProductAttribute(rs.getInt("id_product_attribute"));
        specificPrice.setPrice(rs.getBigDecimal("price"));
        specificPrice.setFromQuantity(rs.getInt("from_quantity"));
        specificPrice.setReduction(rs.getBigDecimal("reduction"));
        specificPrice.setReductionTax(rs.getInt("reduction_tax"));
        specificPrice.setReductionType(rs.getString("reduction_type"));
        specificPrice.setFrom(rs.getTimestamp("from").toLocalDateTime());
        specificPrice.setTo(rs.getTimestamp("to").toLocalDateTime());
        return specificPrice;
    }

}

