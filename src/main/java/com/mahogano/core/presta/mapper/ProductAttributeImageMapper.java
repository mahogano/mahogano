package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ProductAttributeImage;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductAttributeImageMapper implements RowMapper<ProductAttributeImage> {

    @Override
    public ProductAttributeImage mapRow(ResultSet rs, int i) throws SQLException {
        ProductAttributeImage productAttributeImage = new ProductAttributeImage();
        productAttributeImage.setIdProductAttribute(rs.getInt("id_product_attribute"));
        productAttributeImage.setIdImage(rs.getInt("id_image"));
        return productAttributeImage;
    }

}

