package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ProductSupplier;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductSupplierMapper implements RowMapper<ProductSupplier> {

    @Override
    public ProductSupplier mapRow(ResultSet rs, int i) throws SQLException {
        ProductSupplier productSupplier = new ProductSupplier();
        productSupplier.setIdProductSupplier(rs.getInt("id_product_supplier"));
        productSupplier.setIdProduct(rs.getInt("id_product"));
        productSupplier.setIdProductAttribute(rs.getInt("id_product_attribute"));
        productSupplier.setIdSupplier(rs.getInt("id_supplier"));
        productSupplier.setProductSupplierReference(rs.getString("product_supplier_reference"));
        productSupplier.setProductSupplierPriceTe(rs.getBigDecimal("product_supplier_price_te"));
        productSupplier.setIdCurrency(rs.getInt("id_currency"));
        return productSupplier;
    }

}

