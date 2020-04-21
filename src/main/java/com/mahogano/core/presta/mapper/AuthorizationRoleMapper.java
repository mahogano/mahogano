package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.AuthorizationRole;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthorizationRoleMapper implements RowMapper<AuthorizationRole> {

    @Override
    public AuthorizationRole mapRow(ResultSet rs, int i) throws SQLException {
        AuthorizationRole authorizationRole = new AuthorizationRole();
        authorizationRole.setIdAuthorizationRole(rs.getInt("id_authorization_role"));
        authorizationRole.setSlug(rs.getString("slug"));
        return authorizationRole;
    }

}

