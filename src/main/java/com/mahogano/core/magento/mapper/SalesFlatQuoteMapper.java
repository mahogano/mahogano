package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesFlatQuote;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesFlatQuoteMapper implements RowMapper<SalesFlatQuote> {

    @Override
    public SalesFlatQuote mapRow(ResultSet rs, int i) throws SQLException {
        SalesFlatQuote salesFlatQuote = new SalesFlatQuote();
        salesFlatQuote.setEntityId(rs.getInt("entity_id"));
        salesFlatQuote.setStoreId(rs.getInt("store_id"));
        salesFlatQuote.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        salesFlatQuote.setUpdatedAt(rs.getTimestamp("updated_at").toLocalDateTime());
        salesFlatQuote.setConvertedAt(rs.getTimestamp("converted_at") != null ? rs.getTimestamp("converted_at").toLocalDateTime() : null);
        salesFlatQuote.setIsActive(rs.getInt("is_active"));
        salesFlatQuote.setIsVirtual(rs.getInt("is_virtual"));
        salesFlatQuote.setIsMultiShipping(rs.getInt("is_multi_shipping"));
        salesFlatQuote.setItemsCount(rs.getInt("items_count"));
        salesFlatQuote.setItemsQty(rs.getBigDecimal("items_qty"));
        salesFlatQuote.setOrigOrderId(rs.getInt("orig_order_id"));
        salesFlatQuote.setStoreToBaseRate(rs.getBigDecimal("store_to_base_rate"));
        salesFlatQuote.setStoreToQuoteRate(rs.getBigDecimal("store_to_quote_rate"));
        salesFlatQuote.setBaseCurrencyCode(rs.getString("base_currency_code"));
        salesFlatQuote.setStoreCurrencyCode(rs.getString("store_currency_code"));
        salesFlatQuote.setQuoteCurrencyCode(rs.getString("quote_currency_code"));
        salesFlatQuote.setGrandTotal(rs.getBigDecimal("grand_total"));
        salesFlatQuote.setBaseGrandTotal(rs.getBigDecimal("base_grand_total"));
        salesFlatQuote.setCheckoutMethod(rs.getString("checkout_method"));
        salesFlatQuote.setCustomerId(rs.getInt("customer_id"));
        salesFlatQuote.setCustomerTaxClassId(rs.getInt("customer_tax_class_id"));
        salesFlatQuote.setCustomerGroupId(rs.getInt("customer_group_id"));
        salesFlatQuote.setCustomerEmail(rs.getString("customer_email"));
        salesFlatQuote.setCustomerPrefix(rs.getString("customer_prefix"));
        salesFlatQuote.setCustomerFirstname(rs.getString("customer_firstname"));
        salesFlatQuote.setCustomerMiddlename(rs.getString("customer_middlename"));
        salesFlatQuote.setCustomerLastname(rs.getString("customer_lastname"));
        salesFlatQuote.setCustomerSuffix(rs.getString("customer_suffix"));
        salesFlatQuote.setCustomerDob(rs.getTimestamp("customer_dob") != null ? rs.getTimestamp("customer_dob").toLocalDateTime() : null);
        salesFlatQuote.setCustomerNote(rs.getString("customer_note"));
        salesFlatQuote.setCustomerNoteNotify(rs.getInt("customer_note_notify"));
        salesFlatQuote.setCustomerIsGuest(rs.getInt("customer_is_guest"));
        salesFlatQuote.setRemoteIp(rs.getString("remote_ip"));
        salesFlatQuote.setAppliedRuleIds(rs.getString("applied_rule_ids"));
        salesFlatQuote.setReservedOrderId(rs.getString("reserved_order_id"));
        salesFlatQuote.setPasswordHash(rs.getString("password_hash"));
        salesFlatQuote.setCouponCode(rs.getString("coupon_code"));
        salesFlatQuote.setGlobalCurrencyCode(rs.getString("global_currency_code"));
        salesFlatQuote.setBaseToGlobalRate(rs.getBigDecimal("base_to_global_rate"));
        salesFlatQuote.setBaseToQuoteRate(rs.getBigDecimal("base_to_quote_rate"));
        salesFlatQuote.setCustomerTaxvat(rs.getString("customer_taxvat"));
        salesFlatQuote.setCustomerGender(rs.getString("customer_gender"));
        salesFlatQuote.setSubtotal(rs.getBigDecimal("subtotal"));
        salesFlatQuote.setBaseSubtotal(rs.getBigDecimal("base_subtotal"));
        salesFlatQuote.setSubtotalWithDiscount(rs.getBigDecimal("subtotal_with_discount"));
        salesFlatQuote.setBaseSubtotalWithDiscount(rs.getBigDecimal("base_subtotal_with_discount"));
        salesFlatQuote.setIsChanged(rs.getInt("is_changed"));
        salesFlatQuote.setTriggerRecollect(rs.getInt("trigger_recollect"));
        salesFlatQuote.setExtShippingInfo(rs.getString("ext_shipping_info"));
        salesFlatQuote.setGiftMessageId(rs.getInt("gift_message_id"));
        salesFlatQuote.setIsPersistent(rs.getInt("is_persistent"));
        return salesFlatQuote;
    }

}

