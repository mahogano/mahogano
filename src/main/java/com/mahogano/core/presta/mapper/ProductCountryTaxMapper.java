package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ProductCountryTax;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductCountryTaxMapper implements RowMapper<ProductCountryTax> {

    @Override
    public ProductCountryTax mapRow(ResultSet rs, int i) throws SQLException {
        ProductCountryTax productCountryTax = new ProductCountryTax();
        productCountryTax.setIdProduct(rs.getInt("id_product"));
        productCountryTax.setIdCountry(rs.getInt("id_country"));
        productCountryTax.setIdTax(rs.getInt("id_tax"));
        return productCountryTax;
    }

}

