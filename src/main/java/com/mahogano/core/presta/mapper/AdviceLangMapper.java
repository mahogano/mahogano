package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.AdviceLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdviceLangMapper implements RowMapper<AdviceLang> {

    @Override
    public AdviceLang mapRow(ResultSet rs, int i) throws SQLException {
        AdviceLang adviceLang = new AdviceLang();
        adviceLang.setIdAdvice(rs.getInt("id_advice"));
        adviceLang.setIdLang(rs.getInt("id_lang"));
        adviceLang.setHtml(rs.getString("html"));
        return adviceLang;
    }

}

