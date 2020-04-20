package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ReferrerCache;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReferrerCacheMapper implements RowMapper<ReferrerCache> {

    @Override
    public ReferrerCache mapRow(ResultSet rs, int i) throws SQLException {
        ReferrerCache referrerCache = new ReferrerCache();
        referrerCache.setIdConnectionsSource(rs.getInt("id_connections_source"));
        referrerCache.setIdReferrer(rs.getInt("id_referrer"));
        return referrerCache;
    }

}

