package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductEntityMediaGallery;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductEntityMediaGalleryMapper implements RowMapper<CatalogProductEntityMediaGallery> {

    @Override
    public CatalogProductEntityMediaGallery mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductEntityMediaGallery catalogProductEntityMediaGallery = new CatalogProductEntityMediaGallery();
        catalogProductEntityMediaGallery.setValueId(rs.getInt("value_id"));
        catalogProductEntityMediaGallery.setAttributeId(rs.getInt("attribute_id"));
        catalogProductEntityMediaGallery.setEntityId(rs.getInt("entity_id"));
        catalogProductEntityMediaGallery.setValue(rs.getString("value"));
        return catalogProductEntityMediaGallery;
    }

}

