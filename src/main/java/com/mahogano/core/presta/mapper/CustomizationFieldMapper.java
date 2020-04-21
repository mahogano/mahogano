package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CustomizationField;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomizationFieldMapper implements RowMapper<CustomizationField> {

    @Override
    public CustomizationField mapRow(ResultSet rs, int i) throws SQLException {
        CustomizationField customizationField = new CustomizationField();
        customizationField.setIdCustomizationField(rs.getInt("id_customization_field"));
        customizationField.setIdProduct(rs.getInt("id_product"));
        customizationField.setType(rs.getInt("type"));
        customizationField.setRequired(rs.getInt("required"));
        customizationField.setIsModule(rs.getInt("is_module"));
        customizationField.setIsDeleted(rs.getInt("is_deleted"));
        return customizationField;
    }

}

