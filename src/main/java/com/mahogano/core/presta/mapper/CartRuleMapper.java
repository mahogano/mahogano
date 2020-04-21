package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CartRule;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CartRuleMapper implements RowMapper<CartRule> {

    @Override
    public CartRule mapRow(ResultSet rs, int i) throws SQLException {
        CartRule cartRule = new CartRule();
        cartRule.setIdCartRule(rs.getInt("id_cart_rule"));
        cartRule.setIdCustomer(rs.getInt("id_customer"));
        cartRule.setDateFrom(rs.getTimestamp("date_from").toLocalDateTime());
        cartRule.setDateTo(rs.getTimestamp("date_to").toLocalDateTime());
        cartRule.setDescription(rs.getString("description"));
        cartRule.setQuantity(rs.getInt("quantity"));
        cartRule.setQuantityPerUser(rs.getInt("quantity_per_user"));
        cartRule.setPriority(rs.getInt("priority"));
        cartRule.setPartialUse(rs.getInt("partial_use"));
        cartRule.setCode(rs.getString("code"));
        cartRule.setMinimumAmount(rs.getBigDecimal("minimum_amount"));
        cartRule.setMinimumAmountTax(rs.getInt("minimum_amount_tax"));
        cartRule.setMinimumAmountCurrency(rs.getInt("minimum_amount_currency"));
        cartRule.setMinimumAmountShipping(rs.getInt("minimum_amount_shipping"));
        cartRule.setCountryRestriction(rs.getInt("country_restriction"));
        cartRule.setCarrierRestriction(rs.getInt("carrier_restriction"));
        cartRule.setGroupRestriction(rs.getInt("group_restriction"));
        cartRule.setCartRuleRestriction(rs.getInt("cart_rule_restriction"));
        cartRule.setProductRestriction(rs.getInt("product_restriction"));
        cartRule.setShopRestriction(rs.getInt("shop_restriction"));
        cartRule.setFreeShipping(rs.getInt("free_shipping"));
        cartRule.setReductionPercent(rs.getBigDecimal("reduction_percent"));
        cartRule.setReductionAmount(rs.getBigDecimal("reduction_amount"));
        cartRule.setReductionTax(rs.getInt("reduction_tax"));
        cartRule.setReductionCurrency(rs.getInt("reduction_currency"));
        cartRule.setReductionProduct(rs.getInt("reduction_product"));
        cartRule.setReductionExcludeSpecial(rs.getInt("reduction_exclude_special"));
        cartRule.setGiftProduct(rs.getInt("gift_product"));
        cartRule.setGiftProductAttribute(rs.getInt("gift_product_attribute"));
        cartRule.setHighlight(rs.getInt("highlight"));
        cartRule.setActive(rs.getInt("active"));
        cartRule.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        cartRule.setDateUpd(rs.getTimestamp("date_upd").toLocalDateTime());
        return cartRule;
    }

}

