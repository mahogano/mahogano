package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ConnectionsPage;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionsPageMapper implements RowMapper<ConnectionsPage> {

    @Override
    public ConnectionsPage mapRow(ResultSet rs, int i) throws SQLException {
        ConnectionsPage connectionsPage = new ConnectionsPage();
        connectionsPage.setIdConnections(rs.getInt("id_connections"));
        connectionsPage.setIdPage(rs.getInt("id_page"));
        connectionsPage.setTimeStart(rs.getTimestamp("time_start").toLocalDateTime());
        connectionsPage.setTimeEnd(rs.getTimestamp("time_end") != null ? rs.getTimestamp("time_end").toLocalDateTime() : null);
        return connectionsPage;
    }

}

