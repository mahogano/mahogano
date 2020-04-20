package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CurrencyShop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CurrencyShopMapper implements RowMapper<CurrencyShop> {

    @Override
    public CurrencyShop mapRow(ResultSet rs, int i) throws SQLException {
        CurrencyShop currencyShop = new CurrencyShop();
        currencyShop.setIdCurrency(rs.getInt("id_currency"));
        currencyShop.setIdShop(rs.getInt("id_shop"));
        currencyShop.setConversionRate(rs.getBigDecimal("conversion_rate"));
        return currencyShop;
    }

}

