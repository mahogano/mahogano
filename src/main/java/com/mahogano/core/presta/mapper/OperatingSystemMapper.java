package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.OperatingSystem;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OperatingSystemMapper implements RowMapper<OperatingSystem> {

    @Override
    public OperatingSystem mapRow(ResultSet rs, int i) throws SQLException {
        OperatingSystem operatingSystem = new OperatingSystem();
        operatingSystem.setIdOperatingSystem(rs.getInt("id_operating_system"));
        operatingSystem.setName(rs.getString("name"));
        return operatingSystem;
    }

}

