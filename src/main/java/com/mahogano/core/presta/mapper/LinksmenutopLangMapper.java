package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.LinksmenutopLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LinksmenutopLangMapper implements RowMapper<LinksmenutopLang> {

    @Override
    public LinksmenutopLang mapRow(ResultSet rs, int i) throws SQLException {
        LinksmenutopLang linksmenutopLang = new LinksmenutopLang();
        linksmenutopLang.setIdLinksmenutop(rs.getInt("id_linksmenutop"));
        linksmenutopLang.setIdLang(rs.getInt("id_lang"));
        linksmenutopLang.setIdShop(rs.getInt("id_shop"));
        linksmenutopLang.setLabel(rs.getString("label"));
        linksmenutopLang.setLink(rs.getString("link"));
        return linksmenutopLang;
    }

}

