package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Timezone;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TimezoneMapper implements RowMapper<Timezone> {

    @Override
    public Timezone mapRow(ResultSet rs, int i) throws SQLException {
        Timezone timezone = new Timezone();
        timezone.setIdTimezone(rs.getInt("id_timezone"));
        timezone.setName(rs.getString("name"));
        return timezone;
    }

}

