package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesFlatInvoiceItem;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesFlatInvoiceItemMapper implements RowMapper<SalesFlatInvoiceItem> {

    @Override
    public SalesFlatInvoiceItem mapRow(ResultSet rs, int i) throws SQLException {
        SalesFlatInvoiceItem salesFlatInvoiceItem = new SalesFlatInvoiceItem();
        salesFlatInvoiceItem.setEntityId(rs.getInt("entity_id"));
        salesFlatInvoiceItem.setParentId(rs.getInt("parent_id"));
        salesFlatInvoiceItem.setBasePrice(rs.getBigDecimal("base_price"));
        salesFlatInvoiceItem.setTaxAmount(rs.getBigDecimal("tax_amount"));
        salesFlatInvoiceItem.setBaseRowTotal(rs.getBigDecimal("base_row_total"));
        salesFlatInvoiceItem.setDiscountAmount(rs.getBigDecimal("discount_amount"));
        salesFlatInvoiceItem.setRowTotal(rs.getBigDecimal("row_total"));
        salesFlatInvoiceItem.setBaseDiscountAmount(rs.getBigDecimal("base_discount_amount"));
        salesFlatInvoiceItem.setPriceInclTax(rs.getBigDecimal("price_incl_tax"));
        salesFlatInvoiceItem.setBaseTaxAmount(rs.getBigDecimal("base_tax_amount"));
        salesFlatInvoiceItem.setBasePriceInclTax(rs.getBigDecimal("base_price_incl_tax"));
        salesFlatInvoiceItem.setQty(rs.getBigDecimal("qty"));
        salesFlatInvoiceItem.setBaseCost(rs.getBigDecimal("base_cost"));
        salesFlatInvoiceItem.setPrice(rs.getBigDecimal("price"));
        salesFlatInvoiceItem.setBaseRowTotalInclTax(rs.getBigDecimal("base_row_total_incl_tax"));
        salesFlatInvoiceItem.setRowTotalInclTax(rs.getBigDecimal("row_total_incl_tax"));
        salesFlatInvoiceItem.setProductId(rs.getInt("product_id"));
        salesFlatInvoiceItem.setOrderItemId(rs.getInt("order_item_id"));
        salesFlatInvoiceItem.setAdditionalData(rs.getString("additional_data"));
        salesFlatInvoiceItem.setDescription(rs.getString("description"));
        salesFlatInvoiceItem.setSku(rs.getString("sku"));
        salesFlatInvoiceItem.setName(rs.getString("name"));
        salesFlatInvoiceItem.setHiddenTaxAmount(rs.getBigDecimal("hidden_tax_amount"));
        salesFlatInvoiceItem.setBaseHiddenTaxAmount(rs.getBigDecimal("base_hidden_tax_amount"));
        salesFlatInvoiceItem.setBaseWeeeTaxAppliedAmount(rs.getBigDecimal("base_weee_tax_applied_amount"));
        salesFlatInvoiceItem.setBaseWeeeTaxAppliedRowAmnt(rs.getBigDecimal("base_weee_tax_applied_row_amnt"));
        salesFlatInvoiceItem.setWeeeTaxAppliedAmount(rs.getBigDecimal("weee_tax_applied_amount"));
        salesFlatInvoiceItem.setWeeeTaxAppliedRowAmount(rs.getBigDecimal("weee_tax_applied_row_amount"));
        salesFlatInvoiceItem.setWeeeTaxApplied(rs.getString("weee_tax_applied"));
        salesFlatInvoiceItem.setWeeeTaxDisposition(rs.getBigDecimal("weee_tax_disposition"));
        salesFlatInvoiceItem.setWeeeTaxRowDisposition(rs.getBigDecimal("weee_tax_row_disposition"));
        salesFlatInvoiceItem.setBaseWeeeTaxDisposition(rs.getBigDecimal("base_weee_tax_disposition"));
        salesFlatInvoiceItem.setBaseWeeeTaxRowDisposition(rs.getBigDecimal("base_weee_tax_row_disposition"));
        return salesFlatInvoiceItem;
    }

}

