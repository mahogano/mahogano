package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ProductSale;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductSaleMapper implements RowMapper<ProductSale> {

    @Override
    public ProductSale mapRow(ResultSet rs, int i) throws SQLException {
        ProductSale productSale = new ProductSale();
        productSale.setIdProduct(rs.getInt("id_product"));
        productSale.setQuantity(rs.getInt("quantity"));
        productSale.setSaleNbr(rs.getInt("sale_nbr"));
        productSale.setDateUpd(rs.getTimestamp("date_upd") != null ? rs.getTimestamp("date_upd").toLocalDateTime() : null);
        return productSale;
    }

}

