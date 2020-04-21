package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Access;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccessMapper implements RowMapper<Access> {

    @Override
    public Access mapRow(ResultSet rs, int i) throws SQLException {
        Access access = new Access();
        access.setIdProfile(rs.getInt("id_profile"));
        access.setIdAuthorizationRole(rs.getInt("id_authorization_role"));
        return access;
    }

}

