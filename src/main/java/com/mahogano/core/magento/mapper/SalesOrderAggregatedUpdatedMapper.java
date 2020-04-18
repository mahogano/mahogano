package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesOrderAggregatedUpdated;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesOrderAggregatedUpdatedMapper implements RowMapper<SalesOrderAggregatedUpdated> {

    @Override
    public SalesOrderAggregatedUpdated mapRow(ResultSet rs, int i) throws SQLException {
        SalesOrderAggregatedUpdated salesOrderAggregatedUpdated = new SalesOrderAggregatedUpdated();
        salesOrderAggregatedUpdated.setId(rs.getInt("id"));
        salesOrderAggregatedUpdated.setPeriod(rs.getTimestamp("period") != null ? rs.getTimestamp("period").toLocalDateTime() : null);
        salesOrderAggregatedUpdated.setStoreId(rs.getInt("store_id"));
        salesOrderAggregatedUpdated.setOrderStatus(rs.getString("order_status"));
        salesOrderAggregatedUpdated.setOrdersCount(rs.getInt("orders_count"));
        salesOrderAggregatedUpdated.setTotalQtyOrdered(rs.getBigDecimal("total_qty_ordered"));
        salesOrderAggregatedUpdated.setTotalQtyInvoiced(rs.getBigDecimal("total_qty_invoiced"));
        salesOrderAggregatedUpdated.setTotalIncomeAmount(rs.getBigDecimal("total_income_amount"));
        salesOrderAggregatedUpdated.setTotalRevenueAmount(rs.getBigDecimal("total_revenue_amount"));
        salesOrderAggregatedUpdated.setTotalProfitAmount(rs.getBigDecimal("total_profit_amount"));
        salesOrderAggregatedUpdated.setTotalInvoicedAmount(rs.getBigDecimal("total_invoiced_amount"));
        salesOrderAggregatedUpdated.setTotalCanceledAmount(rs.getBigDecimal("total_canceled_amount"));
        salesOrderAggregatedUpdated.setTotalPaidAmount(rs.getBigDecimal("total_paid_amount"));
        salesOrderAggregatedUpdated.setTotalRefundedAmount(rs.getBigDecimal("total_refunded_amount"));
        salesOrderAggregatedUpdated.setTotalTaxAmount(rs.getBigDecimal("total_tax_amount"));
        salesOrderAggregatedUpdated.setTotalTaxAmountActual(rs.getBigDecimal("total_tax_amount_actual"));
        salesOrderAggregatedUpdated.setTotalShippingAmount(rs.getBigDecimal("total_shipping_amount"));
        salesOrderAggregatedUpdated.setTotalShippingAmountActual(rs.getBigDecimal("total_shipping_amount_actual"));
        salesOrderAggregatedUpdated.setTotalDiscountAmount(rs.getBigDecimal("total_discount_amount"));
        salesOrderAggregatedUpdated.setTotalDiscountAmountActual(rs.getBigDecimal("total_discount_amount_actual"));
        return salesOrderAggregatedUpdated;
    }

}

