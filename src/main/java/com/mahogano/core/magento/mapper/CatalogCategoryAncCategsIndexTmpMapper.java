package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogCategoryAncCategsIndexTmp;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogCategoryAncCategsIndexTmpMapper implements RowMapper<CatalogCategoryAncCategsIndexTmp> {

    @Override
    public CatalogCategoryAncCategsIndexTmp mapRow(ResultSet rs, int i) throws SQLException {
        CatalogCategoryAncCategsIndexTmp catalogCategoryAncCategsIndexTmp = new CatalogCategoryAncCategsIndexTmp();
        catalogCategoryAncCategsIndexTmp.setCategoryId(rs.getInt("category_id"));
        catalogCategoryAncCategsIndexTmp.setPath(rs.getString("path"));
        return catalogCategoryAncCategsIndexTmp;
    }

}

