package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.NewsletterQueue;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NewsletterQueueMapper implements RowMapper<NewsletterQueue> {

    @Override
    public NewsletterQueue mapRow(ResultSet rs, int i) throws SQLException {
        NewsletterQueue newsletterQueue = new NewsletterQueue();
        newsletterQueue.setQueueId(rs.getInt("queue_id"));
        newsletterQueue.setTemplateId(rs.getInt("template_id"));
        newsletterQueue.setNewsletterType(rs.getInt("newsletter_type"));
        newsletterQueue.setNewsletterText(rs.getString("newsletter_text"));
        newsletterQueue.setNewsletterStyles(rs.getString("newsletter_styles"));
        newsletterQueue.setNewsletterSubject(rs.getString("newsletter_subject"));
        newsletterQueue.setNewsletterSenderName(rs.getString("newsletter_sender_name"));
        newsletterQueue.setNewsletterSenderEmail(rs.getString("newsletter_sender_email"));
        newsletterQueue.setQueueStatus(rs.getInt("queue_status"));
        newsletterQueue.setQueueStartAt(rs.getTimestamp("queue_start_at") != null ? rs.getTimestamp("queue_start_at").toLocalDateTime() : null);
        newsletterQueue.setQueueFinishAt(rs.getTimestamp("queue_finish_at") != null ? rs.getTimestamp("queue_finish_at").toLocalDateTime() : null);
        return newsletterQueue;
    }

}

