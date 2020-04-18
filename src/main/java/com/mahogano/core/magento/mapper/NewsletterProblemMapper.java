package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.NewsletterProblem;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NewsletterProblemMapper implements RowMapper<NewsletterProblem> {

    @Override
    public NewsletterProblem mapRow(ResultSet rs, int i) throws SQLException {
        NewsletterProblem newsletterProblem = new NewsletterProblem();
        newsletterProblem.setProblemId(rs.getInt("problem_id"));
        newsletterProblem.setSubscriberId(rs.getInt("subscriber_id"));
        newsletterProblem.setQueueId(rs.getInt("queue_id"));
        newsletterProblem.setProblemErrorCode(rs.getInt("problem_error_code"));
        newsletterProblem.setProblemErrorText(rs.getString("problem_error_text"));
        return newsletterProblem;
    }

}

