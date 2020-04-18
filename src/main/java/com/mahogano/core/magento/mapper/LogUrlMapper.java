package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.LogUrl;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LogUrlMapper implements RowMapper<LogUrl> {

    @Override
    public LogUrl mapRow(ResultSet rs, int i) throws SQLException {
        LogUrl logUrl = new LogUrl();
        logUrl.setUrlId(rs.getLong("url_id"));
        logUrl.setVisitorId(rs.getLong("visitor_id"));
        logUrl.setVisitTime(rs.getTimestamp("visit_time").toLocalDateTime());
        return logUrl;
    }

}

