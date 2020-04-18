package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.CouponAggregatedOrder;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CouponAggregatedOrderMapper implements RowMapper<CouponAggregatedOrder> {

    @Override
    public CouponAggregatedOrder mapRow(ResultSet rs, int i) throws SQLException {
        CouponAggregatedOrder couponAggregatedOrder = new CouponAggregatedOrder();
        couponAggregatedOrder.setId(rs.getInt("id"));
        couponAggregatedOrder.setPeriod(rs.getTimestamp("period").toLocalDateTime());
        couponAggregatedOrder.setStoreId(rs.getInt("store_id"));
        couponAggregatedOrder.setOrderStatus(rs.getString("order_status"));
        couponAggregatedOrder.setCouponCode(rs.getString("coupon_code"));
        couponAggregatedOrder.setCouponUses(rs.getInt("coupon_uses"));
        couponAggregatedOrder.setSubtotalAmount(rs.getBigDecimal("subtotal_amount"));
        couponAggregatedOrder.setDiscountAmount(rs.getBigDecimal("discount_amount"));
        couponAggregatedOrder.setTotalAmount(rs.getBigDecimal("total_amount"));
        couponAggregatedOrder.setRuleName(rs.getString("rule_name"));
        return couponAggregatedOrder;
    }

}

