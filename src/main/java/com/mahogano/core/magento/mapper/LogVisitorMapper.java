package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.LogVisitor;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LogVisitorMapper implements RowMapper<LogVisitor> {

    @Override
    public LogVisitor mapRow(ResultSet rs, int i) throws SQLException {
        LogVisitor logVisitor = new LogVisitor();
        logVisitor.setVisitorId(rs.getLong("visitor_id"));
        logVisitor.setSessionId(rs.getString("session_id"));
        logVisitor.setFirstVisitAt(rs.getTimestamp("first_visit_at") != null ? rs.getTimestamp("first_visit_at").toLocalDateTime() : null);
        logVisitor.setLastVisitAt(rs.getTimestamp("last_visit_at").toLocalDateTime());
        logVisitor.setLastUrlId(rs.getLong("last_url_id"));
        logVisitor.setStoreId(rs.getInt("store_id"));
        return logVisitor;
    }

}

