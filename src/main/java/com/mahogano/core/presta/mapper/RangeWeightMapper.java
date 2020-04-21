package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.RangeWeight;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RangeWeightMapper implements RowMapper<RangeWeight> {

    @Override
    public RangeWeight mapRow(ResultSet rs, int i) throws SQLException {
        RangeWeight rangeWeight = new RangeWeight();
        rangeWeight.setIdRangeWeight(rs.getInt("id_range_weight"));
        rangeWeight.setIdCarrier(rs.getInt("id_carrier"));
        rangeWeight.setDelimiter1(rs.getBigDecimal("delimiter1"));
        rangeWeight.setDelimiter2(rs.getBigDecimal("delimiter2"));
        return rangeWeight;
    }

}

