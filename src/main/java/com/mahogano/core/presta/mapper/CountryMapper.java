package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Country;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CountryMapper implements RowMapper<Country> {

    @Override
    public Country mapRow(ResultSet rs, int i) throws SQLException {
        Country country = new Country();
        country.setIdCountry(rs.getInt("id_country"));
        country.setIdZone(rs.getInt("id_zone"));
        country.setIdCurrency(rs.getInt("id_currency"));
        country.setIsoCode(rs.getString("iso_code"));
        country.setCallPrefix(rs.getInt("call_prefix"));
        country.setActive(rs.getInt("active"));
        country.setContainsStates(rs.getInt("contains_states"));
        country.setNeedIdentificationNumber(rs.getInt("need_identification_number"));
        country.setNeedZipCode(rs.getInt("need_zip_code"));
        country.setZipCodeFormat(rs.getString("zip_code_format"));
        country.setDisplayTaxLabel(rs.getInt("display_tax_label"));
        return country;
    }

}

