package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ModuleCarrier;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ModuleCarrierMapper implements RowMapper<ModuleCarrier> {

    @Override
    public ModuleCarrier mapRow(ResultSet rs, int i) throws SQLException {
        ModuleCarrier moduleCarrier = new ModuleCarrier();
        moduleCarrier.setIdModule(rs.getInt("id_module"));
        moduleCarrier.setIdShop(rs.getInt("id_shop"));
        moduleCarrier.setIdReference(rs.getInt("id_reference"));
        return moduleCarrier;
    }

}

