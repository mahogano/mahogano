package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.WarehouseProductLocation;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WarehouseProductLocationMapper implements RowMapper<WarehouseProductLocation> {

    @Override
    public WarehouseProductLocation mapRow(ResultSet rs, int i) throws SQLException {
        WarehouseProductLocation warehouseProductLocation = new WarehouseProductLocation();
        warehouseProductLocation.setIdWarehouseProductLocation(rs.getInt("id_warehouse_product_location"));
        warehouseProductLocation.setIdProduct(rs.getInt("id_product"));
        warehouseProductLocation.setIdProductAttribute(rs.getInt("id_product_attribute"));
        warehouseProductLocation.setIdWarehouse(rs.getInt("id_warehouse"));
        warehouseProductLocation.setLocation(rs.getString("location"));
        return warehouseProductLocation;
    }

}

