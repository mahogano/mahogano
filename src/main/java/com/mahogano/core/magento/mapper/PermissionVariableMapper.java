package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.PermissionVariable;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PermissionVariableMapper implements RowMapper<PermissionVariable> {

    @Override
    public PermissionVariable mapRow(ResultSet rs, int i) throws SQLException {
        PermissionVariable permissionVariable = new PermissionVariable();
        permissionVariable.setVariableId(rs.getInt("variable_id"));
        permissionVariable.setVariableName(rs.getString("variable_name"));
        permissionVariable.setIsAllowed(rs.getInt("is_allowed"));
        return permissionVariable;
    }

}

