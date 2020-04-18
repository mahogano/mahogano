package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductOptionTypeTitle;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductOptionTypeTitleMapper implements RowMapper<CatalogProductOptionTypeTitle> {

    @Override
    public CatalogProductOptionTypeTitle mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductOptionTypeTitle catalogProductOptionTypeTitle = new CatalogProductOptionTypeTitle();
        catalogProductOptionTypeTitle.setOptionTypeTitleId(rs.getInt("option_type_title_id"));
        catalogProductOptionTypeTitle.setOptionTypeId(rs.getInt("option_type_id"));
        catalogProductOptionTypeTitle.setStoreId(rs.getInt("store_id"));
        catalogProductOptionTypeTitle.setTitle(rs.getString("title"));
        return catalogProductOptionTypeTitle;
    }

}

