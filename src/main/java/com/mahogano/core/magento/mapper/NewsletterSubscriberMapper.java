package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.NewsletterSubscriber;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NewsletterSubscriberMapper implements RowMapper<NewsletterSubscriber> {

    @Override
    public NewsletterSubscriber mapRow(ResultSet rs, int i) throws SQLException {
        NewsletterSubscriber newsletterSubscriber = new NewsletterSubscriber();
        newsletterSubscriber.setSubscriberId(rs.getInt("subscriber_id"));
        newsletterSubscriber.setStoreId(rs.getInt("store_id"));
        newsletterSubscriber.setChangeStatusAt(rs.getTimestamp("change_status_at") != null ? rs.getTimestamp("change_status_at").toLocalDateTime() : null);
        newsletterSubscriber.setCustomerId(rs.getInt("customer_id"));
        newsletterSubscriber.setSubscriberEmail(rs.getString("subscriber_email"));
        newsletterSubscriber.setSubscriberStatus(rs.getInt("subscriber_status"));
        newsletterSubscriber.setSubscriberConfirmCode(rs.getString("subscriber_confirm_code"));
        return newsletterSubscriber;
    }

}

