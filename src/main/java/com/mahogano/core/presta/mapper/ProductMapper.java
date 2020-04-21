package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Product;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet rs, int i) throws SQLException {
        Product product = new Product();
        product.setIdProduct(rs.getInt("id_product"));
        product.setIdSupplier(rs.getInt("id_supplier"));
        product.setIdManufacturer(rs.getInt("id_manufacturer"));
        product.setIdCategoryDefault(rs.getInt("id_category_default"));
        product.setIdShopDefault(rs.getInt("id_shop_default"));
        product.setIdTaxRulesGroup(rs.getInt("id_tax_rules_group"));
        product.setOnSale(rs.getInt("on_sale"));
        product.setOnlineOnly(rs.getInt("online_only"));
        product.setEan13(rs.getString("ean13"));
        product.setIsbn(rs.getString("isbn"));
        product.setUpc(rs.getString("upc"));
        product.setEcotax(rs.getBigDecimal("ecotax"));
        product.setQuantity(rs.getInt("quantity"));
        product.setMinimalQuantity(rs.getInt("minimal_quantity"));
        product.setLowStockThreshold(rs.getInt("low_stock_threshold"));
        product.setLowStockAlert(rs.getInt("low_stock_alert"));
        product.setPrice(rs.getBigDecimal("price"));
        product.setWholesalePrice(rs.getBigDecimal("wholesale_price"));
        product.setUnity(rs.getString("unity"));
        product.setUnitPriceRatio(rs.getBigDecimal("unit_price_ratio"));
        product.setAdditionalShippingCost(rs.getBigDecimal("additional_shipping_cost"));
        product.setReference(rs.getString("reference"));
        product.setSupplierReference(rs.getString("supplier_reference"));
        product.setLocation(rs.getString("location"));
        product.setWidth(rs.getBigDecimal("width"));
        product.setHeight(rs.getBigDecimal("height"));
        product.setDepth(rs.getBigDecimal("depth"));
        product.setWeight(rs.getBigDecimal("weight"));
        product.setOutOfStock(rs.getInt("out_of_stock"));
        product.setAdditionalDeliveryTimes(rs.getInt("additional_delivery_times"));
        product.setQuantityDiscount(rs.getInt("quantity_discount"));
        product.setCustomizable(rs.getInt("customizable"));
        product.setUploadableFiles(rs.getInt("uploadable_files"));
        product.setTextFields(rs.getInt("text_fields"));
        product.setActive(rs.getInt("active"));
        product.setRedirectType(rs.getString("redirect_type"));
        product.setIdTypeRedirected(rs.getInt("id_type_redirected"));
        product.setAvailableForOrder(rs.getInt("available_for_order"));
        product.setAvailableDate(rs.getTimestamp("available_date") != null ? rs.getTimestamp("available_date").toLocalDateTime() : null);
        product.setShowCondition(rs.getInt("show_condition"));
        product.setCondition(rs.getString("condition"));
        product.setShowPrice(rs.getInt("show_price"));
        product.setIndexed(rs.getInt("indexed"));
        product.setVisibility(rs.getString("visibility"));
        product.setCacheIsPack(rs.getInt("cache_is_pack"));
        product.setCacheHasAttachments(rs.getInt("cache_has_attachments"));
        product.setIsVirtual(rs.getInt("is_virtual"));
        product.setCacheDefaultAttribute(rs.getInt("cache_default_attribute"));
        product.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        product.setDateUpd(rs.getTimestamp("date_upd").toLocalDateTime());
        product.setAdvancedStockManagement(rs.getInt("advanced_stock_management"));
        product.setPackStockType(rs.getInt("pack_stock_type"));
        product.setState(rs.getInt("state"));
        return product;
    }

}

