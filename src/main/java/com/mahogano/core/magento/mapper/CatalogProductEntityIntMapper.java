package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductEntityInt;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductEntityIntMapper implements RowMapper<CatalogProductEntityInt> {

    @Override
    public CatalogProductEntityInt mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductEntityInt catalogProductEntityInt = new CatalogProductEntityInt();
        catalogProductEntityInt.setValueId(rs.getInt("value_id"));
        catalogProductEntityInt.setEntityTypeId(rs.getInt("entity_type_id"));
        catalogProductEntityInt.setAttributeId(rs.getInt("attribute_id"));
        catalogProductEntityInt.setStoreId(rs.getInt("store_id"));
        catalogProductEntityInt.setEntityId(rs.getInt("entity_id"));
        catalogProductEntityInt.setValue(rs.getInt("value"));
        return catalogProductEntityInt;
    }

}

