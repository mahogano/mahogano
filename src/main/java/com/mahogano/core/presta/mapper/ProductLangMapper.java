package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ProductLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductLangMapper implements RowMapper<ProductLang> {

    @Override
    public ProductLang mapRow(ResultSet rs, int i) throws SQLException {
        ProductLang productLang = new ProductLang();
        productLang.setIdProduct(rs.getInt("id_product"));
        productLang.setIdShop(rs.getInt("id_shop"));
        productLang.setIdLang(rs.getInt("id_lang"));
        productLang.setDescription(rs.getString("description"));
        productLang.setDescriptionShort(rs.getString("description_short"));
        productLang.setLinkRewrite(rs.getString("link_rewrite"));
        productLang.setMetaDescription(rs.getString("meta_description"));
        productLang.setMetaKeywords(rs.getString("meta_keywords"));
        productLang.setMetaTitle(rs.getString("meta_title"));
        productLang.setName(rs.getString("name"));
        productLang.setAvailableNow(rs.getString("available_now"));
        productLang.setAvailableLater(rs.getString("available_later"));
        productLang.setDeliveryInStock(rs.getString("delivery_in_stock"));
        productLang.setDeliveryOutStock(rs.getString("delivery_out_stock"));
        return productLang;
    }

}

