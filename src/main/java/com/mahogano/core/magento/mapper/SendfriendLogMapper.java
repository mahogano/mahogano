package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SendfriendLog;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SendfriendLogMapper implements RowMapper<SendfriendLog> {

    @Override
    public SendfriendLog mapRow(ResultSet rs, int i) throws SQLException {
        SendfriendLog sendfriendLog = new SendfriendLog();
        sendfriendLog.setLogId(rs.getInt("log_id"));
        sendfriendLog.setIp(rs.getBytes("ip"));
        sendfriendLog.setTime(rs.getInt("time"));
        sendfriendLog.setWebsiteId(rs.getInt("website_id"));
        return sendfriendLog;
    }

}

