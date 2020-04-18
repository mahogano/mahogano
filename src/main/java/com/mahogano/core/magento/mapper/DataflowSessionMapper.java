package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.DataflowSession;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataflowSessionMapper implements RowMapper<DataflowSession> {

    @Override
    public DataflowSession mapRow(ResultSet rs, int i) throws SQLException {
        DataflowSession dataflowSession = new DataflowSession();
        dataflowSession.setSessionId(rs.getInt("session_id"));
        dataflowSession.setUserId(rs.getInt("user_id"));
        dataflowSession.setCreatedDate(rs.getTimestamp("created_date") != null ? rs.getTimestamp("created_date").toLocalDateTime() : null);
        dataflowSession.setFile(rs.getString("file"));
        dataflowSession.setType(rs.getString("type"));
        dataflowSession.setDirection(rs.getString("direction"));
        dataflowSession.setComment(rs.getString("comment"));
        return dataflowSession;
    }

}

