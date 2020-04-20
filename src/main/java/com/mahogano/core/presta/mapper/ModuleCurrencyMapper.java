package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.ModuleCurrency;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ModuleCurrencyMapper implements RowMapper<ModuleCurrency> {

    @Override
    public ModuleCurrency mapRow(ResultSet rs, int i) throws SQLException {
        ModuleCurrency moduleCurrency = new ModuleCurrency();
        moduleCurrency.setIdModule(rs.getInt("id_module"));
        moduleCurrency.setIdShop(rs.getInt("id_shop"));
        moduleCurrency.setIdCurrency(rs.getInt("id_currency"));
        return moduleCurrency;
    }

}

