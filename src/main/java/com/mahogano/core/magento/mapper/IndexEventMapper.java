package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.IndexEvent;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IndexEventMapper implements RowMapper<IndexEvent> {

    @Override
    public IndexEvent mapRow(ResultSet rs, int i) throws SQLException {
        IndexEvent indexEvent = new IndexEvent();
        indexEvent.setEventId(rs.getLong("event_id"));
        indexEvent.setType(rs.getString("type"));
        indexEvent.setEntity(rs.getString("entity"));
        indexEvent.setEntityPk(rs.getLong("entity_pk"));
        indexEvent.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        indexEvent.setOldData(rs.getString("old_data"));
        indexEvent.setNewData(rs.getString("new_data"));
        return indexEvent;
    }

}

