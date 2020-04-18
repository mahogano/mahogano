package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.DirectoryCurrencyRate;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DirectoryCurrencyRateMapper implements RowMapper<DirectoryCurrencyRate> {

    @Override
    public DirectoryCurrencyRate mapRow(ResultSet rs, int i) throws SQLException {
        DirectoryCurrencyRate directoryCurrencyRate = new DirectoryCurrencyRate();
        directoryCurrencyRate.setCurrencyFrom(rs.getString("currency_from"));
        directoryCurrencyRate.setCurrencyTo(rs.getString("currency_to"));
        directoryCurrencyRate.setRate(rs.getBigDecimal("rate"));
        return directoryCurrencyRate;
    }

}

