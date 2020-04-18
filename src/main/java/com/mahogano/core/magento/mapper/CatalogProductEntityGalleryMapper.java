package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductEntityGallery;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductEntityGalleryMapper implements RowMapper<CatalogProductEntityGallery> {

    @Override
    public CatalogProductEntityGallery mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductEntityGallery catalogProductEntityGallery = new CatalogProductEntityGallery();
        catalogProductEntityGallery.setValueId(rs.getInt("value_id"));
        catalogProductEntityGallery.setEntityTypeId(rs.getInt("entity_type_id"));
        catalogProductEntityGallery.setAttributeId(rs.getInt("attribute_id"));
        catalogProductEntityGallery.setStoreId(rs.getInt("store_id"));
        catalogProductEntityGallery.setEntityId(rs.getInt("entity_id"));
        catalogProductEntityGallery.setPosition(rs.getInt("position"));
        catalogProductEntityGallery.setValue(rs.getString("value"));
        return catalogProductEntityGallery;
    }

}

