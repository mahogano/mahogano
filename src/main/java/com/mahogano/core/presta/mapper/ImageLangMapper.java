package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ImageLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ImageLangMapper implements RowMapper<ImageLang> {

    @Override
    public ImageLang mapRow(ResultSet rs, int i) throws SQLException {
        ImageLang imageLang = new ImageLang();
        imageLang.setIdImage(rs.getInt("id_image"));
        imageLang.setIdLang(rs.getInt("id_lang"));
        imageLang.setLegend(rs.getString("legend"));
        return imageLang;
    }

}

