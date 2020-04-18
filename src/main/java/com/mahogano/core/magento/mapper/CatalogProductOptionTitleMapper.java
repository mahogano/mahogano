package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductOptionTitle;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductOptionTitleMapper implements RowMapper<CatalogProductOptionTitle> {

    @Override
    public CatalogProductOptionTitle mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductOptionTitle catalogProductOptionTitle = new CatalogProductOptionTitle();
        catalogProductOptionTitle.setOptionTitleId(rs.getInt("option_title_id"));
        catalogProductOptionTitle.setOptionId(rs.getInt("option_id"));
        catalogProductOptionTitle.setStoreId(rs.getInt("store_id"));
        catalogProductOptionTitle.setTitle(rs.getString("title"));
        return catalogProductOptionTitle;
    }

}

