package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.IndexProcessEvent;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IndexProcessEventMapper implements RowMapper<IndexProcessEvent> {

    @Override
    public IndexProcessEvent mapRow(ResultSet rs, int i) throws SQLException {
        IndexProcessEvent indexProcessEvent = new IndexProcessEvent();
        indexProcessEvent.setProcessId(rs.getInt("process_id"));
        indexProcessEvent.setEventId(rs.getLong("event_id"));
        indexProcessEvent.setStatus(rs.getString("status"));
        return indexProcessEvent;
    }

}

