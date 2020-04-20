package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.SupplyOrderDetail;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SupplyOrderDetailMapper implements RowMapper<SupplyOrderDetail> {

    @Override
    public SupplyOrderDetail mapRow(ResultSet rs, int i) throws SQLException {
        SupplyOrderDetail supplyOrderDetail = new SupplyOrderDetail();
        supplyOrderDetail.setIdSupplyOrderDetail(rs.getInt("id_supply_order_detail"));
        supplyOrderDetail.setIdSupplyOrder(rs.getInt("id_supply_order"));
        supplyOrderDetail.setIdCurrency(rs.getInt("id_currency"));
        supplyOrderDetail.setIdProduct(rs.getInt("id_product"));
        supplyOrderDetail.setIdProductAttribute(rs.getInt("id_product_attribute"));
        supplyOrderDetail.setReference(rs.getString("reference"));
        supplyOrderDetail.setSupplierReference(rs.getString("supplier_reference"));
        supplyOrderDetail.setName(rs.getString("name"));
        supplyOrderDetail.setEan13(rs.getString("ean13"));
        supplyOrderDetail.setIsbn(rs.getString("isbn"));
        supplyOrderDetail.setUpc(rs.getString("upc"));
        supplyOrderDetail.setExchangeRate(rs.getBigDecimal("exchange_rate"));
        supplyOrderDetail.setUnitPriceTe(rs.getBigDecimal("unit_price_te"));
        supplyOrderDetail.setQuantityExpected(rs.getInt("quantity_expected"));
        supplyOrderDetail.setQuantityReceived(rs.getInt("quantity_received"));
        supplyOrderDetail.setPriceTe(rs.getBigDecimal("price_te"));
        supplyOrderDetail.setDiscountRate(rs.getBigDecimal("discount_rate"));
        supplyOrderDetail.setDiscountValueTe(rs.getBigDecimal("discount_value_te"));
        supplyOrderDetail.setPriceWithDiscountTe(rs.getBigDecimal("price_with_discount_te"));
        supplyOrderDetail.setTaxRate(rs.getBigDecimal("tax_rate"));
        supplyOrderDetail.setTaxValue(rs.getBigDecimal("tax_value"));
        supplyOrderDetail.setPriceTi(rs.getBigDecimal("price_ti"));
        supplyOrderDetail.setTaxValueWithOrderDiscount(rs.getBigDecimal("tax_value_with_order_discount"));
        supplyOrderDetail.setPriceWithOrderDiscountTe(rs.getBigDecimal("price_with_order_discount_te"));
        return supplyOrderDetail;
    }

}

