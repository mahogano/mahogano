package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CarrierShop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarrierShopMapper implements RowMapper<CarrierShop> {

    @Override
    public CarrierShop mapRow(ResultSet rs, int i) throws SQLException {
        CarrierShop carrierShop = new CarrierShop();
        carrierShop.setIdCarrier(rs.getInt("id_carrier"));
        carrierShop.setIdShop(rs.getInt("id_shop"));
        return carrierShop;
    }

}

