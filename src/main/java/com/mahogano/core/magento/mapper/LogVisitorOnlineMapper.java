package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.LogVisitorOnline;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LogVisitorOnlineMapper implements RowMapper<LogVisitorOnline> {

    @Override
    public LogVisitorOnline mapRow(ResultSet rs, int i) throws SQLException {
        LogVisitorOnline logVisitorOnline = new LogVisitorOnline();
        logVisitorOnline.setVisitorId(rs.getLong("visitor_id"));
        logVisitorOnline.setVisitorType(rs.getString("visitor_type"));
        logVisitorOnline.setRemoteAddr(rs.getBytes("remote_addr"));
        logVisitorOnline.setFirstVisitAt(rs.getTimestamp("first_visit_at") != null ? rs.getTimestamp("first_visit_at").toLocalDateTime() : null);
        logVisitorOnline.setLastVisitAt(rs.getTimestamp("last_visit_at") != null ? rs.getTimestamp("last_visit_at").toLocalDateTime() : null);
        logVisitorOnline.setCustomerId(rs.getInt("customer_id"));
        logVisitorOnline.setLastUrl(rs.getString("last_url"));
        return logVisitorOnline;
    }

}

