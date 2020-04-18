package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.ReportEvent;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReportEventMapper implements RowMapper<ReportEvent> {

    @Override
    public ReportEvent mapRow(ResultSet rs, int i) throws SQLException {
        ReportEvent reportEvent = new ReportEvent();
        reportEvent.setEventId(rs.getLong("event_id"));
        reportEvent.setLoggedAt(rs.getTimestamp("logged_at").toLocalDateTime());
        reportEvent.setEventTypeId(rs.getInt("event_type_id"));
        reportEvent.setObjectId(rs.getInt("object_id"));
        reportEvent.setSubjectId(rs.getInt("subject_id"));
        reportEvent.setSubtype(rs.getInt("subtype"));
        reportEvent.setStoreId(rs.getInt("store_id"));
        return reportEvent;
    }

}

