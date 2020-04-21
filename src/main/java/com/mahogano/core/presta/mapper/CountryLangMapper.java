package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CountryLang;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CountryLangMapper implements RowMapper<CountryLang> {

    @Override
    public CountryLang mapRow(ResultSet rs, int i) throws SQLException {
        CountryLang countryLang = new CountryLang();
        countryLang.setIdCountry(rs.getInt("id_country"));
        countryLang.setIdLang(rs.getInt("id_lang"));
        countryLang.setName(rs.getString("name"));
        return countryLang;
    }

}

