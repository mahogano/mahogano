package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ManufacturerLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ManufacturerLangMapper implements RowMapper<ManufacturerLang> {

    @Override
    public ManufacturerLang mapRow(ResultSet rs, int i) throws SQLException {
        ManufacturerLang manufacturerLang = new ManufacturerLang();
        manufacturerLang.setIdManufacturer(rs.getInt("id_manufacturer"));
        manufacturerLang.setIdLang(rs.getInt("id_lang"));
        manufacturerLang.setDescription(rs.getString("description"));
        manufacturerLang.setShortDescription(rs.getString("short_description"));
        manufacturerLang.setMetaTitle(rs.getString("meta_title"));
        manufacturerLang.setMetaKeywords(rs.getString("meta_keywords"));
        manufacturerLang.setMetaDescription(rs.getString("meta_description"));
        return manufacturerLang;
    }

}

