package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.HookModule;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HookModuleMapper implements RowMapper<HookModule> {

    @Override
    public HookModule mapRow(ResultSet rs, int i) throws SQLException {
        HookModule hookModule = new HookModule();
        hookModule.setIdModule(rs.getInt("id_module"));
        hookModule.setIdShop(rs.getInt("id_shop"));
        hookModule.setIdHook(rs.getInt("id_hook"));
        hookModule.setPosition(rs.getInt("position"));
        return hookModule;
    }

}

