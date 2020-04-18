package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CatalogProductEntityMediaGalleryValue;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogProductEntityMediaGalleryValueMapper implements RowMapper<CatalogProductEntityMediaGalleryValue> {

    @Override
    public CatalogProductEntityMediaGalleryValue mapRow(ResultSet rs, int i) throws SQLException {
        CatalogProductEntityMediaGalleryValue catalogProductEntityMediaGalleryValue = new CatalogProductEntityMediaGalleryValue();
        catalogProductEntityMediaGalleryValue.setValueId(rs.getInt("value_id"));
        catalogProductEntityMediaGalleryValue.setStoreId(rs.getInt("store_id"));
        catalogProductEntityMediaGalleryValue.setLabel(rs.getString("label"));
        catalogProductEntityMediaGalleryValue.setPosition(rs.getInt("position"));
        catalogProductEntityMediaGalleryValue.setDisabled(rs.getInt("disabled"));
        return catalogProductEntityMediaGalleryValue;
    }

}

