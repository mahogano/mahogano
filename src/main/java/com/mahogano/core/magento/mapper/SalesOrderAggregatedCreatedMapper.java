package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesOrderAggregatedCreated;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesOrderAggregatedCreatedMapper implements RowMapper<SalesOrderAggregatedCreated> {

    @Override
    public SalesOrderAggregatedCreated mapRow(ResultSet rs, int i) throws SQLException {
        SalesOrderAggregatedCreated salesOrderAggregatedCreated = new SalesOrderAggregatedCreated();
        salesOrderAggregatedCreated.setId(rs.getInt("id"));
        salesOrderAggregatedCreated.setPeriod(rs.getTimestamp("period") != null ? rs.getTimestamp("period").toLocalDateTime() : null);
        salesOrderAggregatedCreated.setStoreId(rs.getInt("store_id"));
        salesOrderAggregatedCreated.setOrderStatus(rs.getString("order_status"));
        salesOrderAggregatedCreated.setOrdersCount(rs.getInt("orders_count"));
        salesOrderAggregatedCreated.setTotalQtyOrdered(rs.getBigDecimal("total_qty_ordered"));
        salesOrderAggregatedCreated.setTotalQtyInvoiced(rs.getBigDecimal("total_qty_invoiced"));
        salesOrderAggregatedCreated.setTotalIncomeAmount(rs.getBigDecimal("total_income_amount"));
        salesOrderAggregatedCreated.setTotalRevenueAmount(rs.getBigDecimal("total_revenue_amount"));
        salesOrderAggregatedCreated.setTotalProfitAmount(rs.getBigDecimal("total_profit_amount"));
        salesOrderAggregatedCreated.setTotalInvoicedAmount(rs.getBigDecimal("total_invoiced_amount"));
        salesOrderAggregatedCreated.setTotalCanceledAmount(rs.getBigDecimal("total_canceled_amount"));
        salesOrderAggregatedCreated.setTotalPaidAmount(rs.getBigDecimal("total_paid_amount"));
        salesOrderAggregatedCreated.setTotalRefundedAmount(rs.getBigDecimal("total_refunded_amount"));
        salesOrderAggregatedCreated.setTotalTaxAmount(rs.getBigDecimal("total_tax_amount"));
        salesOrderAggregatedCreated.setTotalTaxAmountActual(rs.getBigDecimal("total_tax_amount_actual"));
        salesOrderAggregatedCreated.setTotalShippingAmount(rs.getBigDecimal("total_shipping_amount"));
        salesOrderAggregatedCreated.setTotalShippingAmountActual(rs.getBigDecimal("total_shipping_amount_actual"));
        salesOrderAggregatedCreated.setTotalDiscountAmount(rs.getBigDecimal("total_discount_amount"));
        salesOrderAggregatedCreated.setTotalDiscountAmountActual(rs.getBigDecimal("total_discount_amount_actual"));
        return salesOrderAggregatedCreated;
    }

}

