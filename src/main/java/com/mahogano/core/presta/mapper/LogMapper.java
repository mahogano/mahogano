package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Log;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LogMapper implements RowMapper<Log> {

    @Override
    public Log mapRow(ResultSet rs, int i) throws SQLException {
        Log log = new Log();
        log.setIdLog(rs.getInt("id_log"));
        log.setSeverity(rs.getInt("severity"));
        log.setErrorCode(rs.getInt("error_code"));
        log.setMessage(rs.getString("message"));
        log.setObjectType(rs.getString("object_type"));
        log.setObjectId(rs.getInt("object_id"));
        log.setIdEmployee(rs.getInt("id_employee"));
        log.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        log.setDateUpd(rs.getTimestamp("date_upd").toLocalDateTime());
        return log;
    }

}

