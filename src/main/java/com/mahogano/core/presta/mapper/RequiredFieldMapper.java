package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.RequiredField;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RequiredFieldMapper implements RowMapper<RequiredField> {

    @Override
    public RequiredField mapRow(ResultSet rs, int i) throws SQLException {
        RequiredField requiredField = new RequiredField();
        requiredField.setIdRequiredField(rs.getInt("id_required_field"));
        requiredField.setObjectName(rs.getString("object_name"));
        requiredField.setFieldName(rs.getString("field_name"));
        return requiredField;
    }

}

