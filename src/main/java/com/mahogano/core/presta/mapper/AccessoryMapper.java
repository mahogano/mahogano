package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Accessory;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccessoryMapper implements RowMapper<Accessory> {

    @Override
    public Accessory mapRow(ResultSet rs, int i) throws SQLException {
        Accessory accessory = new Accessory();
        accessory.setIdProduct1(rs.getInt("id_product_1"));
        accessory.setIdProduct2(rs.getInt("id_product_2"));
        return accessory;
    }

}

