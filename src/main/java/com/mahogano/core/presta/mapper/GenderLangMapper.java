package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.GenderLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GenderLangMapper implements RowMapper<GenderLang> {

    @Override
    public GenderLang mapRow(ResultSet rs, int i) throws SQLException {
        GenderLang genderLang = new GenderLang();
        genderLang.setIdGender(rs.getInt("id_gender"));
        genderLang.setIdLang(rs.getInt("id_lang"));
        genderLang.setName(rs.getString("name"));
        return genderLang;
    }

}

