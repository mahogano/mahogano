package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.LogSummary;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LogSummaryMapper implements RowMapper<LogSummary> {

    @Override
    public LogSummary mapRow(ResultSet rs, int i) throws SQLException {
        LogSummary logSummary = new LogSummary();
        logSummary.setSummaryId(rs.getLong("summary_id"));
        logSummary.setStoreId(rs.getInt("store_id"));
        logSummary.setTypeId(rs.getInt("type_id"));
        logSummary.setVisitorCount(rs.getInt("visitor_count"));
        logSummary.setCustomerCount(rs.getInt("customer_count"));
        logSummary.setAddDate(rs.getTimestamp("add_date").toLocalDateTime());
        return logSummary;
    }

}

