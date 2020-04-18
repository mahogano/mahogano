package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogCategoryAncCategsIndexIdx;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogCategoryAncCategsIndexIdxMapper implements RowMapper<CatalogCategoryAncCategsIndexIdx> {

    @Override
    public CatalogCategoryAncCategsIndexIdx mapRow(ResultSet rs, int i) throws SQLException {
        CatalogCategoryAncCategsIndexIdx catalogCategoryAncCategsIndexIdx = new CatalogCategoryAncCategsIndexIdx();
        catalogCategoryAncCategsIndexIdx.setCategoryId(rs.getInt("category_id"));
        catalogCategoryAncCategsIndexIdx.setPath(rs.getString("path"));
        return catalogCategoryAncCategsIndexIdx;
    }

}

