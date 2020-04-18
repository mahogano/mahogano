package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.OauthConsumer;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OauthConsumerMapper implements RowMapper<OauthConsumer> {

    @Override
    public OauthConsumer mapRow(ResultSet rs, int i) throws SQLException {
        OauthConsumer oauthConsumer = new OauthConsumer();
        oauthConsumer.setEntityId(rs.getInt("entity_id"));
        oauthConsumer.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        oauthConsumer.setUpdatedAt(rs.getTimestamp("updated_at") != null ? rs.getTimestamp("updated_at").toLocalDateTime() : null);
        oauthConsumer.setName(rs.getString("name"));
        oauthConsumer.setKey(rs.getString("key"));
        oauthConsumer.setSecret(rs.getString("secret"));
        oauthConsumer.setCallbackUrl(rs.getString("callback_url"));
        oauthConsumer.setRejectedCallbackUrl(rs.getString("rejected_callback_url"));
        return oauthConsumer;
    }

}

