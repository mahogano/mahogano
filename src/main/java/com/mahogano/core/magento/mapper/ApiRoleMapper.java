package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.ApiRole;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ApiRoleMapper implements RowMapper<ApiRole> {

    @Override
    public ApiRole mapRow(ResultSet rs, int i) throws SQLException {
        ApiRole apiRole = new ApiRole();
        apiRole.setRoleId(rs.getInt("role_id"));
        apiRole.setParentId(rs.getInt("parent_id"));
        apiRole.setTreeLevel(rs.getInt("tree_level"));
        apiRole.setSortOrder(rs.getInt("sort_order"));
        apiRole.setRoleType(rs.getString("role_type"));
        apiRole.setUserId(rs.getInt("user_id"));
        apiRole.setRoleName(rs.getString("role_name"));
        return apiRole;
    }

}

