package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.HomesliderSlidesLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HomesliderSlidesLangMapper implements RowMapper<HomesliderSlidesLang> {

    @Override
    public HomesliderSlidesLang mapRow(ResultSet rs, int i) throws SQLException {
        HomesliderSlidesLang homesliderSlidesLang = new HomesliderSlidesLang();
        homesliderSlidesLang.setIdHomesliderSlides(rs.getInt("id_homeslider_slides"));
        homesliderSlidesLang.setIdLang(rs.getInt("id_lang"));
        homesliderSlidesLang.setTitle(rs.getString("title"));
        homesliderSlidesLang.setDescription(rs.getString("description"));
        homesliderSlidesLang.setLegend(rs.getString("legend"));
        homesliderSlidesLang.setUrl(rs.getString("url"));
        homesliderSlidesLang.setImage(rs.getString("image"));
        return homesliderSlidesLang;
    }

}

