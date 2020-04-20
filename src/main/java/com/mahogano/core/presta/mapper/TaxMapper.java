package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.Tax;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaxMapper implements RowMapper<Tax> {

    @Override
    public Tax mapRow(ResultSet rs, int i) throws SQLException {
        Tax tax = new Tax();
        tax.setIdTax(rs.getInt("id_tax"));
        tax.setRate(rs.getBigDecimal("rate"));
        tax.setActive(rs.getInt("active"));
        tax.setDeleted(rs.getInt("deleted"));
        return tax;
    }

}

