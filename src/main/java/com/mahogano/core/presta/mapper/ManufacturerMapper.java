package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Manufacturer;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ManufacturerMapper implements RowMapper<Manufacturer> {

    @Override
    public Manufacturer mapRow(ResultSet rs, int i) throws SQLException {
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setIdManufacturer(rs.getInt("id_manufacturer"));
        manufacturer.setName(rs.getString("name"));
        manufacturer.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        manufacturer.setDateUpd(rs.getTimestamp("date_upd").toLocalDateTime());
        manufacturer.setActive(rs.getInt("active"));
        return manufacturer;
    }

}

