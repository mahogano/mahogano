package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.MemcachedServers;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemcachedServersMapper implements RowMapper<MemcachedServers> {

    @Override
    public MemcachedServers mapRow(ResultSet rs, int i) throws SQLException {
        MemcachedServers memcachedServers = new MemcachedServers();
        memcachedServers.setIdMemcachedServer(rs.getInt("id_memcached_server"));
        memcachedServers.setIp(rs.getString("ip"));
        memcachedServers.setPort(rs.getInt("port"));
        memcachedServers.setWeight(rs.getInt("weight"));
        return memcachedServers;
    }

}

