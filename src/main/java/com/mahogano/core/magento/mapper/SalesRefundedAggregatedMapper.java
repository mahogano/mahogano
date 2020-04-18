package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesRefundedAggregated;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesRefundedAggregatedMapper implements RowMapper<SalesRefundedAggregated> {

    @Override
    public SalesRefundedAggregated mapRow(ResultSet rs, int i) throws SQLException {
        SalesRefundedAggregated salesRefundedAggregated = new SalesRefundedAggregated();
        salesRefundedAggregated.setId(rs.getInt("id"));
        salesRefundedAggregated.setPeriod(rs.getTimestamp("period") != null ? rs.getTimestamp("period").toLocalDateTime() : null);
        salesRefundedAggregated.setStoreId(rs.getInt("store_id"));
        salesRefundedAggregated.setOrderStatus(rs.getString("order_status"));
        salesRefundedAggregated.setOrdersCount(rs.getInt("orders_count"));
        salesRefundedAggregated.setRefunded(rs.getBigDecimal("refunded"));
        salesRefundedAggregated.setOnlineRefunded(rs.getBigDecimal("online_refunded"));
        salesRefundedAggregated.setOfflineRefunded(rs.getBigDecimal("offline_refunded"));
        return salesRefundedAggregated;
    }

}

