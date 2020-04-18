package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CoreSession;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CoreSessionMapper implements RowMapper<CoreSession> {

    @Override
    public CoreSession mapRow(ResultSet rs, int i) throws SQLException {
        CoreSession coreSession = new CoreSession();
        coreSession.setSessionId(rs.getString("session_id"));
        coreSession.setSessionExpires(rs.getInt("session_expires"));
        coreSession.setSessionData(rs.getBytes("session_data"));
        return coreSession;
    }

}

