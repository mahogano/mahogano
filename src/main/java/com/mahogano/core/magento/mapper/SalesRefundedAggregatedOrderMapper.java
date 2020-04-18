package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesRefundedAggregatedOrder;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesRefundedAggregatedOrderMapper implements RowMapper<SalesRefundedAggregatedOrder> {

    @Override
    public SalesRefundedAggregatedOrder mapRow(ResultSet rs, int i) throws SQLException {
        SalesRefundedAggregatedOrder salesRefundedAggregatedOrder = new SalesRefundedAggregatedOrder();
        salesRefundedAggregatedOrder.setId(rs.getInt("id"));
        salesRefundedAggregatedOrder.setPeriod(rs.getTimestamp("period") != null ? rs.getTimestamp("period").toLocalDateTime() : null);
        salesRefundedAggregatedOrder.setStoreId(rs.getInt("store_id"));
        salesRefundedAggregatedOrder.setOrderStatus(rs.getString("order_status"));
        salesRefundedAggregatedOrder.setOrdersCount(rs.getInt("orders_count"));
        salesRefundedAggregatedOrder.setRefunded(rs.getBigDecimal("refunded"));
        salesRefundedAggregatedOrder.setOnlineRefunded(rs.getBigDecimal("online_refunded"));
        salesRefundedAggregatedOrder.setOfflineRefunded(rs.getBigDecimal("offline_refunded"));
        return salesRefundedAggregatedOrder;
    }

}

