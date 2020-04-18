package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.Poll;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PollMapper implements RowMapper<Poll> {

    @Override
    public Poll mapRow(ResultSet rs, int i) throws SQLException {
        Poll poll = new Poll();
        poll.setPollId(rs.getInt("poll_id"));
        poll.setPollTitle(rs.getString("poll_title"));
        poll.setVotesCount(rs.getInt("votes_count"));
        poll.setStoreId(rs.getInt("store_id"));
        poll.setDatePosted(rs.getTimestamp("date_posted").toLocalDateTime());
        poll.setDateClosed(rs.getTimestamp("date_closed") != null ? rs.getTimestamp("date_closed").toLocalDateTime() : null);
        poll.setActive(rs.getInt("active"));
        poll.setClosed(rs.getInt("closed"));
        poll.setAnswersDisplay(rs.getInt("answers_display"));
        return poll;
    }

}

