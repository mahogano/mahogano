package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ModuleShop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ModuleShopMapper implements RowMapper<ModuleShop> {

    @Override
    public ModuleShop mapRow(ResultSet rs, int i) throws SQLException {
        ModuleShop moduleShop = new ModuleShop();
        moduleShop.setIdModule(rs.getInt("id_module"));
        moduleShop.setIdShop(rs.getInt("id_shop"));
        moduleShop.setEnableDevice(rs.getInt("enable_device"));
        return moduleShop;
    }

}

