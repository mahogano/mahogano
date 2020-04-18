package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.PollVote;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PollVoteMapper implements RowMapper<PollVote> {

    @Override
    public PollVote mapRow(ResultSet rs, int i) throws SQLException {
        PollVote pollVote = new PollVote();
        pollVote.setVoteId(rs.getInt("vote_id"));
        pollVote.setPollId(rs.getInt("poll_id"));
        pollVote.setPollAnswerId(rs.getInt("poll_answer_id"));
        pollVote.setIpAddress(rs.getBytes("ip_address"));
        pollVote.setCustomerId(rs.getInt("customer_id"));
        pollVote.setVoteTime(rs.getTimestamp("vote_time") != null ? rs.getTimestamp("vote_time").toLocalDateTime() : null);
        return pollVote;
    }

}

