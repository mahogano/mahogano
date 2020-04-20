package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.SmartyLastFlush;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SmartyLastFlushMapper implements RowMapper<SmartyLastFlush> {

    @Override
    public SmartyLastFlush mapRow(ResultSet rs, int i) throws SQLException {
        SmartyLastFlush smartyLastFlush = new SmartyLastFlush();
        smartyLastFlush.setType(rs.getString("type"));
        smartyLastFlush.setLastFlush(rs.getTimestamp("last_flush").toLocalDateTime());
        return smartyLastFlush;
    }

}

