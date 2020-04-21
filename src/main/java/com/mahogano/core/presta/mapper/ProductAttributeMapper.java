package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ProductAttribute;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductAttributeMapper implements RowMapper<ProductAttribute> {

    @Override
    public ProductAttribute mapRow(ResultSet rs, int i) throws SQLException {
        ProductAttribute productAttribute = new ProductAttribute();
        productAttribute.setIdProductAttribute(rs.getInt("id_product_attribute"));
        productAttribute.setIdProduct(rs.getInt("id_product"));
        productAttribute.setReference(rs.getString("reference"));
        productAttribute.setSupplierReference(rs.getString("supplier_reference"));
        productAttribute.setLocation(rs.getString("location"));
        productAttribute.setEan13(rs.getString("ean13"));
        productAttribute.setIsbn(rs.getString("isbn"));
        productAttribute.setUpc(rs.getString("upc"));
        productAttribute.setWholesalePrice(rs.getBigDecimal("wholesale_price"));
        productAttribute.setPrice(rs.getBigDecimal("price"));
        productAttribute.setEcotax(rs.getBigDecimal("ecotax"));
        productAttribute.setQuantity(rs.getInt("quantity"));
        productAttribute.setWeight(rs.getBigDecimal("weight"));
        productAttribute.setUnitPriceImpact(rs.getBigDecimal("unit_price_impact"));
        productAttribute.setDefaultOn(rs.getInt("default_on"));
        productAttribute.setMinimalQuantity(rs.getInt("minimal_quantity"));
        productAttribute.setLowStockThreshold(rs.getInt("low_stock_threshold"));
        productAttribute.setLowStockAlert(rs.getInt("low_stock_alert"));
        productAttribute.setAvailableDate(rs.getTimestamp("available_date") != null ? rs.getTimestamp("available_date").toLocalDateTime() : null);
        return productAttribute;
    }

}

