package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ImageShop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ImageShopMapper implements RowMapper<ImageShop> {

    @Override
    public ImageShop mapRow(ResultSet rs, int i) throws SQLException {
        ImageShop imageShop = new ImageShop();
        imageShop.setIdProduct(rs.getInt("id_product"));
        imageShop.setIdImage(rs.getInt("id_image"));
        imageShop.setIdShop(rs.getInt("id_shop"));
        imageShop.setCover(rs.getInt("cover"));
        return imageShop;
    }

}

