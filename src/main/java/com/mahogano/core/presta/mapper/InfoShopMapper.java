package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.InfoShop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InfoShopMapper implements RowMapper<InfoShop> {

    @Override
    public InfoShop mapRow(ResultSet rs, int i) throws SQLException {
        InfoShop infoShop = new InfoShop();
        infoShop.setIdInfo(rs.getInt("id_info"));
        infoShop.setIdShop(rs.getInt("id_shop"));
        return infoShop;
    }

}

