package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CarrierLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarrierLangMapper implements RowMapper<CarrierLang> {

    @Override
    public CarrierLang mapRow(ResultSet rs, int i) throws SQLException {
        CarrierLang carrierLang = new CarrierLang();
        carrierLang.setIdCarrier(rs.getInt("id_carrier"));
        carrierLang.setIdShop(rs.getInt("id_shop"));
        carrierLang.setIdLang(rs.getInt("id_lang"));
        carrierLang.setDelay(rs.getString("delay"));
        return carrierLang;
    }

}

