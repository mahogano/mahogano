package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.Api2AclRule;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Api2AclRuleMapper implements RowMapper<Api2AclRule> {

    @Override
    public Api2AclRule mapRow(ResultSet rs, int i) throws SQLException {
        Api2AclRule api2AclRule = new Api2AclRule();
        api2AclRule.setEntityId(rs.getInt("entity_id"));
        api2AclRule.setRoleId(rs.getInt("role_id"));
        api2AclRule.setResourceId(rs.getString("resource_id"));
        api2AclRule.setPrivilege(rs.getString("privilege"));
        return api2AclRule;
    }

}

