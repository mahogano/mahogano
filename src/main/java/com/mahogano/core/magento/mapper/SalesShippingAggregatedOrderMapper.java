package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesShippingAggregatedOrder;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesShippingAggregatedOrderMapper implements RowMapper<SalesShippingAggregatedOrder> {

    @Override
    public SalesShippingAggregatedOrder mapRow(ResultSet rs, int i) throws SQLException {
        SalesShippingAggregatedOrder salesShippingAggregatedOrder = new SalesShippingAggregatedOrder();
        salesShippingAggregatedOrder.setId(rs.getInt("id"));
        salesShippingAggregatedOrder.setPeriod(rs.getTimestamp("period") != null ? rs.getTimestamp("period").toLocalDateTime() : null);
        salesShippingAggregatedOrder.setStoreId(rs.getInt("store_id"));
        salesShippingAggregatedOrder.setOrderStatus(rs.getString("order_status"));
        salesShippingAggregatedOrder.setShippingDescription(rs.getString("shipping_description"));
        salesShippingAggregatedOrder.setOrdersCount(rs.getInt("orders_count"));
        salesShippingAggregatedOrder.setTotalShipping(rs.getBigDecimal("total_shipping"));
        salesShippingAggregatedOrder.setTotalShippingActual(rs.getBigDecimal("total_shipping_actual"));
        return salesShippingAggregatedOrder;
    }

}

