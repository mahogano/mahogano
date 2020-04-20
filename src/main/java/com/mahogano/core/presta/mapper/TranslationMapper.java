package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Translation;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TranslationMapper implements RowMapper<Translation> {

    @Override
    public Translation mapRow(ResultSet rs, int i) throws SQLException {
        Translation translation = new Translation();
        translation.setIdTranslation(rs.getInt("id_translation"));
        translation.setIdLang(rs.getInt("id_lang"));
        translation.setKey(rs.getString("key"));
        translation.setTranslation(rs.getString("translation"));
        translation.setDomain(rs.getString("domain"));
        translation.setTheme(rs.getString("theme"));
        return translation;
    }

}

