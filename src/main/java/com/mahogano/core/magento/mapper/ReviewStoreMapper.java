package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.ReviewStore;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReviewStoreMapper implements RowMapper<ReviewStore> {

    @Override
    public ReviewStore mapRow(ResultSet rs, int i) throws SQLException {
        ReviewStore reviewStore = new ReviewStore();
        reviewStore.setReviewId(rs.getLong("review_id"));
        reviewStore.setStoreId(rs.getInt("store_id"));
        return reviewStore;
    }

}

