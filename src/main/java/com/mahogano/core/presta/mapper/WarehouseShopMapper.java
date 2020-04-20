package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.WarehouseShop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WarehouseShopMapper implements RowMapper<WarehouseShop> {

    @Override
    public WarehouseShop mapRow(ResultSet rs, int i) throws SQLException {
        WarehouseShop warehouseShop = new WarehouseShop();
        warehouseShop.setIdShop(rs.getInt("id_shop"));
        warehouseShop.setIdWarehouse(rs.getInt("id_warehouse"));
        return warehouseShop;
    }

}

