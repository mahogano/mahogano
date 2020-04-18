package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesFlatCreditmemoItem;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesFlatCreditmemoItemMapper implements RowMapper<SalesFlatCreditmemoItem> {

    @Override
    public SalesFlatCreditmemoItem mapRow(ResultSet rs, int i) throws SQLException {
        SalesFlatCreditmemoItem salesFlatCreditmemoItem = new SalesFlatCreditmemoItem();
        salesFlatCreditmemoItem.setEntityId(rs.getInt("entity_id"));
        salesFlatCreditmemoItem.setParentId(rs.getInt("parent_id"));
        salesFlatCreditmemoItem.setBasePrice(rs.getBigDecimal("base_price"));
        salesFlatCreditmemoItem.setTaxAmount(rs.getBigDecimal("tax_amount"));
        salesFlatCreditmemoItem.setBaseRowTotal(rs.getBigDecimal("base_row_total"));
        salesFlatCreditmemoItem.setDiscountAmount(rs.getBigDecimal("discount_amount"));
        salesFlatCreditmemoItem.setRowTotal(rs.getBigDecimal("row_total"));
        salesFlatCreditmemoItem.setBaseDiscountAmount(rs.getBigDecimal("base_discount_amount"));
        salesFlatCreditmemoItem.setPriceInclTax(rs.getBigDecimal("price_incl_tax"));
        salesFlatCreditmemoItem.setBaseTaxAmount(rs.getBigDecimal("base_tax_amount"));
        salesFlatCreditmemoItem.setBasePriceInclTax(rs.getBigDecimal("base_price_incl_tax"));
        salesFlatCreditmemoItem.setQty(rs.getBigDecimal("qty"));
        salesFlatCreditmemoItem.setBaseCost(rs.getBigDecimal("base_cost"));
        salesFlatCreditmemoItem.setPrice(rs.getBigDecimal("price"));
        salesFlatCreditmemoItem.setBaseRowTotalInclTax(rs.getBigDecimal("base_row_total_incl_tax"));
        salesFlatCreditmemoItem.setRowTotalInclTax(rs.getBigDecimal("row_total_incl_tax"));
        salesFlatCreditmemoItem.setProductId(rs.getInt("product_id"));
        salesFlatCreditmemoItem.setOrderItemId(rs.getInt("order_item_id"));
        salesFlatCreditmemoItem.setAdditionalData(rs.getString("additional_data"));
        salesFlatCreditmemoItem.setDescription(rs.getString("description"));
        salesFlatCreditmemoItem.setSku(rs.getString("sku"));
        salesFlatCreditmemoItem.setName(rs.getString("name"));
        salesFlatCreditmemoItem.setHiddenTaxAmount(rs.getBigDecimal("hidden_tax_amount"));
        salesFlatCreditmemoItem.setBaseHiddenTaxAmount(rs.getBigDecimal("base_hidden_tax_amount"));
        salesFlatCreditmemoItem.setWeeeTaxDisposition(rs.getBigDecimal("weee_tax_disposition"));
        salesFlatCreditmemoItem.setWeeeTaxRowDisposition(rs.getBigDecimal("weee_tax_row_disposition"));
        salesFlatCreditmemoItem.setBaseWeeeTaxDisposition(rs.getBigDecimal("base_weee_tax_disposition"));
        salesFlatCreditmemoItem.setBaseWeeeTaxRowDisposition(rs.getBigDecimal("base_weee_tax_row_disposition"));
        salesFlatCreditmemoItem.setWeeeTaxApplied(rs.getString("weee_tax_applied"));
        salesFlatCreditmemoItem.setBaseWeeeTaxAppliedAmount(rs.getBigDecimal("base_weee_tax_applied_amount"));
        salesFlatCreditmemoItem.setBaseWeeeTaxAppliedRowAmnt(rs.getBigDecimal("base_weee_tax_applied_row_amnt"));
        salesFlatCreditmemoItem.setWeeeTaxAppliedAmount(rs.getBigDecimal("weee_tax_applied_amount"));
        salesFlatCreditmemoItem.setWeeeTaxAppliedRowAmount(rs.getBigDecimal("weee_tax_applied_row_amount"));
        return salesFlatCreditmemoItem;
    }

}

