package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ProductShop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductShopMapper implements RowMapper<ProductShop> {

    @Override
    public ProductShop mapRow(ResultSet rs, int i) throws SQLException {
        ProductShop productShop = new ProductShop();
        productShop.setIdProduct(rs.getInt("id_product"));
        productShop.setIdShop(rs.getInt("id_shop"));
        productShop.setIdCategoryDefault(rs.getInt("id_category_default"));
        productShop.setIdTaxRulesGroup(rs.getInt("id_tax_rules_group"));
        productShop.setOnSale(rs.getInt("on_sale"));
        productShop.setOnlineOnly(rs.getInt("online_only"));
        productShop.setEcotax(rs.getBigDecimal("ecotax"));
        productShop.setMinimalQuantity(rs.getInt("minimal_quantity"));
        productShop.setLowStockThreshold(rs.getInt("low_stock_threshold"));
        productShop.setLowStockAlert(rs.getInt("low_stock_alert"));
        productShop.setPrice(rs.getBigDecimal("price"));
        productShop.setWholesalePrice(rs.getBigDecimal("wholesale_price"));
        productShop.setUnity(rs.getString("unity"));
        productShop.setUnitPriceRatio(rs.getBigDecimal("unit_price_ratio"));
        productShop.setAdditionalShippingCost(rs.getBigDecimal("additional_shipping_cost"));
        productShop.setCustomizable(rs.getInt("customizable"));
        productShop.setUploadableFiles(rs.getInt("uploadable_files"));
        productShop.setTextFields(rs.getInt("text_fields"));
        productShop.setActive(rs.getInt("active"));
        productShop.setRedirectType(rs.getString("redirect_type"));
        productShop.setIdTypeRedirected(rs.getInt("id_type_redirected"));
        productShop.setAvailableForOrder(rs.getInt("available_for_order"));
        productShop.setAvailableDate(rs.getTimestamp("available_date") != null ? rs.getTimestamp("available_date").toLocalDateTime() : null);
        productShop.setShowCondition(rs.getInt("show_condition"));
        productShop.setCondition(rs.getString("condition"));
        productShop.setShowPrice(rs.getInt("show_price"));
        productShop.setIndexed(rs.getInt("indexed"));
        productShop.setVisibility(rs.getString("visibility"));
        productShop.setCacheDefaultAttribute(rs.getInt("cache_default_attribute"));
        productShop.setAdvancedStockManagement(rs.getInt("advanced_stock_management"));
        productShop.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        productShop.setDateUpd(rs.getTimestamp("date_upd").toLocalDateTime());
        productShop.setPackStockType(rs.getInt("pack_stock_type"));
        return productShop;
    }

}

