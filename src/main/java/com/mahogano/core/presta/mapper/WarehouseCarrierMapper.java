package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.WarehouseCarrier;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WarehouseCarrierMapper implements RowMapper<WarehouseCarrier> {

    @Override
    public WarehouseCarrier mapRow(ResultSet rs, int i) throws SQLException {
        WarehouseCarrier warehouseCarrier = new WarehouseCarrier();
        warehouseCarrier.setIdCarrier(rs.getInt("id_carrier"));
        warehouseCarrier.setIdWarehouse(rs.getInt("id_warehouse"));
        return warehouseCarrier;
    }

}

