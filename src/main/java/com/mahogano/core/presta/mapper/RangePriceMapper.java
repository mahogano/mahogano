package com.mahogano.core.presta.mapper;

import com.mahogano.core.presta.entity.RangePrice;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RangePriceMapper implements RowMapper<RangePrice> {

    @Override
    public RangePrice mapRow(ResultSet rs, int i) throws SQLException {
        RangePrice rangePrice = new RangePrice();
        rangePrice.setIdRangePrice(rs.getInt("id_range_price"));
        rangePrice.setIdCarrier(rs.getInt("id_carrier"));
        rangePrice.setDelimiter1(rs.getBigDecimal("delimiter1"));
        rangePrice.setDelimiter2(rs.getBigDecimal("delimiter2"));
        return rangePrice;
    }

}

