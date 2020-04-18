package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CoreEmailQueueRecipients;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CoreEmailQueueRecipientsMapper implements RowMapper<CoreEmailQueueRecipients> {

    @Override
    public CoreEmailQueueRecipients mapRow(ResultSet rs, int i) throws SQLException {
        CoreEmailQueueRecipients coreEmailQueueRecipients = new CoreEmailQueueRecipients();
        coreEmailQueueRecipients.setRecipientId(rs.getInt("recipient_id"));
        coreEmailQueueRecipients.setMessageId(rs.getInt("message_id"));
        coreEmailQueueRecipients.setRecipientEmail(rs.getString("recipient_email"));
        coreEmailQueueRecipients.setRecipientName(rs.getString("recipient_name"));
        coreEmailQueueRecipients.setEmailType(rs.getInt("email_type"));
        return coreEmailQueueRecipients;
    }

}

