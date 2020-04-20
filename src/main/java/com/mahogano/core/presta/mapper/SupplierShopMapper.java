package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.SupplierShop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SupplierShopMapper implements RowMapper<SupplierShop> {

    @Override
    public SupplierShop mapRow(ResultSet rs, int i) throws SQLException {
        SupplierShop supplierShop = new SupplierShop();
        supplierShop.setIdSupplier(rs.getInt("id_supplier"));
        supplierShop.setIdShop(rs.getInt("id_shop"));
        return supplierShop;
    }

}

