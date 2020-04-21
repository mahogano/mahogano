package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.AddressFormat;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddressFormatMapper implements RowMapper<AddressFormat> {

    @Override
    public AddressFormat mapRow(ResultSet rs, int i) throws SQLException {
        AddressFormat addressFormat = new AddressFormat();
        addressFormat.setIdCountry(rs.getInt("id_country"));
        addressFormat.setFormat(rs.getString("format"));
        return addressFormat;
    }

}

