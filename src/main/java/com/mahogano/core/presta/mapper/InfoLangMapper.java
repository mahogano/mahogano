package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.InfoLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InfoLangMapper implements RowMapper<InfoLang> {

    @Override
    public InfoLang mapRow(ResultSet rs, int i) throws SQLException {
        InfoLang infoLang = new InfoLang();
        infoLang.setIdInfo(rs.getInt("id_info"));
        infoLang.setIdShop(rs.getInt("id_shop"));
        infoLang.setIdLang(rs.getInt("id_lang"));
        infoLang.setText(rs.getString("text"));
        return infoLang;
    }

}

