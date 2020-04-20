package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.OrderDetail;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderDetailMapper implements RowMapper<OrderDetail> {

    @Override
    public OrderDetail mapRow(ResultSet rs, int i) throws SQLException {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setIdOrderDetail(rs.getInt("id_order_detail"));
        orderDetail.setIdOrder(rs.getInt("id_order"));
        orderDetail.setIdOrderInvoice(rs.getInt("id_order_invoice"));
        orderDetail.setIdWarehouse(rs.getInt("id_warehouse"));
        orderDetail.setIdShop(rs.getInt("id_shop"));
        orderDetail.setProductId(rs.getInt("product_id"));
        orderDetail.setProductAttributeId(rs.getInt("product_attribute_id"));
        orderDetail.setIdCustomization(rs.getInt("id_customization"));
        orderDetail.setProductName(rs.getString("product_name"));
        orderDetail.setProductQuantity(rs.getInt("product_quantity"));
        orderDetail.setProductQuantityInStock(rs.getInt("product_quantity_in_stock"));
        orderDetail.setProductQuantityRefunded(rs.getInt("product_quantity_refunded"));
        orderDetail.setProductQuantityReturn(rs.getInt("product_quantity_return"));
        orderDetail.setProductQuantityReinjected(rs.getInt("product_quantity_reinjected"));
        orderDetail.setProductPrice(rs.getBigDecimal("product_price"));
        orderDetail.setReductionPercent(rs.getBigDecimal("reduction_percent"));
        orderDetail.setReductionAmount(rs.getBigDecimal("reduction_amount"));
        orderDetail.setReductionAmountTaxIncl(rs.getBigDecimal("reduction_amount_tax_incl"));
        orderDetail.setReductionAmountTaxExcl(rs.getBigDecimal("reduction_amount_tax_excl"));
        orderDetail.setGroupReduction(rs.getBigDecimal("group_reduction"));
        orderDetail.setProductQuantityDiscount(rs.getBigDecimal("product_quantity_discount"));
        orderDetail.setProductEan13(rs.getString("product_ean13"));
        orderDetail.setProductIsbn(rs.getString("product_isbn"));
        orderDetail.setProductUpc(rs.getString("product_upc"));
        orderDetail.setProductReference(rs.getString("product_reference"));
        orderDetail.setProductSupplierReference(rs.getString("product_supplier_reference"));
        orderDetail.setProductWeight(rs.getBigDecimal("product_weight"));
        orderDetail.setIdTaxRulesGroup(rs.getInt("id_tax_rules_group"));
        orderDetail.setTaxComputationMethod(rs.getInt("tax_computation_method"));
        orderDetail.setTaxName(rs.getString("tax_name"));
        orderDetail.setTaxRate(rs.getBigDecimal("tax_rate"));
        orderDetail.setEcotax(rs.getBigDecimal("ecotax"));
        orderDetail.setEcotaxTaxRate(rs.getBigDecimal("ecotax_tax_rate"));
        orderDetail.setDiscountQuantityApplied(rs.getInt("discount_quantity_applied"));
        orderDetail.setDownloadHash(rs.getString("download_hash"));
        orderDetail.setDownloadNb(rs.getInt("download_nb"));
        orderDetail.setDownloadDeadline(rs.getTimestamp("download_deadline") != null ? rs.getTimestamp("download_deadline").toLocalDateTime() : null);
        orderDetail.setTotalPriceTaxIncl(rs.getBigDecimal("total_price_tax_incl"));
        orderDetail.setTotalPriceTaxExcl(rs.getBigDecimal("total_price_tax_excl"));
        orderDetail.setUnitPriceTaxIncl(rs.getBigDecimal("unit_price_tax_incl"));
        orderDetail.setUnitPriceTaxExcl(rs.getBigDecimal("unit_price_tax_excl"));
        orderDetail.setTotalShippingPriceTaxIncl(rs.getBigDecimal("total_shipping_price_tax_incl"));
        orderDetail.setTotalShippingPriceTaxExcl(rs.getBigDecimal("total_shipping_price_tax_excl"));
        orderDetail.setPurchaseSupplierPrice(rs.getBigDecimal("purchase_supplier_price"));
        orderDetail.setOriginalProductPrice(rs.getBigDecimal("original_product_price"));
        orderDetail.setOriginalWholesalePrice(rs.getBigDecimal("original_wholesale_price"));
        return orderDetail;
    }

}

