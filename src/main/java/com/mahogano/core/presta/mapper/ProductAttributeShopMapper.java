package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ProductAttributeShop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductAttributeShopMapper implements RowMapper<ProductAttributeShop> {

    @Override
    public ProductAttributeShop mapRow(ResultSet rs, int i) throws SQLException {
        ProductAttributeShop productAttributeShop = new ProductAttributeShop();
        productAttributeShop.setIdProduct(rs.getInt("id_product"));
        productAttributeShop.setIdProductAttribute(rs.getInt("id_product_attribute"));
        productAttributeShop.setIdShop(rs.getInt("id_shop"));
        productAttributeShop.setWholesalePrice(rs.getBigDecimal("wholesale_price"));
        productAttributeShop.setPrice(rs.getBigDecimal("price"));
        productAttributeShop.setEcotax(rs.getBigDecimal("ecotax"));
        productAttributeShop.setWeight(rs.getBigDecimal("weight"));
        productAttributeShop.setUnitPriceImpact(rs.getBigDecimal("unit_price_impact"));
        productAttributeShop.setDefaultOn(rs.getInt("default_on"));
        productAttributeShop.setMinimalQuantity(rs.getInt("minimal_quantity"));
        productAttributeShop.setLowStockThreshold(rs.getInt("low_stock_threshold"));
        productAttributeShop.setLowStockAlert(rs.getInt("low_stock_alert"));
        productAttributeShop.setAvailableDate(rs.getTimestamp("available_date") != null ? rs.getTimestamp("available_date").toLocalDateTime() : null);
        return productAttributeShop;
    }

}

