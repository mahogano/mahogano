package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ProductCarrier;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductCarrierMapper implements RowMapper<ProductCarrier> {

    @Override
    public ProductCarrier mapRow(ResultSet rs, int i) throws SQLException {
        ProductCarrier productCarrier = new ProductCarrier();
        productCarrier.setIdProduct(rs.getInt("id_product"));
        productCarrier.setIdCarrierReference(rs.getInt("id_carrier_reference"));
        productCarrier.setIdShop(rs.getInt("id_shop"));
        return productCarrier;
    }

}

