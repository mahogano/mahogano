package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesFlatOrderItem;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesFlatOrderItemMapper implements RowMapper<SalesFlatOrderItem> {

    @Override
    public SalesFlatOrderItem mapRow(ResultSet rs, int i) throws SQLException {
        SalesFlatOrderItem salesFlatOrderItem = new SalesFlatOrderItem();
        salesFlatOrderItem.setItemId(rs.getInt("item_id"));
        salesFlatOrderItem.setOrderId(rs.getInt("order_id"));
        salesFlatOrderItem.setParentItemId(rs.getInt("parent_item_id"));
        salesFlatOrderItem.setQuoteItemId(rs.getInt("quote_item_id"));
        salesFlatOrderItem.setStoreId(rs.getInt("store_id"));
        salesFlatOrderItem.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        salesFlatOrderItem.setUpdatedAt(rs.getTimestamp("updated_at").toLocalDateTime());
        salesFlatOrderItem.setProductId(rs.getInt("product_id"));
        salesFlatOrderItem.setProductType(rs.getString("product_type"));
        salesFlatOrderItem.setProductOptions(rs.getString("product_options"));
        salesFlatOrderItem.setWeight(rs.getBigDecimal("weight"));
        salesFlatOrderItem.setIsVirtual(rs.getInt("is_virtual"));
        salesFlatOrderItem.setSku(rs.getString("sku"));
        salesFlatOrderItem.setName(rs.getString("name"));
        salesFlatOrderItem.setDescription(rs.getString("description"));
        salesFlatOrderItem.setAppliedRuleIds(rs.getString("applied_rule_ids"));
        salesFlatOrderItem.setAdditionalData(rs.getString("additional_data"));
        salesFlatOrderItem.setFreeShipping(rs.getInt("free_shipping"));
        salesFlatOrderItem.setIsQtyDecimal(rs.getInt("is_qty_decimal"));
        salesFlatOrderItem.setNoDiscount(rs.getInt("no_discount"));
        salesFlatOrderItem.setQtyBackordered(rs.getBigDecimal("qty_backordered"));
        salesFlatOrderItem.setQtyCanceled(rs.getBigDecimal("qty_canceled"));
        salesFlatOrderItem.setQtyInvoiced(rs.getBigDecimal("qty_invoiced"));
        salesFlatOrderItem.setQtyOrdered(rs.getBigDecimal("qty_ordered"));
        salesFlatOrderItem.setQtyRefunded(rs.getBigDecimal("qty_refunded"));
        salesFlatOrderItem.setQtyShipped(rs.getBigDecimal("qty_shipped"));
        salesFlatOrderItem.setBaseCost(rs.getBigDecimal("base_cost"));
        salesFlatOrderItem.setPrice(rs.getBigDecimal("price"));
        salesFlatOrderItem.setBasePrice(rs.getBigDecimal("base_price"));
        salesFlatOrderItem.setOriginalPrice(rs.getBigDecimal("original_price"));
        salesFlatOrderItem.setBaseOriginalPrice(rs.getBigDecimal("base_original_price"));
        salesFlatOrderItem.setTaxPercent(rs.getBigDecimal("tax_percent"));
        salesFlatOrderItem.setTaxAmount(rs.getBigDecimal("tax_amount"));
        salesFlatOrderItem.setBaseTaxAmount(rs.getBigDecimal("base_tax_amount"));
        salesFlatOrderItem.setTaxInvoiced(rs.getBigDecimal("tax_invoiced"));
        salesFlatOrderItem.setBaseTaxInvoiced(rs.getBigDecimal("base_tax_invoiced"));
        salesFlatOrderItem.setDiscountPercent(rs.getBigDecimal("discount_percent"));
        salesFlatOrderItem.setDiscountAmount(rs.getBigDecimal("discount_amount"));
        salesFlatOrderItem.setBaseDiscountAmount(rs.getBigDecimal("base_discount_amount"));
        salesFlatOrderItem.setDiscountInvoiced(rs.getBigDecimal("discount_invoiced"));
        salesFlatOrderItem.setBaseDiscountInvoiced(rs.getBigDecimal("base_discount_invoiced"));
        salesFlatOrderItem.setAmountRefunded(rs.getBigDecimal("amount_refunded"));
        salesFlatOrderItem.setBaseAmountRefunded(rs.getBigDecimal("base_amount_refunded"));
        salesFlatOrderItem.setRowTotal(rs.getBigDecimal("row_total"));
        salesFlatOrderItem.setBaseRowTotal(rs.getBigDecimal("base_row_total"));
        salesFlatOrderItem.setRowInvoiced(rs.getBigDecimal("row_invoiced"));
        salesFlatOrderItem.setBaseRowInvoiced(rs.getBigDecimal("base_row_invoiced"));
        salesFlatOrderItem.setRowWeight(rs.getBigDecimal("row_weight"));
        salesFlatOrderItem.setBaseTaxBeforeDiscount(rs.getBigDecimal("base_tax_before_discount"));
        salesFlatOrderItem.setTaxBeforeDiscount(rs.getBigDecimal("tax_before_discount"));
        salesFlatOrderItem.setExtOrderItemId(rs.getString("ext_order_item_id"));
        salesFlatOrderItem.setLockedDoInvoice(rs.getInt("locked_do_invoice"));
        salesFlatOrderItem.setLockedDoShip(rs.getInt("locked_do_ship"));
        salesFlatOrderItem.setPriceInclTax(rs.getBigDecimal("price_incl_tax"));
        salesFlatOrderItem.setBasePriceInclTax(rs.getBigDecimal("base_price_incl_tax"));
        salesFlatOrderItem.setRowTotalInclTax(rs.getBigDecimal("row_total_incl_tax"));
        salesFlatOrderItem.setBaseRowTotalInclTax(rs.getBigDecimal("base_row_total_incl_tax"));
        salesFlatOrderItem.setHiddenTaxAmount(rs.getBigDecimal("hidden_tax_amount"));
        salesFlatOrderItem.setBaseHiddenTaxAmount(rs.getBigDecimal("base_hidden_tax_amount"));
        salesFlatOrderItem.setHiddenTaxInvoiced(rs.getBigDecimal("hidden_tax_invoiced"));
        salesFlatOrderItem.setBaseHiddenTaxInvoiced(rs.getBigDecimal("base_hidden_tax_invoiced"));
        salesFlatOrderItem.setHiddenTaxRefunded(rs.getBigDecimal("hidden_tax_refunded"));
        salesFlatOrderItem.setBaseHiddenTaxRefunded(rs.getBigDecimal("base_hidden_tax_refunded"));
        salesFlatOrderItem.setIsNominal(rs.getInt("is_nominal"));
        salesFlatOrderItem.setTaxCanceled(rs.getBigDecimal("tax_canceled"));
        salesFlatOrderItem.setHiddenTaxCanceled(rs.getBigDecimal("hidden_tax_canceled"));
        salesFlatOrderItem.setTaxRefunded(rs.getBigDecimal("tax_refunded"));
        salesFlatOrderItem.setBaseTaxRefunded(rs.getBigDecimal("base_tax_refunded"));
        salesFlatOrderItem.setDiscountRefunded(rs.getBigDecimal("discount_refunded"));
        salesFlatOrderItem.setBaseDiscountRefunded(rs.getBigDecimal("base_discount_refunded"));
        salesFlatOrderItem.setGiftMessageId(rs.getInt("gift_message_id"));
        salesFlatOrderItem.setGiftMessageAvailable(rs.getInt("gift_message_available"));
        salesFlatOrderItem.setBaseWeeeTaxAppliedAmount(rs.getBigDecimal("base_weee_tax_applied_amount"));
        salesFlatOrderItem.setBaseWeeeTaxAppliedRowAmnt(rs.getBigDecimal("base_weee_tax_applied_row_amnt"));
        salesFlatOrderItem.setWeeeTaxAppliedAmount(rs.getBigDecimal("weee_tax_applied_amount"));
        salesFlatOrderItem.setWeeeTaxAppliedRowAmount(rs.getBigDecimal("weee_tax_applied_row_amount"));
        salesFlatOrderItem.setWeeeTaxApplied(rs.getString("weee_tax_applied"));
        salesFlatOrderItem.setWeeeTaxDisposition(rs.getBigDecimal("weee_tax_disposition"));
        salesFlatOrderItem.setWeeeTaxRowDisposition(rs.getBigDecimal("weee_tax_row_disposition"));
        salesFlatOrderItem.setBaseWeeeTaxDisposition(rs.getBigDecimal("base_weee_tax_disposition"));
        salesFlatOrderItem.setBaseWeeeTaxRowDisposition(rs.getBigDecimal("base_weee_tax_row_disposition"));
        return salesFlatOrderItem;
    }

}

