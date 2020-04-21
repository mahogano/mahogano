package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.TaxLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaxLangMapper implements RowMapper<TaxLang> {

    @Override
    public TaxLang mapRow(ResultSet rs, int i) throws SQLException {
        TaxLang taxLang = new TaxLang();
        taxLang.setIdTax(rs.getInt("id_tax"));
        taxLang.setIdLang(rs.getInt("id_lang"));
        taxLang.setName(rs.getString("name"));
        return taxLang;
    }

}

