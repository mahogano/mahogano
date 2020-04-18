package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogCategoryProductIndexEnblIdx;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogCategoryProductIndexEnblIdxMapper implements RowMapper<CatalogCategoryProductIndexEnblIdx> {

    @Override
    public CatalogCategoryProductIndexEnblIdx mapRow(ResultSet rs, int i) throws SQLException {
        CatalogCategoryProductIndexEnblIdx catalogCategoryProductIndexEnblIdx = new CatalogCategoryProductIndexEnblIdx();
        catalogCategoryProductIndexEnblIdx.setProductId(rs.getInt("product_id"));
        catalogCategoryProductIndexEnblIdx.setVisibility(rs.getInt("visibility"));
        return catalogCategoryProductIndexEnblIdx;
    }

}

