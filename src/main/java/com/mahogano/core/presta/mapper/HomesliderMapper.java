package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Homeslider;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HomesliderMapper implements RowMapper<Homeslider> {

    @Override
    public Homeslider mapRow(ResultSet rs, int i) throws SQLException {
        Homeslider homeslider = new Homeslider();
        homeslider.setIdHomesliderSlides(rs.getInt("id_homeslider_slides"));
        homeslider.setIdShop(rs.getInt("id_shop"));
        return homeslider;
    }

}

