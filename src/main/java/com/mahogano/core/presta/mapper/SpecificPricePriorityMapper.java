package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.SpecificPricePriority;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SpecificPricePriorityMapper implements RowMapper<SpecificPricePriority> {

    @Override
    public SpecificPricePriority mapRow(ResultSet rs, int i) throws SQLException {
        SpecificPricePriority specificPricePriority = new SpecificPricePriority();
        specificPricePriority.setIdSpecificPricePriority(rs.getInt("id_specific_price_priority"));
        specificPricePriority.setIdProduct(rs.getInt("id_product"));
        specificPricePriority.setPriority(rs.getString("priority"));
        return specificPricePriority;
    }

}

