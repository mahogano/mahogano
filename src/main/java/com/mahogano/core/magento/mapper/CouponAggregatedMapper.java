package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CouponAggregated;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CouponAggregatedMapper implements RowMapper<CouponAggregated> {

    @Override
    public CouponAggregated mapRow(ResultSet rs, int i) throws SQLException {
        CouponAggregated couponAggregated = new CouponAggregated();
        couponAggregated.setId(rs.getInt("id"));
        couponAggregated.setPeriod(rs.getTimestamp("period").toLocalDateTime());
        couponAggregated.setStoreId(rs.getInt("store_id"));
        couponAggregated.setOrderStatus(rs.getString("order_status"));
        couponAggregated.setCouponCode(rs.getString("coupon_code"));
        couponAggregated.setCouponUses(rs.getInt("coupon_uses"));
        couponAggregated.setSubtotalAmount(rs.getBigDecimal("subtotal_amount"));
        couponAggregated.setDiscountAmount(rs.getBigDecimal("discount_amount"));
        couponAggregated.setTotalAmount(rs.getBigDecimal("total_amount"));
        couponAggregated.setSubtotalAmountActual(rs.getBigDecimal("subtotal_amount_actual"));
        couponAggregated.setDiscountAmountActual(rs.getBigDecimal("discount_amount_actual"));
        couponAggregated.setTotalAmountActual(rs.getBigDecimal("total_amount_actual"));
        couponAggregated.setRuleName(rs.getString("rule_name"));
        return couponAggregated;
    }

}

