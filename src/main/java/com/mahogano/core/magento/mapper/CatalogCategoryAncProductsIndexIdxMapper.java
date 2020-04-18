package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogCategoryAncProductsIndexIdx;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogCategoryAncProductsIndexIdxMapper implements RowMapper<CatalogCategoryAncProductsIndexIdx> {

    @Override
    public CatalogCategoryAncProductsIndexIdx mapRow(ResultSet rs, int i) throws SQLException {
        CatalogCategoryAncProductsIndexIdx catalogCategoryAncProductsIndexIdx = new CatalogCategoryAncProductsIndexIdx();
        catalogCategoryAncProductsIndexIdx.setCategoryId(rs.getInt("category_id"));
        catalogCategoryAncProductsIndexIdx.setProductId(rs.getInt("product_id"));
        catalogCategoryAncProductsIndexIdx.setPosition(rs.getInt("position"));
        return catalogCategoryAncProductsIndexIdx;
    }

}

