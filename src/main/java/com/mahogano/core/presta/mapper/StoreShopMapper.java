package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.StoreShop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StoreShopMapper implements RowMapper<StoreShop> {

    @Override
    public StoreShop mapRow(ResultSet rs, int i) throws SQLException {
        StoreShop storeShop = new StoreShop();
        storeShop.setIdStore(rs.getInt("id_store"));
        storeShop.setIdShop(rs.getInt("id_shop"));
        return storeShop;
    }

}

