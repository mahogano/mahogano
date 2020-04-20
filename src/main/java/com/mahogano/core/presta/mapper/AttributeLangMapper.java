package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.AttributeLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AttributeLangMapper implements RowMapper<AttributeLang> {

    @Override
    public AttributeLang mapRow(ResultSet rs, int i) throws SQLException {
        AttributeLang attributeLang = new AttributeLang();
        attributeLang.setIdAttribute(rs.getInt("id_attribute"));
        attributeLang.setIdLang(rs.getInt("id_lang"));
        attributeLang.setName(rs.getString("name"));
        return attributeLang;
    }

}

