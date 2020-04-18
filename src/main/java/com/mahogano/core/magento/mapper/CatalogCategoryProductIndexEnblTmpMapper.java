package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogCategoryProductIndexEnblTmp;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogCategoryProductIndexEnblTmpMapper implements RowMapper<CatalogCategoryProductIndexEnblTmp> {

    @Override
    public CatalogCategoryProductIndexEnblTmp mapRow(ResultSet rs, int i) throws SQLException {
        CatalogCategoryProductIndexEnblTmp catalogCategoryProductIndexEnblTmp = new CatalogCategoryProductIndexEnblTmp();
        catalogCategoryProductIndexEnblTmp.setProductId(rs.getInt("product_id"));
        catalogCategoryProductIndexEnblTmp.setVisibility(rs.getInt("visibility"));
        return catalogCategoryProductIndexEnblTmp;
    }

}

