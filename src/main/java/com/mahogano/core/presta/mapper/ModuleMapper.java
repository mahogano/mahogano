package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Module;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ModuleMapper implements RowMapper<Module> {

    @Override
    public Module mapRow(ResultSet rs, int i) throws SQLException {
        Module module = new Module();
        module.setIdModule(rs.getInt("id_module"));
        module.setName(rs.getString("name"));
        module.setActive(rs.getInt("active"));
        module.setVersion(rs.getString("version"));
        return module;
    }

}

