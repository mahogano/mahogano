package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductIndexEavDecimal;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductIndexEavDecimalMapper implements RowMapper<CatalogProductIndexEavDecimal> {

    @Override
    public CatalogProductIndexEavDecimal mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductIndexEavDecimal catalogProductIndexEavDecimal = new CatalogProductIndexEavDecimal();
        catalogProductIndexEavDecimal.setEntityId(rs.getInt("entity_id"));
        catalogProductIndexEavDecimal.setAttributeId(rs.getInt("attribute_id"));
        catalogProductIndexEavDecimal.setStoreId(rs.getInt("store_id"));
        catalogProductIndexEavDecimal.setValue(rs.getBigDecimal("value"));
        return catalogProductIndexEavDecimal;
    }

}

