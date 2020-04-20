package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.TabLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TabLangMapper implements RowMapper<TabLang> {

    @Override
    public TabLang mapRow(ResultSet rs, int i) throws SQLException {
        TabLang tabLang = new TabLang();
        tabLang.setIdTab(rs.getInt("id_tab"));
        tabLang.setIdLang(rs.getInt("id_lang"));
        tabLang.setName(rs.getString("name"));
        return tabLang;
    }

}

