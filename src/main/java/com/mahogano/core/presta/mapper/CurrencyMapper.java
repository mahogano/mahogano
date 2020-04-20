package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Currency;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CurrencyMapper implements RowMapper<Currency> {

    @Override
    public Currency mapRow(ResultSet rs, int i) throws SQLException {
        Currency currency = new Currency();
        currency.setIdCurrency(rs.getInt("id_currency"));
        currency.setName(rs.getString("name"));
        currency.setIsoCode(rs.getString("iso_code"));
        currency.setNumericIsoCode(rs.getString("numeric_iso_code"));
        currency.setPrecision(rs.getInt("precision"));
        currency.setConversionRate(rs.getBigDecimal("conversion_rate"));
        currency.setDeleted(rs.getInt("deleted"));
        currency.setActive(rs.getInt("active"));
        return currency;
    }

}

