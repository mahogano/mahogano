package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.WeeeTax;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WeeeTaxMapper implements RowMapper<WeeeTax> {

    @Override
    public WeeeTax mapRow(ResultSet rs, int i) throws SQLException {
        WeeeTax weeeTax = new WeeeTax();
        weeeTax.setValueId(rs.getInt("value_id"));
        weeeTax.setWebsiteId(rs.getInt("website_id"));
        weeeTax.setEntityId(rs.getInt("entity_id"));
        weeeTax.setCountry(rs.getString("country"));
        weeeTax.setValue(rs.getBigDecimal("value"));
        weeeTax.setState(rs.getString("state"));
        weeeTax.setAttributeId(rs.getInt("attribute_id"));
        weeeTax.setEntityTypeId(rs.getInt("entity_type_id"));
        return weeeTax;
    }

}

