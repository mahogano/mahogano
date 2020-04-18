package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesInvoicedAggregatedOrder;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesInvoicedAggregatedOrderMapper implements RowMapper<SalesInvoicedAggregatedOrder> {

    @Override
    public SalesInvoicedAggregatedOrder mapRow(ResultSet rs, int i) throws SQLException {
        SalesInvoicedAggregatedOrder salesInvoicedAggregatedOrder = new SalesInvoicedAggregatedOrder();
        salesInvoicedAggregatedOrder.setId(rs.getInt("id"));
        salesInvoicedAggregatedOrder.setPeriod(rs.getTimestamp("period") != null ? rs.getTimestamp("period").toLocalDateTime() : null);
        salesInvoicedAggregatedOrder.setStoreId(rs.getInt("store_id"));
        salesInvoicedAggregatedOrder.setOrderStatus(rs.getString("order_status"));
        salesInvoicedAggregatedOrder.setOrdersCount(rs.getInt("orders_count"));
        salesInvoicedAggregatedOrder.setOrdersInvoiced(rs.getBigDecimal("orders_invoiced"));
        salesInvoicedAggregatedOrder.setInvoiced(rs.getBigDecimal("invoiced"));
        salesInvoicedAggregatedOrder.setInvoicedCaptured(rs.getBigDecimal("invoiced_captured"));
        salesInvoicedAggregatedOrder.setInvoicedNotCaptured(rs.getBigDecimal("invoiced_not_captured"));
        return salesInvoicedAggregatedOrder;
    }

}

