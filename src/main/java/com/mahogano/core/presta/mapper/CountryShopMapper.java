package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.CountryShop;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CountryShopMapper implements RowMapper<CountryShop> {

    @Override
    public CountryShop mapRow(ResultSet rs, int i) throws SQLException {
        CountryShop countryShop = new CountryShop();
        countryShop.setIdCountry(rs.getInt("id_country"));
        countryShop.setIdShop(rs.getInt("id_shop"));
        return countryShop;
    }

}

