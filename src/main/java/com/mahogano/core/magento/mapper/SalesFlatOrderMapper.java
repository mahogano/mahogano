package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesFlatOrder;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesFlatOrderMapper implements RowMapper<SalesFlatOrder> {

    @Override
    public SalesFlatOrder mapRow(ResultSet rs, int i) throws SQLException {
        SalesFlatOrder salesFlatOrder = new SalesFlatOrder();
        salesFlatOrder.setEntityId(rs.getInt("entity_id"));
        salesFlatOrder.setState(rs.getString("state"));
        salesFlatOrder.setStatus(rs.getString("status"));
        salesFlatOrder.setCouponCode(rs.getString("coupon_code"));
        salesFlatOrder.setProtectCode(rs.getString("protect_code"));
        salesFlatOrder.setShippingDescription(rs.getString("shipping_description"));
        salesFlatOrder.setIsVirtual(rs.getInt("is_virtual"));
        salesFlatOrder.setStoreId(rs.getInt("store_id"));
        salesFlatOrder.setCustomerId(rs.getInt("customer_id"));
        salesFlatOrder.setBaseDiscountAmount(rs.getBigDecimal("base_discount_amount"));
        salesFlatOrder.setBaseDiscountCanceled(rs.getBigDecimal("base_discount_canceled"));
        salesFlatOrder.setBaseDiscountInvoiced(rs.getBigDecimal("base_discount_invoiced"));
        salesFlatOrder.setBaseDiscountRefunded(rs.getBigDecimal("base_discount_refunded"));
        salesFlatOrder.setBaseGrandTotal(rs.getBigDecimal("base_grand_total"));
        salesFlatOrder.setBaseShippingAmount(rs.getBigDecimal("base_shipping_amount"));
        salesFlatOrder.setBaseShippingCanceled(rs.getBigDecimal("base_shipping_canceled"));
        salesFlatOrder.setBaseShippingInvoiced(rs.getBigDecimal("base_shipping_invoiced"));
        salesFlatOrder.setBaseShippingRefunded(rs.getBigDecimal("base_shipping_refunded"));
        salesFlatOrder.setBaseShippingTaxAmount(rs.getBigDecimal("base_shipping_tax_amount"));
        salesFlatOrder.setBaseShippingTaxRefunded(rs.getBigDecimal("base_shipping_tax_refunded"));
        salesFlatOrder.setBaseSubtotal(rs.getBigDecimal("base_subtotal"));
        salesFlatOrder.setBaseSubtotalCanceled(rs.getBigDecimal("base_subtotal_canceled"));
        salesFlatOrder.setBaseSubtotalInvoiced(rs.getBigDecimal("base_subtotal_invoiced"));
        salesFlatOrder.setBaseSubtotalRefunded(rs.getBigDecimal("base_subtotal_refunded"));
        salesFlatOrder.setBaseTaxAmount(rs.getBigDecimal("base_tax_amount"));
        salesFlatOrder.setBaseTaxCanceled(rs.getBigDecimal("base_tax_canceled"));
        salesFlatOrder.setBaseTaxInvoiced(rs.getBigDecimal("base_tax_invoiced"));
        salesFlatOrder.setBaseTaxRefunded(rs.getBigDecimal("base_tax_refunded"));
        salesFlatOrder.setBaseToGlobalRate(rs.getBigDecimal("base_to_global_rate"));
        salesFlatOrder.setBaseToOrderRate(rs.getBigDecimal("base_to_order_rate"));
        salesFlatOrder.setBaseTotalCanceled(rs.getBigDecimal("base_total_canceled"));
        salesFlatOrder.setBaseTotalInvoiced(rs.getBigDecimal("base_total_invoiced"));
        salesFlatOrder.setBaseTotalInvoicedCost(rs.getBigDecimal("base_total_invoiced_cost"));
        salesFlatOrder.setBaseTotalOfflineRefunded(rs.getBigDecimal("base_total_offline_refunded"));
        salesFlatOrder.setBaseTotalOnlineRefunded(rs.getBigDecimal("base_total_online_refunded"));
        salesFlatOrder.setBaseTotalPaid(rs.getBigDecimal("base_total_paid"));
        salesFlatOrder.setBaseTotalQtyOrdered(rs.getBigDecimal("base_total_qty_ordered"));
        salesFlatOrder.setBaseTotalRefunded(rs.getBigDecimal("base_total_refunded"));
        salesFlatOrder.setDiscountAmount(rs.getBigDecimal("discount_amount"));
        salesFlatOrder.setDiscountCanceled(rs.getBigDecimal("discount_canceled"));
        salesFlatOrder.setDiscountInvoiced(rs.getBigDecimal("discount_invoiced"));
        salesFlatOrder.setDiscountRefunded(rs.getBigDecimal("discount_refunded"));
        salesFlatOrder.setGrandTotal(rs.getBigDecimal("grand_total"));
        salesFlatOrder.setShippingAmount(rs.getBigDecimal("shipping_amount"));
        salesFlatOrder.setShippingCanceled(rs.getBigDecimal("shipping_canceled"));
        salesFlatOrder.setShippingInvoiced(rs.getBigDecimal("shipping_invoiced"));
        salesFlatOrder.setShippingRefunded(rs.getBigDecimal("shipping_refunded"));
        salesFlatOrder.setShippingTaxAmount(rs.getBigDecimal("shipping_tax_amount"));
        salesFlatOrder.setShippingTaxRefunded(rs.getBigDecimal("shipping_tax_refunded"));
        salesFlatOrder.setStoreToBaseRate(rs.getBigDecimal("store_to_base_rate"));
        salesFlatOrder.setStoreToOrderRate(rs.getBigDecimal("store_to_order_rate"));
        salesFlatOrder.setSubtotal(rs.getBigDecimal("subtotal"));
        salesFlatOrder.setSubtotalCanceled(rs.getBigDecimal("subtotal_canceled"));
        salesFlatOrder.setSubtotalInvoiced(rs.getBigDecimal("subtotal_invoiced"));
        salesFlatOrder.setSubtotalRefunded(rs.getBigDecimal("subtotal_refunded"));
        salesFlatOrder.setTaxAmount(rs.getBigDecimal("tax_amount"));
        salesFlatOrder.setTaxCanceled(rs.getBigDecimal("tax_canceled"));
        salesFlatOrder.setTaxInvoiced(rs.getBigDecimal("tax_invoiced"));
        salesFlatOrder.setTaxRefunded(rs.getBigDecimal("tax_refunded"));
        salesFlatOrder.setTotalCanceled(rs.getBigDecimal("total_canceled"));
        salesFlatOrder.setTotalInvoiced(rs.getBigDecimal("total_invoiced"));
        salesFlatOrder.setTotalOfflineRefunded(rs.getBigDecimal("total_offline_refunded"));
        salesFlatOrder.setTotalOnlineRefunded(rs.getBigDecimal("total_online_refunded"));
        salesFlatOrder.setTotalPaid(rs.getBigDecimal("total_paid"));
        salesFlatOrder.setTotalQtyOrdered(rs.getBigDecimal("total_qty_ordered"));
        salesFlatOrder.setTotalRefunded(rs.getBigDecimal("total_refunded"));
        salesFlatOrder.setCanShipPartially(rs.getInt("can_ship_partially"));
        salesFlatOrder.setCanShipPartiallyItem(rs.getInt("can_ship_partially_item"));
        salesFlatOrder.setCustomerIsGuest(rs.getInt("customer_is_guest"));
        salesFlatOrder.setCustomerNoteNotify(rs.getInt("customer_note_notify"));
        salesFlatOrder.setBillingAddressId(rs.getInt("billing_address_id"));
        salesFlatOrder.setCustomerGroupId(rs.getInt("customer_group_id"));
        salesFlatOrder.setEditIncrement(rs.getInt("edit_increment"));
        salesFlatOrder.setEmailSent(rs.getInt("email_sent"));
        salesFlatOrder.setForcedShipmentWithInvoice(rs.getInt("forced_shipment_with_invoice"));
        salesFlatOrder.setPaymentAuthExpiration(rs.getInt("payment_auth_expiration"));
        salesFlatOrder.setQuoteAddressId(rs.getInt("quote_address_id"));
        salesFlatOrder.setQuoteId(rs.getInt("quote_id"));
        salesFlatOrder.setShippingAddressId(rs.getInt("shipping_address_id"));
        salesFlatOrder.setAdjustmentNegative(rs.getBigDecimal("adjustment_negative"));
        salesFlatOrder.setAdjustmentPositive(rs.getBigDecimal("adjustment_positive"));
        salesFlatOrder.setBaseAdjustmentNegative(rs.getBigDecimal("base_adjustment_negative"));
        salesFlatOrder.setBaseAdjustmentPositive(rs.getBigDecimal("base_adjustment_positive"));
        salesFlatOrder.setBaseShippingDiscountAmount(rs.getBigDecimal("base_shipping_discount_amount"));
        salesFlatOrder.setBaseSubtotalInclTax(rs.getBigDecimal("base_subtotal_incl_tax"));
        salesFlatOrder.setBaseTotalDue(rs.getBigDecimal("base_total_due"));
        salesFlatOrder.setPaymentAuthorizationAmount(rs.getBigDecimal("payment_authorization_amount"));
        salesFlatOrder.setShippingDiscountAmount(rs.getBigDecimal("shipping_discount_amount"));
        salesFlatOrder.setSubtotalInclTax(rs.getBigDecimal("subtotal_incl_tax"));
        salesFlatOrder.setTotalDue(rs.getBigDecimal("total_due"));
        salesFlatOrder.setWeight(rs.getBigDecimal("weight"));
        salesFlatOrder.setCustomerDob(rs.getTimestamp("customer_dob") != null ? rs.getTimestamp("customer_dob").toLocalDateTime() : null);
        salesFlatOrder.setIncrementId(rs.getString("increment_id"));
        salesFlatOrder.setAppliedRuleIds(rs.getString("applied_rule_ids"));
        salesFlatOrder.setBaseCurrencyCode(rs.getString("base_currency_code"));
        salesFlatOrder.setCustomerEmail(rs.getString("customer_email"));
        salesFlatOrder.setCustomerFirstname(rs.getString("customer_firstname"));
        salesFlatOrder.setCustomerLastname(rs.getString("customer_lastname"));
        salesFlatOrder.setCustomerMiddlename(rs.getString("customer_middlename"));
        salesFlatOrder.setCustomerPrefix(rs.getString("customer_prefix"));
        salesFlatOrder.setCustomerSuffix(rs.getString("customer_suffix"));
        salesFlatOrder.setCustomerTaxvat(rs.getString("customer_taxvat"));
        salesFlatOrder.setDiscountDescription(rs.getString("discount_description"));
        salesFlatOrder.setExtCustomerId(rs.getString("ext_customer_id"));
        salesFlatOrder.setExtOrderId(rs.getString("ext_order_id"));
        salesFlatOrder.setGlobalCurrencyCode(rs.getString("global_currency_code"));
        salesFlatOrder.setHoldBeforeState(rs.getString("hold_before_state"));
        salesFlatOrder.setHoldBeforeStatus(rs.getString("hold_before_status"));
        salesFlatOrder.setOrderCurrencyCode(rs.getString("order_currency_code"));
        salesFlatOrder.setOriginalIncrementId(rs.getString("original_increment_id"));
        salesFlatOrder.setRelationChildId(rs.getString("relation_child_id"));
        salesFlatOrder.setRelationChildRealId(rs.getString("relation_child_real_id"));
        salesFlatOrder.setRelationParentId(rs.getString("relation_parent_id"));
        salesFlatOrder.setRelationParentRealId(rs.getString("relation_parent_real_id"));
        salesFlatOrder.setRemoteIp(rs.getString("remote_ip"));
        salesFlatOrder.setShippingMethod(rs.getString("shipping_method"));
        salesFlatOrder.setStoreCurrencyCode(rs.getString("store_currency_code"));
        salesFlatOrder.setStoreName(rs.getString("store_name"));
        salesFlatOrder.setXForwardedFor(rs.getString("x_forwarded_for"));
        salesFlatOrder.setCustomerNote(rs.getString("customer_note"));
        salesFlatOrder.setCreatedAt(rs.getTimestamp("created_at") != null ? rs.getTimestamp("created_at").toLocalDateTime() : null);
        salesFlatOrder.setUpdatedAt(rs.getTimestamp("updated_at") != null ? rs.getTimestamp("updated_at").toLocalDateTime() : null);
        salesFlatOrder.setTotalItemCount(rs.getInt("total_item_count"));
        salesFlatOrder.setCustomerGender(rs.getInt("customer_gender"));
        salesFlatOrder.setHiddenTaxAmount(rs.getBigDecimal("hidden_tax_amount"));
        salesFlatOrder.setBaseHiddenTaxAmount(rs.getBigDecimal("base_hidden_tax_amount"));
        salesFlatOrder.setShippingHiddenTaxAmount(rs.getBigDecimal("shipping_hidden_tax_amount"));
        salesFlatOrder.setBaseShippingHiddenTaxAmnt(rs.getBigDecimal("base_shipping_hidden_tax_amnt"));
        salesFlatOrder.setHiddenTaxInvoiced(rs.getBigDecimal("hidden_tax_invoiced"));
        salesFlatOrder.setBaseHiddenTaxInvoiced(rs.getBigDecimal("base_hidden_tax_invoiced"));
        salesFlatOrder.setHiddenTaxRefunded(rs.getBigDecimal("hidden_tax_refunded"));
        salesFlatOrder.setBaseHiddenTaxRefunded(rs.getBigDecimal("base_hidden_tax_refunded"));
        salesFlatOrder.setShippingInclTax(rs.getBigDecimal("shipping_incl_tax"));
        salesFlatOrder.setBaseShippingInclTax(rs.getBigDecimal("base_shipping_incl_tax"));
        salesFlatOrder.setCouponRuleName(rs.getString("coupon_rule_name"));
        salesFlatOrder.setPaypalIpnCustomerNotified(rs.getInt("paypal_ipn_customer_notified"));
        salesFlatOrder.setGiftMessageId(rs.getInt("gift_message_id"));
        return salesFlatOrder;
    }

}
