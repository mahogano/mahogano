package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CoreEmailQueue;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CoreEmailQueueMapper implements RowMapper<CoreEmailQueue> {

    @Override
    public CoreEmailQueue mapRow(ResultSet rs, int i) throws SQLException {
        CoreEmailQueue coreEmailQueue = new CoreEmailQueue();
        coreEmailQueue.setMessageId(rs.getInt("message_id"));
        coreEmailQueue.setEntityId(rs.getInt("entity_id"));
        coreEmailQueue.setEntityType(rs.getString("entity_type"));
        coreEmailQueue.setEventType(rs.getString("event_type"));
        coreEmailQueue.setMessageBodyHash(rs.getString("message_body_hash"));
        coreEmailQueue.setMessageBody(rs.getString("message_body"));
        coreEmailQueue.setMessageParameters(rs.getString("message_parameters"));
        coreEmailQueue.setCreatedAt(rs.getTimestamp("created_at") != null ? rs.getTimestamp("created_at").toLocalDateTime() : null);
        coreEmailQueue.setProcessedAt(rs.getTimestamp("processed_at") != null ? rs.getTimestamp("processed_at").toLocalDateTime() : null);
        return coreEmailQueue;
    }

}

