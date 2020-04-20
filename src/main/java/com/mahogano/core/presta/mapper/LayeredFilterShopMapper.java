package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.LayeredFilterShop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LayeredFilterShopMapper implements RowMapper<LayeredFilterShop> {

    @Override
    public LayeredFilterShop mapRow(ResultSet rs, int i) throws SQLException {
        LayeredFilterShop layeredFilterShop = new LayeredFilterShop();
        layeredFilterShop.setIdLayeredFilter(rs.getInt("id_layered_filter"));
        layeredFilterShop.setIdShop(rs.getInt("id_shop"));
        return layeredFilterShop;
    }

}

