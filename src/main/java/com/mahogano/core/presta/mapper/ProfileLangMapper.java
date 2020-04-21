package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ProfileLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProfileLangMapper implements RowMapper<ProfileLang> {

    @Override
    public ProfileLang mapRow(ResultSet rs, int i) throws SQLException {
        ProfileLang profileLang = new ProfileLang();
        profileLang.setIdLang(rs.getInt("id_lang"));
        profileLang.setIdProfile(rs.getInt("id_profile"));
        profileLang.setName(rs.getString("name"));
        return profileLang;
    }

}

