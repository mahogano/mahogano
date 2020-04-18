package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductEntityVarchar;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductEntityVarcharMapper implements RowMapper<CatalogProductEntityVarchar> {

    @Override
    public CatalogProductEntityVarchar mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductEntityVarchar catalogProductEntityVarchar = new CatalogProductEntityVarchar();
        catalogProductEntityVarchar.setValueId(rs.getInt("value_id"));
        catalogProductEntityVarchar.setEntityTypeId(rs.getInt("entity_type_id"));
        catalogProductEntityVarchar.setAttributeId(rs.getInt("attribute_id"));
        catalogProductEntityVarchar.setStoreId(rs.getInt("store_id"));
        catalogProductEntityVarchar.setEntityId(rs.getInt("entity_id"));
        catalogProductEntityVarchar.setValue(rs.getString("value"));
        return catalogProductEntityVarchar;
    }

}

