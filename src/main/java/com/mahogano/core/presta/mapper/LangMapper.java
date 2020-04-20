package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Lang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LangMapper implements RowMapper<Lang> {

    @Override
    public Lang mapRow(ResultSet rs, int i) throws SQLException {
        Lang lang = new Lang();
        lang.setIdLang(rs.getInt("id_lang"));
        lang.setName(rs.getString("name"));
        lang.setActive(rs.getInt("active"));
        lang.setIsoCode(rs.getString("iso_code"));
        lang.setLanguageCode(rs.getString("language_code"));
        lang.setLocale(rs.getString("locale"));
        lang.setDateFormatLite(rs.getString("date_format_lite"));
        lang.setDateFormatFull(rs.getString("date_format_full"));
        lang.setIsRtl(rs.getInt("is_rtl"));
        return lang;
    }

}

