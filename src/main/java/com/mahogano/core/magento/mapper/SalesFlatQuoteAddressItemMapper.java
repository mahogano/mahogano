package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesFlatQuoteAddressItem;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesFlatQuoteAddressItemMapper implements RowMapper<SalesFlatQuoteAddressItem> {

    @Override
    public SalesFlatQuoteAddressItem mapRow(ResultSet rs, int i) throws SQLException {
        SalesFlatQuoteAddressItem salesFlatQuoteAddressItem = new SalesFlatQuoteAddressItem();
        salesFlatQuoteAddressItem.setAddressItemId(rs.getInt("address_item_id"));
        salesFlatQuoteAddressItem.setParentItemId(rs.getInt("parent_item_id"));
        salesFlatQuoteAddressItem.setQuoteAddressId(rs.getInt("quote_address_id"));
        salesFlatQuoteAddressItem.setQuoteItemId(rs.getInt("quote_item_id"));
        salesFlatQuoteAddressItem.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        salesFlatQuoteAddressItem.setUpdatedAt(rs.getTimestamp("updated_at").toLocalDateTime());
        salesFlatQuoteAddressItem.setAppliedRuleIds(rs.getString("applied_rule_ids"));
        salesFlatQuoteAddressItem.setAdditionalData(rs.getString("additional_data"));
        salesFlatQuoteAddressItem.setWeight(rs.getBigDecimal("weight"));
        salesFlatQuoteAddressItem.setQty(rs.getBigDecimal("qty"));
        salesFlatQuoteAddressItem.setDiscountAmount(rs.getBigDecimal("discount_amount"));
        salesFlatQuoteAddressItem.setTaxAmount(rs.getBigDecimal("tax_amount"));
        salesFlatQuoteAddressItem.setRowTotal(rs.getBigDecimal("row_total"));
        salesFlatQuoteAddressItem.setBaseRowTotal(rs.getBigDecimal("base_row_total"));
        salesFlatQuoteAddressItem.setRowTotalWithDiscount(rs.getBigDecimal("row_total_with_discount"));
        salesFlatQuoteAddressItem.setBaseDiscountAmount(rs.getBigDecimal("base_discount_amount"));
        salesFlatQuoteAddressItem.setBaseTaxAmount(rs.getBigDecimal("base_tax_amount"));
        salesFlatQuoteAddressItem.setRowWeight(rs.getBigDecimal("row_weight"));
        salesFlatQuoteAddressItem.setProductId(rs.getInt("product_id"));
        salesFlatQuoteAddressItem.setSuperProductId(rs.getInt("super_product_id"));
        salesFlatQuoteAddressItem.setParentProductId(rs.getInt("parent_product_id"));
        salesFlatQuoteAddressItem.setSku(rs.getString("sku"));
        salesFlatQuoteAddressItem.setImage(rs.getString("image"));
        salesFlatQuoteAddressItem.setName(rs.getString("name"));
        salesFlatQuoteAddressItem.setDescription(rs.getString("description"));
        salesFlatQuoteAddressItem.setFreeShipping(rs.getInt("free_shipping"));
        salesFlatQuoteAddressItem.setIsQtyDecimal(rs.getInt("is_qty_decimal"));
        salesFlatQuoteAddressItem.setPrice(rs.getBigDecimal("price"));
        salesFlatQuoteAddressItem.setDiscountPercent(rs.getBigDecimal("discount_percent"));
        salesFlatQuoteAddressItem.setNoDiscount(rs.getInt("no_discount"));
        salesFlatQuoteAddressItem.setTaxPercent(rs.getBigDecimal("tax_percent"));
        salesFlatQuoteAddressItem.setBasePrice(rs.getBigDecimal("base_price"));
        salesFlatQuoteAddressItem.setBaseCost(rs.getBigDecimal("base_cost"));
        salesFlatQuoteAddressItem.setPriceInclTax(rs.getBigDecimal("price_incl_tax"));
        salesFlatQuoteAddressItem.setBasePriceInclTax(rs.getBigDecimal("base_price_incl_tax"));
        salesFlatQuoteAddressItem.setRowTotalInclTax(rs.getBigDecimal("row_total_incl_tax"));
        salesFlatQuoteAddressItem.setBaseRowTotalInclTax(rs.getBigDecimal("base_row_total_incl_tax"));
        salesFlatQuoteAddressItem.setHiddenTaxAmount(rs.getBigDecimal("hidden_tax_amount"));
        salesFlatQuoteAddressItem.setBaseHiddenTaxAmount(rs.getBigDecimal("base_hidden_tax_amount"));
        salesFlatQuoteAddressItem.setGiftMessageId(rs.getInt("gift_message_id"));
        return salesFlatQuoteAddressItem;
    }

}

