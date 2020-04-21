package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ModuleCountry;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ModuleCountryMapper implements RowMapper<ModuleCountry> {

    @Override
    public ModuleCountry mapRow(ResultSet rs, int i) throws SQLException {
        ModuleCountry moduleCountry = new ModuleCountry();
        moduleCountry.setIdModule(rs.getInt("id_module"));
        moduleCountry.setIdShop(rs.getInt("id_shop"));
        moduleCountry.setIdCountry(rs.getInt("id_country"));
        return moduleCountry;
    }

}

