package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.AdminnotificationInbox;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminnotificationInboxMapper implements RowMapper<AdminnotificationInbox> {

    @Override
    public AdminnotificationInbox mapRow(ResultSet rs, int i) throws SQLException {
        AdminnotificationInbox adminnotificationInbox = new AdminnotificationInbox();
        adminnotificationInbox.setNotificationId(rs.getInt("notification_id"));
        adminnotificationInbox.setSeverity(rs.getInt("severity"));
        adminnotificationInbox.setDateAdded(rs.getTimestamp("date_added").toLocalDateTime());
        adminnotificationInbox.setTitle(rs.getString("title"));
        adminnotificationInbox.setDescription(rs.getString("description"));
        adminnotificationInbox.setUrl(rs.getString("url"));
        adminnotificationInbox.setIsRead(rs.getInt("is_read"));
        adminnotificationInbox.setIsRemove(rs.getInt("is_remove"));
        return adminnotificationInbox;
    }

}

