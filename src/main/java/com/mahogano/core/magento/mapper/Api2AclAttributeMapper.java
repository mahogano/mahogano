package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.Api2AclAttribute;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Api2AclAttributeMapper implements RowMapper<Api2AclAttribute> {

    @Override
    public Api2AclAttribute mapRow(ResultSet rs, int i) throws SQLException {
        Api2AclAttribute api2AclAttribute = new Api2AclAttribute();
        api2AclAttribute.setEntityId(rs.getInt("entity_id"));
        api2AclAttribute.setUserType(rs.getString("user_type"));
        api2AclAttribute.setResourceId(rs.getString("resource_id"));
        api2AclAttribute.setOperation(rs.getString("operation"));
        api2AclAttribute.setAllowedAttributes(rs.getString("allowed_attributes"));
        return api2AclAttribute;
    }

}

