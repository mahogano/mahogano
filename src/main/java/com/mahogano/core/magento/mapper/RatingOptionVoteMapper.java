package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.RatingOptionVote;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RatingOptionVoteMapper implements RowMapper<RatingOptionVote> {

    @Override
    public RatingOptionVote mapRow(ResultSet rs, int i) throws SQLException {
        RatingOptionVote ratingOptionVote = new RatingOptionVote();
        ratingOptionVote.setVoteId(rs.getLong("vote_id"));
        ratingOptionVote.setOptionId(rs.getInt("option_id"));
        ratingOptionVote.setRemoteIp(rs.getString("remote_ip"));
        ratingOptionVote.setRemoteIpLong(rs.getBytes("remote_ip_long"));
        ratingOptionVote.setCustomerId(rs.getInt("customer_id"));
        ratingOptionVote.setEntityPkValue(rs.getLong("entity_pk_value"));
        ratingOptionVote.setRatingId(rs.getInt("rating_id"));
        ratingOptionVote.setReviewId(rs.getLong("review_id"));
        ratingOptionVote.setPercent(rs.getInt("percent"));
        ratingOptionVote.setValue(rs.getInt("value"));
        return ratingOptionVote;
    }

}

