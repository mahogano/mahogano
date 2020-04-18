package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.PersistentSession;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersistentSessionMapper implements RowMapper<PersistentSession> {

    @Override
    public PersistentSession mapRow(ResultSet rs, int i) throws SQLException {
        PersistentSession persistentSession = new PersistentSession();
        persistentSession.setPersistentId(rs.getInt("persistent_id"));
        persistentSession.setKey(rs.getString("key"));
        persistentSession.setCustomerId(rs.getInt("customer_id"));
        persistentSession.setWebsiteId(rs.getInt("website_id"));
        persistentSession.setInfo(rs.getString("info"));
        persistentSession.setUpdatedAt(rs.getTimestamp("updated_at") != null ? rs.getTimestamp("updated_at").toLocalDateTime() : null);
        return persistentSession;
    }

}

