package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ReassuranceLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReassuranceLangMapper implements RowMapper<ReassuranceLang> {

    @Override
    public ReassuranceLang mapRow(ResultSet rs, int i) throws SQLException {
        ReassuranceLang reassuranceLang = new ReassuranceLang();
        reassuranceLang.setIdReassurance(rs.getInt("id_reassurance"));
        reassuranceLang.setIdLang(rs.getInt("id_lang"));
        reassuranceLang.setText(rs.getString("text"));
        return reassuranceLang;
    }

}

