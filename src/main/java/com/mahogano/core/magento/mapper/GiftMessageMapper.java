package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.GiftMessage;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GiftMessageMapper implements RowMapper<GiftMessage> {

    @Override
    public GiftMessage mapRow(ResultSet rs, int i) throws SQLException {
        GiftMessage giftMessage = new GiftMessage();
        giftMessage.setGiftMessageId(rs.getInt("gift_message_id"));
        giftMessage.setCustomerId(rs.getInt("customer_id"));
        giftMessage.setSender(rs.getString("sender"));
        giftMessage.setRecipient(rs.getString("recipient"));
        giftMessage.setMessage(rs.getString("message"));
        return giftMessage;
    }

}

