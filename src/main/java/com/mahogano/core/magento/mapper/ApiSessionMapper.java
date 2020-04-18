package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.ApiSession;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ApiSessionMapper implements RowMapper<ApiSession> {

    @Override
    public ApiSession mapRow(ResultSet rs, int i) throws SQLException {
        ApiSession apiSession = new ApiSession();
        apiSession.setUserId(rs.getInt("user_id"));
        apiSession.setLogdate(rs.getTimestamp("logdate").toLocalDateTime());
        apiSession.setSessid(rs.getString("sessid"));
        return apiSession;
    }

}

