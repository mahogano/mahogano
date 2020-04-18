package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesruleCouponUsage;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesruleCouponUsageMapper implements RowMapper<SalesruleCouponUsage> {

    @Override
    public SalesruleCouponUsage mapRow(ResultSet rs, int i) throws SQLException {
        SalesruleCouponUsage salesruleCouponUsage = new SalesruleCouponUsage();
        salesruleCouponUsage.setCouponId(rs.getInt("coupon_id"));
        salesruleCouponUsage.setCustomerId(rs.getInt("customer_id"));
        salesruleCouponUsage.setTimesUsed(rs.getInt("times_used"));
        return salesruleCouponUsage;
    }

}

