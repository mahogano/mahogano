package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogCategoryEntityVarchar;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogCategoryEntityVarcharMapper implements RowMapper<CatalogCategoryEntityVarchar> {

    @Override
    public CatalogCategoryEntityVarchar mapRow(ResultSet rs, int i) throws SQLException {
        CatalogCategoryEntityVarchar catalogCategoryEntityVarchar = new CatalogCategoryEntityVarchar();
        catalogCategoryEntityVarchar.setValueId(rs.getInt("value_id"));
        catalogCategoryEntityVarchar.setEntityTypeId(rs.getInt("entity_type_id"));
        catalogCategoryEntityVarchar.setAttributeId(rs.getInt("attribute_id"));
        catalogCategoryEntityVarchar.setStoreId(rs.getInt("store_id"));
        catalogCategoryEntityVarchar.setEntityId(rs.getInt("entity_id"));
        catalogCategoryEntityVarchar.setValue(rs.getString("value"));
        return catalogCategoryEntityVarchar;
    }

}

