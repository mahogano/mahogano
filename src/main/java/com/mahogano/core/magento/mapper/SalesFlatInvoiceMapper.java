package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesFlatInvoice;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesFlatInvoiceMapper implements RowMapper<SalesFlatInvoice> {

    @Override
    public SalesFlatInvoice mapRow(ResultSet rs, int i) throws SQLException {
        SalesFlatInvoice salesFlatInvoice = new SalesFlatInvoice();
        salesFlatInvoice.setEntityId(rs.getInt("entity_id"));
        salesFlatInvoice.setStoreId(rs.getInt("store_id"));
        salesFlatInvoice.setBaseGrandTotal(rs.getBigDecimal("base_grand_total"));
        salesFlatInvoice.setShippingTaxAmount(rs.getBigDecimal("shipping_tax_amount"));
        salesFlatInvoice.setTaxAmount(rs.getBigDecimal("tax_amount"));
        salesFlatInvoice.setBaseTaxAmount(rs.getBigDecimal("base_tax_amount"));
        salesFlatInvoice.setStoreToOrderRate(rs.getBigDecimal("store_to_order_rate"));
        salesFlatInvoice.setBaseShippingTaxAmount(rs.getBigDecimal("base_shipping_tax_amount"));
        salesFlatInvoice.setBaseDiscountAmount(rs.getBigDecimal("base_discount_amount"));
        salesFlatInvoice.setBaseToOrderRate(rs.getBigDecimal("base_to_order_rate"));
        salesFlatInvoice.setGrandTotal(rs.getBigDecimal("grand_total"));
        salesFlatInvoice.setShippingAmount(rs.getBigDecimal("shipping_amount"));
        salesFlatInvoice.setSubtotalInclTax(rs.getBigDecimal("subtotal_incl_tax"));
        salesFlatInvoice.setBaseSubtotalInclTax(rs.getBigDecimal("base_subtotal_incl_tax"));
        salesFlatInvoice.setStoreToBaseRate(rs.getBigDecimal("store_to_base_rate"));
        salesFlatInvoice.setBaseShippingAmount(rs.getBigDecimal("base_shipping_amount"));
        salesFlatInvoice.setTotalQty(rs.getBigDecimal("total_qty"));
        salesFlatInvoice.setBaseToGlobalRate(rs.getBigDecimal("base_to_global_rate"));
        salesFlatInvoice.setSubtotal(rs.getBigDecimal("subtotal"));
        salesFlatInvoice.setBaseSubtotal(rs.getBigDecimal("base_subtotal"));
        salesFlatInvoice.setDiscountAmount(rs.getBigDecimal("discount_amount"));
        salesFlatInvoice.setBillingAddressId(rs.getInt("billing_address_id"));
        salesFlatInvoice.setIsUsedForRefund(rs.getInt("is_used_for_refund"));
        salesFlatInvoice.setOrderId(rs.getInt("order_id"));
        salesFlatInvoice.setEmailSent(rs.getInt("email_sent"));
        salesFlatInvoice.setCanVoidFlag(rs.getInt("can_void_flag"));
        salesFlatInvoice.setState(rs.getInt("state"));
        salesFlatInvoice.setShippingAddressId(rs.getInt("shipping_address_id"));
        salesFlatInvoice.setStoreCurrencyCode(rs.getString("store_currency_code"));
        salesFlatInvoice.setTransactionId(rs.getString("transaction_id"));
        salesFlatInvoice.setOrderCurrencyCode(rs.getString("order_currency_code"));
        salesFlatInvoice.setBaseCurrencyCode(rs.getString("base_currency_code"));
        salesFlatInvoice.setGlobalCurrencyCode(rs.getString("global_currency_code"));
        salesFlatInvoice.setIncrementId(rs.getString("increment_id"));
        salesFlatInvoice.setCreatedAt(rs.getTimestamp("created_at") != null ? rs.getTimestamp("created_at").toLocalDateTime() : null);
        salesFlatInvoice.setUpdatedAt(rs.getTimestamp("updated_at") != null ? rs.getTimestamp("updated_at").toLocalDateTime() : null);
        salesFlatInvoice.setHiddenTaxAmount(rs.getBigDecimal("hidden_tax_amount"));
        salesFlatInvoice.setBaseHiddenTaxAmount(rs.getBigDecimal("base_hidden_tax_amount"));
        salesFlatInvoice.setShippingHiddenTaxAmount(rs.getBigDecimal("shipping_hidden_tax_amount"));
        salesFlatInvoice.setBaseShippingHiddenTaxAmnt(rs.getBigDecimal("base_shipping_hidden_tax_amnt"));
        salesFlatInvoice.setShippingInclTax(rs.getBigDecimal("shipping_incl_tax"));
        salesFlatInvoice.setBaseShippingInclTax(rs.getBigDecimal("base_shipping_incl_tax"));
        salesFlatInvoice.setBaseTotalRefunded(rs.getBigDecimal("base_total_refunded"));
        salesFlatInvoice.setDiscountDescription(rs.getString("discount_description"));
        return salesFlatInvoice;
    }

}

