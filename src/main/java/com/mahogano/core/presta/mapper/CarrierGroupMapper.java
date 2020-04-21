package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CarrierGroup;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarrierGroupMapper implements RowMapper<CarrierGroup> {

    @Override
    public CarrierGroup mapRow(ResultSet rs, int i) throws SQLException {
        CarrierGroup carrierGroup = new CarrierGroup();
        carrierGroup.setIdCarrier(rs.getInt("id_carrier"));
        carrierGroup.setIdGroup(rs.getInt("id_group"));
        return carrierGroup;
    }

}

