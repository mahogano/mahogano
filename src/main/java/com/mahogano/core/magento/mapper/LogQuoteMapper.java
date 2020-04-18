package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.LogQuote;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LogQuoteMapper implements RowMapper<LogQuote> {

    @Override
    public LogQuote mapRow(ResultSet rs, int i) throws SQLException {
        LogQuote logQuote = new LogQuote();
        logQuote.setQuoteId(rs.getInt("quote_id"));
        logQuote.setVisitorId(rs.getLong("visitor_id"));
        logQuote.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        logQuote.setDeletedAt(rs.getTimestamp("deleted_at") != null ? rs.getTimestamp("deleted_at").toLocalDateTime() : null);
        return logQuote;
    }

}

