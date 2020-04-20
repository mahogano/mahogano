package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ProductAttributeCombination;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductAttributeCombinationMapper implements RowMapper<ProductAttributeCombination> {

    @Override
    public ProductAttributeCombination mapRow(ResultSet rs, int i) throws SQLException {
        ProductAttributeCombination productAttributeCombination = new ProductAttributeCombination();
        productAttributeCombination.setIdAttribute(rs.getInt("id_attribute"));
        productAttributeCombination.setIdProductAttribute(rs.getInt("id_product_attribute"));
        return productAttributeCombination;
    }

}

