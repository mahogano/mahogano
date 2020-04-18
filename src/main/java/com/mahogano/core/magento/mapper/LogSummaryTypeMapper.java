package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.LogSummaryType;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LogSummaryTypeMapper implements RowMapper<LogSummaryType> {

    @Override
    public LogSummaryType mapRow(ResultSet rs, int i) throws SQLException {
        LogSummaryType logSummaryType = new LogSummaryType();
        logSummaryType.setTypeId(rs.getInt("type_id"));
        logSummaryType.setTypeCode(rs.getString("type_code"));
        logSummaryType.setPeriod(rs.getInt("period"));
        logSummaryType.setPeriodType(rs.getString("period_type"));
        return logSummaryType;
    }

}

