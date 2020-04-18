package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CoreVariable;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CoreVariableMapper implements RowMapper<CoreVariable> {

    @Override
    public CoreVariable mapRow(ResultSet rs, int i) throws SQLException {
        CoreVariable coreVariable = new CoreVariable();
        coreVariable.setVariableId(rs.getInt("variable_id"));
        coreVariable.setCode(rs.getString("code"));
        coreVariable.setName(rs.getString("name"));
        return coreVariable;
    }

}

