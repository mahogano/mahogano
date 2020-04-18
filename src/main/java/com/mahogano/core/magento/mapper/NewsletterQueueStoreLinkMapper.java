package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.NewsletterQueueStoreLink;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NewsletterQueueStoreLinkMapper implements RowMapper<NewsletterQueueStoreLink> {

    @Override
    public NewsletterQueueStoreLink mapRow(ResultSet rs, int i) throws SQLException {
        NewsletterQueueStoreLink newsletterQueueStoreLink = new NewsletterQueueStoreLink();
        newsletterQueueStoreLink.setQueueId(rs.getInt("queue_id"));
        newsletterQueueStoreLink.setStoreId(rs.getInt("store_id"));
        return newsletterQueueStoreLink;
    }

}

