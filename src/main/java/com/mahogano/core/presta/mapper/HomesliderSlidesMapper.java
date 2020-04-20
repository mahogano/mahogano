package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.HomesliderSlides;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HomesliderSlidesMapper implements RowMapper<HomesliderSlides> {

    @Override
    public HomesliderSlides mapRow(ResultSet rs, int i) throws SQLException {
        HomesliderSlides homesliderSlides = new HomesliderSlides();
        homesliderSlides.setIdHomesliderSlides(rs.getInt("id_homeslider_slides"));
        homesliderSlides.setPosition(rs.getInt("position"));
        homesliderSlides.setActive(rs.getInt("active"));
        return homesliderSlides;
    }

}

