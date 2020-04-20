package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Supplier;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SupplierMapper implements RowMapper<Supplier> {

    @Override
    public Supplier mapRow(ResultSet rs, int i) throws SQLException {
        Supplier supplier = new Supplier();
        supplier.setIdSupplier(rs.getInt("id_supplier"));
        supplier.setName(rs.getString("name"));
        supplier.setDateAdd(rs.getTimestamp("date_add").toLocalDateTime());
        supplier.setDateUpd(rs.getTimestamp("date_upd").toLocalDateTime());
        supplier.setActive(rs.getInt("active"));
        return supplier;
    }

}

