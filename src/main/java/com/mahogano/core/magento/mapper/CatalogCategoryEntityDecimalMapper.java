package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogCategoryEntityDecimal;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogCategoryEntityDecimalMapper implements RowMapper<CatalogCategoryEntityDecimal> {

    @Override
    public CatalogCategoryEntityDecimal mapRow(ResultSet rs, int i) throws SQLException {
        CatalogCategoryEntityDecimal catalogCategoryEntityDecimal = new CatalogCategoryEntityDecimal();
        catalogCategoryEntityDecimal.setValueId(rs.getInt("value_id"));
        catalogCategoryEntityDecimal.setEntityTypeId(rs.getInt("entity_type_id"));
        catalogCategoryEntityDecimal.setAttributeId(rs.getInt("attribute_id"));
        catalogCategoryEntityDecimal.setStoreId(rs.getInt("store_id"));
        catalogCategoryEntityDecimal.setEntityId(rs.getInt("entity_id"));
        catalogCategoryEntityDecimal.setValue(rs.getBigDecimal("value"));
        return catalogCategoryEntityDecimal;
    }

}

