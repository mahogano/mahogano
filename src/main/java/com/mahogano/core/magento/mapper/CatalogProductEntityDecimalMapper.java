package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductEntityDecimal;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductEntityDecimalMapper implements RowMapper<CatalogProductEntityDecimal> {

    @Override
    public CatalogProductEntityDecimal mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductEntityDecimal catalogProductEntityDecimal = new CatalogProductEntityDecimal();
        catalogProductEntityDecimal.setValueId(rs.getInt("value_id"));
        catalogProductEntityDecimal.setEntityTypeId(rs.getInt("entity_type_id"));
        catalogProductEntityDecimal.setAttributeId(rs.getInt("attribute_id"));
        catalogProductEntityDecimal.setStoreId(rs.getInt("store_id"));
        catalogProductEntityDecimal.setEntityId(rs.getInt("entity_id"));
        catalogProductEntityDecimal.setValue(rs.getBigDecimal("value"));
        return catalogProductEntityDecimal;
    }

}

