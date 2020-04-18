package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesFlatQuoteItem;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesFlatQuoteItemMapper implements RowMapper<SalesFlatQuoteItem> {

    @Override
    public SalesFlatQuoteItem mapRow(ResultSet rs, int i) throws SQLException {
        SalesFlatQuoteItem salesFlatQuoteItem = new SalesFlatQuoteItem();
        salesFlatQuoteItem.setItemId(rs.getInt("item_id"));
        salesFlatQuoteItem.setQuoteId(rs.getInt("quote_id"));
        salesFlatQuoteItem.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        salesFlatQuoteItem.setUpdatedAt(rs.getTimestamp("updated_at").toLocalDateTime());
        salesFlatQuoteItem.setProductId(rs.getInt("product_id"));
        salesFlatQuoteItem.setStoreId(rs.getInt("store_id"));
        salesFlatQuoteItem.setParentItemId(rs.getInt("parent_item_id"));
        salesFlatQuoteItem.setIsVirtual(rs.getInt("is_virtual"));
        salesFlatQuoteItem.setSku(rs.getString("sku"));
        salesFlatQuoteItem.setName(rs.getString("name"));
        salesFlatQuoteItem.setDescription(rs.getString("description"));
        salesFlatQuoteItem.setAppliedRuleIds(rs.getString("applied_rule_ids"));
        salesFlatQuoteItem.setAdditionalData(rs.getString("additional_data"));
        salesFlatQuoteItem.setFreeShipping(rs.getInt("free_shipping"));
        salesFlatQuoteItem.setIsQtyDecimal(rs.getInt("is_qty_decimal"));
        salesFlatQuoteItem.setNoDiscount(rs.getInt("no_discount"));
        salesFlatQuoteItem.setWeight(rs.getBigDecimal("weight"));
        salesFlatQuoteItem.setQty(rs.getBigDecimal("qty"));
        salesFlatQuoteItem.setPrice(rs.getBigDecimal("price"));
        salesFlatQuoteItem.setBasePrice(rs.getBigDecimal("base_price"));
        salesFlatQuoteItem.setCustomPrice(rs.getBigDecimal("custom_price"));
        salesFlatQuoteItem.setDiscountPercent(rs.getBigDecimal("discount_percent"));
        salesFlatQuoteItem.setDiscountAmount(rs.getBigDecimal("discount_amount"));
        salesFlatQuoteItem.setBaseDiscountAmount(rs.getBigDecimal("base_discount_amount"));
        salesFlatQuoteItem.setTaxPercent(rs.getBigDecimal("tax_percent"));
        salesFlatQuoteItem.setTaxAmount(rs.getBigDecimal("tax_amount"));
        salesFlatQuoteItem.setBaseTaxAmount(rs.getBigDecimal("base_tax_amount"));
        salesFlatQuoteItem.setRowTotal(rs.getBigDecimal("row_total"));
        salesFlatQuoteItem.setBaseRowTotal(rs.getBigDecimal("base_row_total"));
        salesFlatQuoteItem.setRowTotalWithDiscount(rs.getBigDecimal("row_total_with_discount"));
        salesFlatQuoteItem.setRowWeight(rs.getBigDecimal("row_weight"));
        salesFlatQuoteItem.setProductType(rs.getString("product_type"));
        salesFlatQuoteItem.setBaseTaxBeforeDiscount(rs.getBigDecimal("base_tax_before_discount"));
        salesFlatQuoteItem.setTaxBeforeDiscount(rs.getBigDecimal("tax_before_discount"));
        salesFlatQuoteItem.setOriginalCustomPrice(rs.getBigDecimal("original_custom_price"));
        salesFlatQuoteItem.setRedirectUrl(rs.getString("redirect_url"));
        salesFlatQuoteItem.setBaseCost(rs.getBigDecimal("base_cost"));
        salesFlatQuoteItem.setPriceInclTax(rs.getBigDecimal("price_incl_tax"));
        salesFlatQuoteItem.setBasePriceInclTax(rs.getBigDecimal("base_price_incl_tax"));
        salesFlatQuoteItem.setRowTotalInclTax(rs.getBigDecimal("row_total_incl_tax"));
        salesFlatQuoteItem.setBaseRowTotalInclTax(rs.getBigDecimal("base_row_total_incl_tax"));
        salesFlatQuoteItem.setHiddenTaxAmount(rs.getBigDecimal("hidden_tax_amount"));
        salesFlatQuoteItem.setBaseHiddenTaxAmount(rs.getBigDecimal("base_hidden_tax_amount"));
        salesFlatQuoteItem.setGiftMessageId(rs.getInt("gift_message_id"));
        salesFlatQuoteItem.setWeeeTaxDisposition(rs.getBigDecimal("weee_tax_disposition"));
        salesFlatQuoteItem.setWeeeTaxRowDisposition(rs.getBigDecimal("weee_tax_row_disposition"));
        salesFlatQuoteItem.setBaseWeeeTaxDisposition(rs.getBigDecimal("base_weee_tax_disposition"));
        salesFlatQuoteItem.setBaseWeeeTaxRowDisposition(rs.getBigDecimal("base_weee_tax_row_disposition"));
        salesFlatQuoteItem.setWeeeTaxApplied(rs.getString("weee_tax_applied"));
        salesFlatQuoteItem.setWeeeTaxAppliedAmount(rs.getBigDecimal("weee_tax_applied_amount"));
        salesFlatQuoteItem.setWeeeTaxAppliedRowAmount(rs.getBigDecimal("weee_tax_applied_row_amount"));
        salesFlatQuoteItem.setBaseWeeeTaxAppliedAmount(rs.getBigDecimal("base_weee_tax_applied_amount"));
        salesFlatQuoteItem.setBaseWeeeTaxAppliedRowAmnt(rs.getBigDecimal("base_weee_tax_applied_row_amnt"));
        return salesFlatQuoteItem;
    }

}

