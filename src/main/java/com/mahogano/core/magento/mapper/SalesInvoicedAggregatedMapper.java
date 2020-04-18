package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesInvoicedAggregated;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesInvoicedAggregatedMapper implements RowMapper<SalesInvoicedAggregated> {

    @Override
    public SalesInvoicedAggregated mapRow(ResultSet rs, int i) throws SQLException {
        SalesInvoicedAggregated salesInvoicedAggregated = new SalesInvoicedAggregated();
        salesInvoicedAggregated.setId(rs.getInt("id"));
        salesInvoicedAggregated.setPeriod(rs.getTimestamp("period") != null ? rs.getTimestamp("period").toLocalDateTime() : null);
        salesInvoicedAggregated.setStoreId(rs.getInt("store_id"));
        salesInvoicedAggregated.setOrderStatus(rs.getString("order_status"));
        salesInvoicedAggregated.setOrdersCount(rs.getInt("orders_count"));
        salesInvoicedAggregated.setOrdersInvoiced(rs.getBigDecimal("orders_invoiced"));
        salesInvoicedAggregated.setInvoiced(rs.getBigDecimal("invoiced"));
        salesInvoicedAggregated.setInvoicedCaptured(rs.getBigDecimal("invoiced_captured"));
        salesInvoicedAggregated.setInvoicedNotCaptured(rs.getBigDecimal("invoiced_not_captured"));
        return salesInvoicedAggregated;
    }

}

