package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductIndexEav;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductIndexEavMapper implements RowMapper<CatalogProductIndexEav> {

    @Override
    public CatalogProductIndexEav mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductIndexEav catalogProductIndexEav = new CatalogProductIndexEav();
        catalogProductIndexEav.setEntityId(rs.getInt("entity_id"));
        catalogProductIndexEav.setAttributeId(rs.getInt("attribute_id"));
        catalogProductIndexEav.setStoreId(rs.getInt("store_id"));
        catalogProductIndexEav.setValue(rs.getInt("value"));
        return catalogProductIndexEav;
    }

}

