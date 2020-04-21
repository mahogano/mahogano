package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Zone;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ZoneMapper implements RowMapper<Zone> {

    @Override
    public Zone mapRow(ResultSet rs, int i) throws SQLException {
        Zone zone = new Zone();
        zone.setIdZone(rs.getInt("id_zone"));
        zone.setName(rs.getString("name"));
        zone.setActive(rs.getInt("active"));
        return zone;
    }

}

