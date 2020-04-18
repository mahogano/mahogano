package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.RatingOption;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RatingOptionMapper implements RowMapper<RatingOption> {

    @Override
    public RatingOption mapRow(ResultSet rs, int i) throws SQLException {
        RatingOption ratingOption = new RatingOption();
        ratingOption.setOptionId(rs.getInt("option_id"));
        ratingOption.setRatingId(rs.getInt("rating_id"));
        ratingOption.setCode(rs.getString("code"));
        ratingOption.setValue(rs.getInt("value"));
        ratingOption.setPosition(rs.getInt("position"));
        return ratingOption;
    }

}

