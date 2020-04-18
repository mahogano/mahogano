package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.DataflowProfileHistory;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataflowProfileHistoryMapper implements RowMapper<DataflowProfileHistory> {

    @Override
    public DataflowProfileHistory mapRow(ResultSet rs, int i) throws SQLException {
        DataflowProfileHistory dataflowProfileHistory = new DataflowProfileHistory();
        dataflowProfileHistory.setHistoryId(rs.getInt("history_id"));
        dataflowProfileHistory.setProfileId(rs.getInt("profile_id"));
        dataflowProfileHistory.setActionCode(rs.getString("action_code"));
        dataflowProfileHistory.setUserId(rs.getInt("user_id"));
        dataflowProfileHistory.setPerformedAt(rs.getTimestamp("performed_at") != null ? rs.getTimestamp("performed_at").toLocalDateTime() : null);
        return dataflowProfileHistory;
    }

}

