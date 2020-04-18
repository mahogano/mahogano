package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.RatingTitle;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RatingTitleMapper implements RowMapper<RatingTitle> {

    @Override
    public RatingTitle mapRow(ResultSet rs, int i) throws SQLException {
        RatingTitle ratingTitle = new RatingTitle();
        ratingTitle.setRatingId(rs.getInt("rating_id"));
        ratingTitle.setStoreId(rs.getInt("store_id"));
        ratingTitle.setValue(rs.getString("value"));
        return ratingTitle;
    }

}

