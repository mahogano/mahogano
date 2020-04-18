package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.RatingOptionVoteAggregated;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RatingOptionVoteAggregatedMapper implements RowMapper<RatingOptionVoteAggregated> {

    @Override
    public RatingOptionVoteAggregated mapRow(ResultSet rs, int i) throws SQLException {
        RatingOptionVoteAggregated ratingOptionVoteAggregated = new RatingOptionVoteAggregated();
        ratingOptionVoteAggregated.setPrimaryId(rs.getInt("primary_id"));
        ratingOptionVoteAggregated.setRatingId(rs.getInt("rating_id"));
        ratingOptionVoteAggregated.setEntityPkValue(rs.getLong("entity_pk_value"));
        ratingOptionVoteAggregated.setVoteCount(rs.getInt("vote_count"));
        ratingOptionVoteAggregated.setVoteValueSum(rs.getInt("vote_value_sum"));
        ratingOptionVoteAggregated.setPercent(rs.getInt("percent"));
        ratingOptionVoteAggregated.setPercentApproved(rs.getInt("percent_approved"));
        ratingOptionVoteAggregated.setStoreId(rs.getInt("store_id"));
        return ratingOptionVoteAggregated;
    }

}

