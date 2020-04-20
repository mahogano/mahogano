package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ConnectionsSource;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionsSourceMapper implements RowMapper<ConnectionsSource> {

    @Override
    public ConnectionsSource mapRow(ResultSet rs, int i) throws SQLException {
        ConnectionsSource connectionsSource = new ConnectionsSource();
        connectionsSource.setIdConnectionsSource(rs.getInt("id_connections_source"));
        connectionsSource.setIdConnections(rs.getInt("id_connections"));
        connectionsSource.setHttpReferer(rs.getString("http_referer"));
        connectionsSource.setRequestUri(rs.getString("request_uri"));
        connectionsSource.setKeywords(rs.getString("keywords"));
        connectionsSource.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        return connectionsSource;
    }

}

