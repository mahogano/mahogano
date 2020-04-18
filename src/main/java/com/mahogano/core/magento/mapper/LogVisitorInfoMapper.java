package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.LogVisitorInfo;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LogVisitorInfoMapper implements RowMapper<LogVisitorInfo> {

    @Override
    public LogVisitorInfo mapRow(ResultSet rs, int i) throws SQLException {
        LogVisitorInfo logVisitorInfo = new LogVisitorInfo();
        logVisitorInfo.setVisitorId(rs.getLong("visitor_id"));
        logVisitorInfo.setHttpReferer(rs.getString("http_referer"));
        logVisitorInfo.setHttpUserAgent(rs.getString("http_user_agent"));
        logVisitorInfo.setHttpAcceptCharset(rs.getString("http_accept_charset"));
        logVisitorInfo.setHttpAcceptLanguage(rs.getString("http_accept_language"));
        logVisitorInfo.setServerAddr(rs.getBytes("server_addr"));
        logVisitorInfo.setRemoteAddr(rs.getBytes("remote_addr"));
        return logVisitorInfo;
    }

}

