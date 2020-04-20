package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ManufacturerShop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ManufacturerShopMapper implements RowMapper<ManufacturerShop> {

    @Override
    public ManufacturerShop mapRow(ResultSet rs, int i) throws SQLException {
        ManufacturerShop manufacturerShop = new ManufacturerShop();
        manufacturerShop.setIdManufacturer(rs.getInt("id_manufacturer"));
        manufacturerShop.setIdShop(rs.getInt("id_shop"));
        return manufacturerShop;
    }

}

