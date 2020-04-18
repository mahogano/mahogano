package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogCategoryEntityInt;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogCategoryEntityIntMapper implements RowMapper<CatalogCategoryEntityInt> {

    @Override
    public CatalogCategoryEntityInt mapRow(ResultSet rs, int i) throws SQLException {
        CatalogCategoryEntityInt catalogCategoryEntityInt = new CatalogCategoryEntityInt();
        catalogCategoryEntityInt.setValueId(rs.getInt("value_id"));
        catalogCategoryEntityInt.setEntityTypeId(rs.getInt("entity_type_id"));
        catalogCategoryEntityInt.setAttributeId(rs.getInt("attribute_id"));
        catalogCategoryEntityInt.setStoreId(rs.getInt("store_id"));
        catalogCategoryEntityInt.setEntityId(rs.getInt("entity_id"));
        catalogCategoryEntityInt.setValue(rs.getInt("value"));
        return catalogCategoryEntityInt;
    }

}

