package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Connections;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionsMapper implements RowMapper<Connections> {

    @Override
    public Connections mapRow(ResultSet rs, int i) throws SQLException {
        Connections connections = new Connections();
        connections.setIdConnections(rs.getInt("id_connections"));
        connections.setIdShopGroup(rs.getInt("id_shop_group"));
        connections.setIdShop(rs.getInt("id_shop"));
        connections.setIdGuest(rs.getInt("id_guest"));
        connections.setIdPage(rs.getInt("id_page"));
        connections.setIpAddress(rs.getLong("ip_address"));
        connections.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        connections.setHttpReferer(rs.getString("http_referer"));
        return connections;
    }

}

