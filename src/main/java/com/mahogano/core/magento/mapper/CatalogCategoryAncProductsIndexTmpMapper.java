package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogCategoryAncProductsIndexTmp;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogCategoryAncProductsIndexTmpMapper implements RowMapper<CatalogCategoryAncProductsIndexTmp> {

    @Override
    public CatalogCategoryAncProductsIndexTmp mapRow(ResultSet rs, int i) throws SQLException {
        CatalogCategoryAncProductsIndexTmp catalogCategoryAncProductsIndexTmp = new CatalogCategoryAncProductsIndexTmp();
        catalogCategoryAncProductsIndexTmp.setCategoryId(rs.getInt("category_id"));
        catalogCategoryAncProductsIndexTmp.setProductId(rs.getInt("product_id"));
        catalogCategoryAncProductsIndexTmp.setPosition(rs.getInt("position"));
        return catalogCategoryAncProductsIndexTmp;
    }

}

