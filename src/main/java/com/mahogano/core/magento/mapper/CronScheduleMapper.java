package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CronSchedule;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CronScheduleMapper implements RowMapper<CronSchedule> {

    @Override
    public CronSchedule mapRow(ResultSet rs, int i) throws SQLException {
        CronSchedule cronSchedule = new CronSchedule();
        cronSchedule.setScheduleId(rs.getInt("schedule_id"));
        cronSchedule.setJobCode(rs.getString("job_code"));
        cronSchedule.setStatus(rs.getString("status"));
        cronSchedule.setMessages(rs.getString("messages"));
        cronSchedule.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        cronSchedule.setScheduledAt(rs.getTimestamp("scheduled_at") != null ? rs.getTimestamp("scheduled_at").toLocalDateTime() : null);
        cronSchedule.setExecutedAt(rs.getTimestamp("executed_at") != null ? rs.getTimestamp("executed_at").toLocalDateTime() : null);
        cronSchedule.setFinishedAt(rs.getTimestamp("finished_at") != null ? rs.getTimestamp("finished_at").toLocalDateTime() : null);
        return cronSchedule;
    }

}

