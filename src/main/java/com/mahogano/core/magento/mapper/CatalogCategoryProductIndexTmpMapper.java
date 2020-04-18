package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogCategoryProductIndexTmp;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogCategoryProductIndexTmpMapper implements RowMapper<CatalogCategoryProductIndexTmp> {

    @Override
    public CatalogCategoryProductIndexTmp mapRow(ResultSet rs, int i) throws SQLException {
        CatalogCategoryProductIndexTmp catalogCategoryProductIndexTmp = new CatalogCategoryProductIndexTmp();
        catalogCategoryProductIndexTmp.setCategoryId(rs.getInt("category_id"));
        catalogCategoryProductIndexTmp.setProductId(rs.getInt("product_id"));
        catalogCategoryProductIndexTmp.setPosition(rs.getInt("position"));
        catalogCategoryProductIndexTmp.setIsParent(rs.getInt("is_parent"));
        catalogCategoryProductIndexTmp.setStoreId(rs.getInt("store_id"));
        catalogCategoryProductIndexTmp.setVisibility(rs.getInt("visibility"));
        return catalogCategoryProductIndexTmp;
    }

}

