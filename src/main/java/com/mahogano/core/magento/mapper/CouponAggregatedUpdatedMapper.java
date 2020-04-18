package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CouponAggregatedUpdated;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CouponAggregatedUpdatedMapper implements RowMapper<CouponAggregatedUpdated> {

    @Override
    public CouponAggregatedUpdated mapRow(ResultSet rs, int i) throws SQLException {
        CouponAggregatedUpdated couponAggregatedUpdated = new CouponAggregatedUpdated();
        couponAggregatedUpdated.setId(rs.getInt("id"));
        couponAggregatedUpdated.setPeriod(rs.getTimestamp("period").toLocalDateTime());
        couponAggregatedUpdated.setStoreId(rs.getInt("store_id"));
        couponAggregatedUpdated.setOrderStatus(rs.getString("order_status"));
        couponAggregatedUpdated.setCouponCode(rs.getString("coupon_code"));
        couponAggregatedUpdated.setCouponUses(rs.getInt("coupon_uses"));
        couponAggregatedUpdated.setSubtotalAmount(rs.getBigDecimal("subtotal_amount"));
        couponAggregatedUpdated.setDiscountAmount(rs.getBigDecimal("discount_amount"));
        couponAggregatedUpdated.setTotalAmount(rs.getBigDecimal("total_amount"));
        couponAggregatedUpdated.setSubtotalAmountActual(rs.getBigDecimal("subtotal_amount_actual"));
        couponAggregatedUpdated.setDiscountAmountActual(rs.getBigDecimal("discount_amount_actual"));
        couponAggregatedUpdated.setTotalAmountActual(rs.getBigDecimal("total_amount_actual"));
        couponAggregatedUpdated.setRuleName(rs.getString("rule_name"));
        return couponAggregatedUpdated;
    }

}

