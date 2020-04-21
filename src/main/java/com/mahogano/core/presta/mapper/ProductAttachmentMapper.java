package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ProductAttachment;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductAttachmentMapper implements RowMapper<ProductAttachment> {

    @Override
    public ProductAttachment mapRow(ResultSet rs, int i) throws SQLException {
        ProductAttachment productAttachment = new ProductAttachment();
        productAttachment.setIdProduct(rs.getInt("id_product"));
        productAttachment.setIdAttachment(rs.getInt("id_attachment"));
        return productAttachment;
    }

}

