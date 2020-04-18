package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesFlatCreditmemo;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesFlatCreditmemoMapper implements RowMapper<SalesFlatCreditmemo> {

    @Override
    public SalesFlatCreditmemo mapRow(ResultSet rs, int i) throws SQLException {
        SalesFlatCreditmemo salesFlatCreditmemo = new SalesFlatCreditmemo();
        salesFlatCreditmemo.setEntityId(rs.getInt("entity_id"));
        salesFlatCreditmemo.setStoreId(rs.getInt("store_id"));
        salesFlatCreditmemo.setAdjustmentPositive(rs.getBigDecimal("adjustment_positive"));
        salesFlatCreditmemo.setBaseShippingTaxAmount(rs.getBigDecimal("base_shipping_tax_amount"));
        salesFlatCreditmemo.setStoreToOrderRate(rs.getBigDecimal("store_to_order_rate"));
        salesFlatCreditmemo.setBaseDiscountAmount(rs.getBigDecimal("base_discount_amount"));
        salesFlatCreditmemo.setBaseToOrderRate(rs.getBigDecimal("base_to_order_rate"));
        salesFlatCreditmemo.setGrandTotal(rs.getBigDecimal("grand_total"));
        salesFlatCreditmemo.setBaseAdjustmentNegative(rs.getBigDecimal("base_adjustment_negative"));
        salesFlatCreditmemo.setBaseSubtotalInclTax(rs.getBigDecimal("base_subtotal_incl_tax"));
        salesFlatCreditmemo.setShippingAmount(rs.getBigDecimal("shipping_amount"));
        salesFlatCreditmemo.setSubtotalInclTax(rs.getBigDecimal("subtotal_incl_tax"));
        salesFlatCreditmemo.setAdjustmentNegative(rs.getBigDecimal("adjustment_negative"));
        salesFlatCreditmemo.setBaseShippingAmount(rs.getBigDecimal("base_shipping_amount"));
        salesFlatCreditmemo.setStoreToBaseRate(rs.getBigDecimal("store_to_base_rate"));
        salesFlatCreditmemo.setBaseToGlobalRate(rs.getBigDecimal("base_to_global_rate"));
        salesFlatCreditmemo.setBaseAdjustment(rs.getBigDecimal("base_adjustment"));
        salesFlatCreditmemo.setBaseSubtotal(rs.getBigDecimal("base_subtotal"));
        salesFlatCreditmemo.setDiscountAmount(rs.getBigDecimal("discount_amount"));
        salesFlatCreditmemo.setSubtotal(rs.getBigDecimal("subtotal"));
        salesFlatCreditmemo.setAdjustment(rs.getBigDecimal("adjustment"));
        salesFlatCreditmemo.setBaseGrandTotal(rs.getBigDecimal("base_grand_total"));
        salesFlatCreditmemo.setBaseAdjustmentPositive(rs.getBigDecimal("base_adjustment_positive"));
        salesFlatCreditmemo.setBaseTaxAmount(rs.getBigDecimal("base_tax_amount"));
        salesFlatCreditmemo.setShippingTaxAmount(rs.getBigDecimal("shipping_tax_amount"));
        salesFlatCreditmemo.setTaxAmount(rs.getBigDecimal("tax_amount"));
        salesFlatCreditmemo.setOrderId(rs.getInt("order_id"));
        salesFlatCreditmemo.setEmailSent(rs.getInt("email_sent"));
        salesFlatCreditmemo.setCreditmemoStatus(rs.getInt("creditmemo_status"));
        salesFlatCreditmemo.setState(rs.getInt("state"));
        salesFlatCreditmemo.setShippingAddressId(rs.getInt("shipping_address_id"));
        salesFlatCreditmemo.setBillingAddressId(rs.getInt("billing_address_id"));
        salesFlatCreditmemo.setInvoiceId(rs.getInt("invoice_id"));
        salesFlatCreditmemo.setStoreCurrencyCode(rs.getString("store_currency_code"));
        salesFlatCreditmemo.setOrderCurrencyCode(rs.getString("order_currency_code"));
        salesFlatCreditmemo.setBaseCurrencyCode(rs.getString("base_currency_code"));
        salesFlatCreditmemo.setGlobalCurrencyCode(rs.getString("global_currency_code"));
        salesFlatCreditmemo.setTransactionId(rs.getString("transaction_id"));
        salesFlatCreditmemo.setIncrementId(rs.getString("increment_id"));
        salesFlatCreditmemo.setCreatedAt(rs.getTimestamp("created_at") != null ? rs.getTimestamp("created_at").toLocalDateTime() : null);
        salesFlatCreditmemo.setUpdatedAt(rs.getTimestamp("updated_at") != null ? rs.getTimestamp("updated_at").toLocalDateTime() : null);
        salesFlatCreditmemo.setHiddenTaxAmount(rs.getBigDecimal("hidden_tax_amount"));
        salesFlatCreditmemo.setBaseHiddenTaxAmount(rs.getBigDecimal("base_hidden_tax_amount"));
        salesFlatCreditmemo.setShippingHiddenTaxAmount(rs.getBigDecimal("shipping_hidden_tax_amount"));
        salesFlatCreditmemo.setBaseShippingHiddenTaxAmnt(rs.getBigDecimal("base_shipping_hidden_tax_amnt"));
        salesFlatCreditmemo.setShippingInclTax(rs.getBigDecimal("shipping_incl_tax"));
        salesFlatCreditmemo.setBaseShippingInclTax(rs.getBigDecimal("base_shipping_incl_tax"));
        salesFlatCreditmemo.setDiscountDescription(rs.getString("discount_description"));
        return salesFlatCreditmemo;
    }

}

