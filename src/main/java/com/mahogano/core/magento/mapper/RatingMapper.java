package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.Rating;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RatingMapper implements RowMapper<Rating> {

    @Override
    public Rating mapRow(ResultSet rs, int i) throws SQLException {
        Rating rating = new Rating();
        rating.setRatingId(rs.getInt("rating_id"));
        rating.setEntityId(rs.getInt("entity_id"));
        rating.setRatingCode(rs.getString("rating_code"));
        rating.setPosition(rs.getInt("position"));
        return rating;
    }

}

