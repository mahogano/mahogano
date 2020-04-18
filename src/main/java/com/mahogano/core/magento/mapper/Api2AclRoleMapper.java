package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.Api2AclRole;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Api2AclRoleMapper implements RowMapper<Api2AclRole> {

    @Override
    public Api2AclRole mapRow(ResultSet rs, int i) throws SQLException {
        Api2AclRole api2AclRole = new Api2AclRole();
        api2AclRole.setEntityId(rs.getInt("entity_id"));
        api2AclRole.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        api2AclRole.setUpdatedAt(rs.getTimestamp("updated_at") != null ? rs.getTimestamp("updated_at").toLocalDateTime() : null);
        api2AclRole.setRoleName(rs.getString("role_name"));
        return api2AclRole;
    }

}

