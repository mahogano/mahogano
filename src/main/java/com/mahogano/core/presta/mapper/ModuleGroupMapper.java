package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ModuleGroup;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ModuleGroupMapper implements RowMapper<ModuleGroup> {

    @Override
    public ModuleGroup mapRow(ResultSet rs, int i) throws SQLException {
        ModuleGroup moduleGroup = new ModuleGroup();
        moduleGroup.setIdModule(rs.getInt("id_module"));
        moduleGroup.setIdShop(rs.getInt("id_shop"));
        moduleGroup.setIdGroup(rs.getInt("id_group"));
        return moduleGroup;
    }

}

