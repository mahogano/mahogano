package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ZoneShop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ZoneShopMapper implements RowMapper<ZoneShop> {

    @Override
    public ZoneShop mapRow(ResultSet rs, int i) throws SQLException {
        ZoneShop zoneShop = new ZoneShop();
        zoneShop.setIdZone(rs.getInt("id_zone"));
        zoneShop.setIdShop(rs.getInt("id_shop"));
        return zoneShop;
    }

}

