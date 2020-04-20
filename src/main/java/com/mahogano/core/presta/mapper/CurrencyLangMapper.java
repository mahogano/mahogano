package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CurrencyLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CurrencyLangMapper implements RowMapper<CurrencyLang> {

    @Override
    public CurrencyLang mapRow(ResultSet rs, int i) throws SQLException {
        CurrencyLang currencyLang = new CurrencyLang();
        currencyLang.setIdCurrency(rs.getInt("id_currency"));
        currencyLang.setIdLang(rs.getInt("id_lang"));
        currencyLang.setName(rs.getString("name"));
        currencyLang.setSymbol(rs.getString("symbol"));
        return currencyLang;
    }

}

