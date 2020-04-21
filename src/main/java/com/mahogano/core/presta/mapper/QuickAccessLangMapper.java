package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.QuickAccessLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QuickAccessLangMapper implements RowMapper<QuickAccessLang> {

    @Override
    public QuickAccessLang mapRow(ResultSet rs, int i) throws SQLException {
        QuickAccessLang quickAccessLang = new QuickAccessLang();
        quickAccessLang.setIdQuickAccess(rs.getInt("id_quick_access"));
        quickAccessLang.setIdLang(rs.getInt("id_lang"));
        quickAccessLang.setName(rs.getString("name"));
        return quickAccessLang;
    }

}

