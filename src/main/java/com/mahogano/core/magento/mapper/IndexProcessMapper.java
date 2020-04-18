package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.IndexProcess;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IndexProcessMapper implements RowMapper<IndexProcess> {

    @Override
    public IndexProcess mapRow(ResultSet rs, int i) throws SQLException {
        IndexProcess indexProcess = new IndexProcess();
        indexProcess.setProcessId(rs.getInt("process_id"));
        indexProcess.setIndexerCode(rs.getString("indexer_code"));
        indexProcess.setStatus(rs.getString("status"));
        indexProcess.setStartedAt(rs.getTimestamp("started_at") != null ? rs.getTimestamp("started_at").toLocalDateTime() : null);
        indexProcess.setEndedAt(rs.getTimestamp("ended_at") != null ? rs.getTimestamp("ended_at").toLocalDateTime() : null);
        indexProcess.setMode(rs.getString("mode"));
        return indexProcess;
    }

}

