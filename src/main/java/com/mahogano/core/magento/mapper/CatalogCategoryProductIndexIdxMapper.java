package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogCategoryProductIndexIdx;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogCategoryProductIndexIdxMapper implements RowMapper<CatalogCategoryProductIndexIdx> {

    @Override
    public CatalogCategoryProductIndexIdx mapRow(ResultSet rs, int i) throws SQLException {
        CatalogCategoryProductIndexIdx catalogCategoryProductIndexIdx = new CatalogCategoryProductIndexIdx();
        catalogCategoryProductIndexIdx.setCategoryId(rs.getInt("category_id"));
        catalogCategoryProductIndexIdx.setProductId(rs.getInt("product_id"));
        catalogCategoryProductIndexIdx.setPosition(rs.getInt("position"));
        catalogCategoryProductIndexIdx.setIsParent(rs.getInt("is_parent"));
        catalogCategoryProductIndexIdx.setStoreId(rs.getInt("store_id"));
        catalogCategoryProductIndexIdx.setVisibility(rs.getInt("visibility"));
        return catalogCategoryProductIndexIdx;
    }

}

