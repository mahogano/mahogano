package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CarrierZone;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarrierZoneMapper implements RowMapper<CarrierZone> {

    @Override
    public CarrierZone mapRow(ResultSet rs, int i) throws SQLException {
        CarrierZone carrierZone = new CarrierZone();
        carrierZone.setIdCarrier(rs.getInt("id_carrier"));
        carrierZone.setIdZone(rs.getInt("id_zone"));
        return carrierZone;
    }

}

