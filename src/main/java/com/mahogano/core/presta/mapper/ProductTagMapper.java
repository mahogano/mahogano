package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ProductTag;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductTagMapper implements RowMapper<ProductTag> {

    @Override
    public ProductTag mapRow(ResultSet rs, int i) throws SQLException {
        ProductTag productTag = new ProductTag();
        productTag.setIdProduct(rs.getInt("id_product"));
        productTag.setIdTag(rs.getInt("id_tag"));
        productTag.setIdLang(rs.getInt("id_lang"));
        return productTag;
    }

}

