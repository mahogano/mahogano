package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.Api2AclUser;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Api2AclUserMapper implements RowMapper<Api2AclUser> {

    @Override
    public Api2AclUser mapRow(ResultSet rs, int i) throws SQLException {
        Api2AclUser api2AclUser = new Api2AclUser();
        api2AclUser.setAdminId(rs.getInt("admin_id"));
        api2AclUser.setRoleId(rs.getInt("role_id"));
        return api2AclUser;
    }

}

