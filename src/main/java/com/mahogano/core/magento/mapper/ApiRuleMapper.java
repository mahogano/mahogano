package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.ApiRule;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ApiRuleMapper implements RowMapper<ApiRule> {

    @Override
    public ApiRule mapRow(ResultSet rs, int i) throws SQLException {
        ApiRule apiRule = new ApiRule();
        apiRule.setRuleId(rs.getInt("rule_id"));
        apiRule.setRoleId(rs.getInt("role_id"));
        apiRule.setResourceId(rs.getString("resource_id"));
        apiRule.setApiPrivileges(rs.getString("api_privileges"));
        apiRule.setAssertId(rs.getInt("assert_id"));
        apiRule.setRoleType(rs.getString("role_type"));
        apiRule.setApiPermission(rs.getString("api_permission"));
        return apiRule;
    }

}

