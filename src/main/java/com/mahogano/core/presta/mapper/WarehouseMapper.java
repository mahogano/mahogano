package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Warehouse;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WarehouseMapper implements RowMapper<Warehouse> {

    @Override
    public Warehouse mapRow(ResultSet rs, int i) throws SQLException {
        Warehouse warehouse = new Warehouse();
        warehouse.setIdWarehouse(rs.getInt("id_warehouse"));
        warehouse.setIdCurrency(rs.getInt("id_currency"));
        warehouse.setIdAddress(rs.getInt("id_address"));
        warehouse.setIdEmployee(rs.getInt("id_employee"));
        warehouse.setReference(rs.getString("reference"));
        warehouse.setName(rs.getString("name"));
        warehouse.setManagementType(rs.getString("management_type"));
        warehouse.setDeleted(rs.getInt("deleted"));
        return warehouse;
    }

}

