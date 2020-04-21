package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ModuleAccess;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ModuleAccessMapper implements RowMapper<ModuleAccess> {

    @Override
    public ModuleAccess mapRow(ResultSet rs, int i) throws SQLException {
        ModuleAccess moduleAccess = new ModuleAccess();
        moduleAccess.setIdProfile(rs.getInt("id_profile"));
        moduleAccess.setIdAuthorizationRole(rs.getInt("id_authorization_role"));
        return moduleAccess;
    }

}

