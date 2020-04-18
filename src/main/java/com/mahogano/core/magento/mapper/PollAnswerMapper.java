package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.PollAnswer;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PollAnswerMapper implements RowMapper<PollAnswer> {

    @Override
    public PollAnswer mapRow(ResultSet rs, int i) throws SQLException {
        PollAnswer pollAnswer = new PollAnswer();
        pollAnswer.setAnswerId(rs.getInt("answer_id"));
        pollAnswer.setPollId(rs.getInt("poll_id"));
        pollAnswer.setAnswerTitle(rs.getString("answer_title"));
        pollAnswer.setVotesCount(rs.getInt("votes_count"));
        pollAnswer.setAnswerOrder(rs.getInt("answer_order"));
        return pollAnswer;
    }

}

