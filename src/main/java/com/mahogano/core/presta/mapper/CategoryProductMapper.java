package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CategoryProduct;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryProductMapper implements RowMapper<CategoryProduct> {

    @Override
    public CategoryProduct mapRow(ResultSet rs, int i) throws SQLException {
        CategoryProduct categoryProduct = new CategoryProduct();
        categoryProduct.setIdCategory(rs.getInt("id_category"));
        categoryProduct.setIdProduct(rs.getInt("id_product"));
        categoryProduct.setPosition(rs.getInt("position"));
        return categoryProduct;
    }

}

