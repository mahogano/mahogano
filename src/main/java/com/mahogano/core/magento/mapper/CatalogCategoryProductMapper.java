package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogCategoryProduct;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogCategoryProductMapper implements RowMapper<CatalogCategoryProduct> {

    @Override
    public CatalogCategoryProduct mapRow(ResultSet rs, int i) throws SQLException {
        CatalogCategoryProduct catalogCategoryProduct = new CatalogCategoryProduct();
        catalogCategoryProduct.setCategoryId(rs.getInt("category_id"));
        catalogCategoryProduct.setProductId(rs.getInt("product_id"));
        catalogCategoryProduct.setPosition(rs.getInt("position"));
        return catalogCategoryProduct;
    }

}

