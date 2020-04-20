package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.SupplyOrderStateLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SupplyOrderStateLangMapper implements RowMapper<SupplyOrderStateLang> {

    @Override
    public SupplyOrderStateLang mapRow(ResultSet rs, int i) throws SQLException {
        SupplyOrderStateLang supplyOrderStateLang = new SupplyOrderStateLang();
        supplyOrderStateLang.setIdSupplyOrderState(rs.getInt("id_supply_order_state"));
        supplyOrderStateLang.setIdLang(rs.getInt("id_lang"));
        supplyOrderStateLang.setName(rs.getString("name"));
        return supplyOrderStateLang;
    }

}

