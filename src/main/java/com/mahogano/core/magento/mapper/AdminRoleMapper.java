package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.AdminRole;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminRoleMapper implements RowMapper<AdminRole> {

    @Override
    public AdminRole mapRow(ResultSet rs, int i) throws SQLException {
        AdminRole adminRole = new AdminRole();
        adminRole.setRoleId(rs.getInt("role_id"));
        adminRole.setParentId(rs.getInt("parent_id"));
        adminRole.setTreeLevel(rs.getInt("tree_level"));
        adminRole.setSortOrder(rs.getInt("sort_order"));
        adminRole.setRoleType(rs.getString("role_type"));
        adminRole.setUserId(rs.getInt("user_id"));
        adminRole.setRoleName(rs.getString("role_name"));
        return adminRole;
    }

}

