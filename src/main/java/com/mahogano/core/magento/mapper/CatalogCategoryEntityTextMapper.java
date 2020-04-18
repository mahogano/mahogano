package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogCategoryEntityText;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogCategoryEntityTextMapper implements RowMapper<CatalogCategoryEntityText> {

    @Override
    public CatalogCategoryEntityText mapRow(ResultSet rs, int i) throws SQLException {
        CatalogCategoryEntityText catalogCategoryEntityText = new CatalogCategoryEntityText();
        catalogCategoryEntityText.setValueId(rs.getInt("value_id"));
        catalogCategoryEntityText.setEntityTypeId(rs.getInt("entity_type_id"));
        catalogCategoryEntityText.setAttributeId(rs.getInt("attribute_id"));
        catalogCategoryEntityText.setStoreId(rs.getInt("store_id"));
        catalogCategoryEntityText.setEntityId(rs.getInt("entity_id"));
        catalogCategoryEntityText.setValue(rs.getString("value"));
        return catalogCategoryEntityText;
    }

}

