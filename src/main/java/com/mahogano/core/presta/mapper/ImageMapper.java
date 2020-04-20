package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Image;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ImageMapper implements RowMapper<Image> {

    @Override
    public Image mapRow(ResultSet rs, int i) throws SQLException {
        Image image = new Image();
        image.setIdImage(rs.getInt("id_image"));
        image.setIdProduct(rs.getInt("id_product"));
        image.setPosition(rs.getInt("position"));
        image.setCover(rs.getInt("cover"));
        return image;
    }

}

