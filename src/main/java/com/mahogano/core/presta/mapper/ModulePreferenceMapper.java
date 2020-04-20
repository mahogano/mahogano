package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ModulePreference;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ModulePreferenceMapper implements RowMapper<ModulePreference> {

    @Override
    public ModulePreference mapRow(ResultSet rs, int i) throws SQLException {
        ModulePreference modulePreference = new ModulePreference();
        modulePreference.setIdModulePreference(rs.getInt("id_module_preference"));
        modulePreference.setIdEmployee(rs.getInt("id_employee"));
        modulePreference.setModule(rs.getString("module"));
        modulePreference.setInterest(rs.getInt("interest"));
        modulePreference.setFavorite(rs.getInt("favorite"));
        return modulePreference;
    }

}

