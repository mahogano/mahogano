package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesruleCoupon;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesruleCouponMapper implements RowMapper<SalesruleCoupon> {

    @Override
    public SalesruleCoupon mapRow(ResultSet rs, int i) throws SQLException {
        SalesruleCoupon salesruleCoupon = new SalesruleCoupon();
        salesruleCoupon.setCouponId(rs.getInt("coupon_id"));
        salesruleCoupon.setRuleId(rs.getInt("rule_id"));
        salesruleCoupon.setCode(rs.getString("code"));
        salesruleCoupon.setUsageLimit(rs.getInt("usage_limit"));
        salesruleCoupon.setUsagePerCustomer(rs.getInt("usage_per_customer"));
        salesruleCoupon.setTimesUsed(rs.getInt("times_used"));
        salesruleCoupon.setExpirationDate(rs.getTimestamp("expiration_date") != null ? rs.getTimestamp("expiration_date").toLocalDateTime() : null);
        salesruleCoupon.setIsPrimary(rs.getInt("is_primary"));
        salesruleCoupon.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        salesruleCoupon.setType(rs.getInt("type"));
        return salesruleCoupon;
    }

}

