package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.RatingStore;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RatingStoreMapper implements RowMapper<RatingStore> {

    @Override
    public RatingStore mapRow(ResultSet rs, int i) throws SQLException {
        RatingStore ratingStore = new RatingStore();
        ratingStore.setRatingId(rs.getInt("rating_id"));
        ratingStore.setStoreId(rs.getInt("store_id"));
        return ratingStore;
    }

}

