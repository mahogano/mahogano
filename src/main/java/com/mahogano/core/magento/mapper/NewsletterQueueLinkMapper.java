package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.NewsletterQueueLink;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NewsletterQueueLinkMapper implements RowMapper<NewsletterQueueLink> {

    @Override
    public NewsletterQueueLink mapRow(ResultSet rs, int i) throws SQLException {
        NewsletterQueueLink newsletterQueueLink = new NewsletterQueueLink();
        newsletterQueueLink.setQueueLinkId(rs.getInt("queue_link_id"));
        newsletterQueueLink.setQueueId(rs.getInt("queue_id"));
        newsletterQueueLink.setSubscriberId(rs.getInt("subscriber_id"));
        newsletterQueueLink.setLetterSentAt(rs.getTimestamp("letter_sent_at") != null ? rs.getTimestamp("letter_sent_at").toLocalDateTime() : null);
        return newsletterQueueLink;
    }

}

