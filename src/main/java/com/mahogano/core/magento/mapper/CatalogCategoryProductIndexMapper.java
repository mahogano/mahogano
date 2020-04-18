package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogCategoryProductIndex;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogCategoryProductIndexMapper implements RowMapper<CatalogCategoryProductIndex> {

    @Override
    public CatalogCategoryProductIndex mapRow(ResultSet rs, int i) throws SQLException {
        CatalogCategoryProductIndex catalogCategoryProductIndex = new CatalogCategoryProductIndex();
        catalogCategoryProductIndex.setCategoryId(rs.getInt("category_id"));
        catalogCategoryProductIndex.setProductId(rs.getInt("product_id"));
        catalogCategoryProductIndex.setPosition(rs.getInt("position"));
        catalogCategoryProductIndex.setIsParent(rs.getInt("is_parent"));
        catalogCategoryProductIndex.setStoreId(rs.getInt("store_id"));
        catalogCategoryProductIndex.setVisibility(rs.getInt("visibility"));
        return catalogCategoryProductIndex;
    }

}

