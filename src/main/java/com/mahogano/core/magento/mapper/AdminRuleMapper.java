package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.AdminRule;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminRuleMapper implements RowMapper<AdminRule> {

    @Override
    public AdminRule mapRow(ResultSet rs, int i) throws SQLException {
        AdminRule adminRule = new AdminRule();
        adminRule.setRuleId(rs.getInt("rule_id"));
        adminRule.setRoleId(rs.getInt("role_id"));
        adminRule.setResourceId(rs.getString("resource_id"));
        adminRule.setPrivileges(rs.getString("privileges"));
        adminRule.setAssertId(rs.getInt("assert_id"));
        adminRule.setRoleType(rs.getString("role_type"));
        adminRule.setPermission(rs.getString("permission"));
        return adminRule;
    }

}

