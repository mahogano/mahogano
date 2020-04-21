package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.DateRange;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DateRangeMapper implements RowMapper<DateRange> {

    @Override
    public DateRange mapRow(ResultSet rs, int i) throws SQLException {
        DateRange dateRange = new DateRange();
        dateRange.setIdDateRange(rs.getInt("id_date_range"));
        dateRange.setTimeStart(rs.getTimestamp("time_start").toLocalDateTime());
        dateRange.setTimeEnd(rs.getTimestamp("time_end").toLocalDateTime());
        return dateRange;
    }

}

