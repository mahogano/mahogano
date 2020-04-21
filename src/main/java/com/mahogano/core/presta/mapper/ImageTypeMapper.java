package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ImageType;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ImageTypeMapper implements RowMapper<ImageType> {

    @Override
    public ImageType mapRow(ResultSet rs, int i) throws SQLException {
        ImageType imageType = new ImageType();
        imageType.setIdImageType(rs.getInt("id_image_type"));
        imageType.setName(rs.getString("name"));
        imageType.setWidth(rs.getInt("width"));
        imageType.setHeight(rs.getInt("height"));
        imageType.setProducts(rs.getInt("products"));
        imageType.setCategories(rs.getInt("categories"));
        imageType.setManufacturers(rs.getInt("manufacturers"));
        imageType.setSuppliers(rs.getInt("suppliers"));
        imageType.setStores(rs.getInt("stores"));
        return imageType;
    }

}

