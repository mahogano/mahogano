package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CustomizationFieldLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomizationFieldLangMapper implements RowMapper<CustomizationFieldLang> {

    @Override
    public CustomizationFieldLang mapRow(ResultSet rs, int i) throws SQLException {
        CustomizationFieldLang customizationFieldLang = new CustomizationFieldLang();
        customizationFieldLang.setIdCustomizationField(rs.getInt("id_customization_field"));
        customizationFieldLang.setIdLang(rs.getInt("id_lang"));
        customizationFieldLang.setIdShop(rs.getInt("id_shop"));
        customizationFieldLang.setName(rs.getString("name"));
        return customizationFieldLang;
    }

}

