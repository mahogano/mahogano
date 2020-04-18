package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.ReviewEntitySummary;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReviewEntitySummaryMapper implements RowMapper<ReviewEntitySummary> {

    @Override
    public ReviewEntitySummary mapRow(ResultSet rs, int i) throws SQLException {
        ReviewEntitySummary reviewEntitySummary = new ReviewEntitySummary();
        reviewEntitySummary.setPrimaryId(rs.getLong("primary_id"));
        reviewEntitySummary.setEntityPkValue(rs.getLong("entity_pk_value"));
        reviewEntitySummary.setEntityType(rs.getInt("entity_type"));
        reviewEntitySummary.setReviewsCount(rs.getInt("reviews_count"));
        reviewEntitySummary.setRatingSummary(rs.getInt("rating_summary"));
        reviewEntitySummary.setStoreId(rs.getInt("store_id"));
        return reviewEntitySummary;
    }

}

