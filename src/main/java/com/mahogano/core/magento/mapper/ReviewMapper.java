package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.Review;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReviewMapper implements RowMapper<Review> {

    @Override
    public Review mapRow(ResultSet rs, int i) throws SQLException {
        Review review = new Review();
        review.setReviewId(rs.getLong("review_id"));
        review.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        review.setEntityId(rs.getInt("entity_id"));
        review.setEntityPkValue(rs.getInt("entity_pk_value"));
        review.setStatusId(rs.getInt("status_id"));
        return review;
    }

}

