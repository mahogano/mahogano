package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesFlatInvoiceGrid;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesFlatInvoiceGridMapper implements RowMapper<SalesFlatInvoiceGrid> {

    @Override
    public SalesFlatInvoiceGrid mapRow(ResultSet rs, int i) throws SQLException {
        SalesFlatInvoiceGrid salesFlatInvoiceGrid = new SalesFlatInvoiceGrid();
        salesFlatInvoiceGrid.setEntityId(rs.getInt("entity_id"));
        salesFlatInvoiceGrid.setStoreId(rs.getInt("store_id"));
        salesFlatInvoiceGrid.setBaseGrandTotal(rs.getBigDecimal("base_grand_total"));
        salesFlatInvoiceGrid.setGrandTotal(rs.getBigDecimal("grand_total"));
        salesFlatInvoiceGrid.setOrderId(rs.getInt("order_id"));
        salesFlatInvoiceGrid.setState(rs.getInt("state"));
        salesFlatInvoiceGrid.setStoreCurrencyCode(rs.getString("store_currency_code"));
        salesFlatInvoiceGrid.setOrderCurrencyCode(rs.getString("order_currency_code"));
        salesFlatInvoiceGrid.setBaseCurrencyCode(rs.getString("base_currency_code"));
        salesFlatInvoiceGrid.setGlobalCurrencyCode(rs.getString("global_currency_code"));
        salesFlatInvoiceGrid.setIncrementId(rs.getString("increment_id"));
        salesFlatInvoiceGrid.setOrderIncrementId(rs.getString("order_increment_id"));
        salesFlatInvoiceGrid.setCreatedAt(rs.getTimestamp("created_at") != null ? rs.getTimestamp("created_at").toLocalDateTime() : null);
        salesFlatInvoiceGrid.setOrderCreatedAt(rs.getTimestamp("order_created_at") != null ? rs.getTimestamp("order_created_at").toLocalDateTime() : null);
        salesFlatInvoiceGrid.setBillingName(rs.getString("billing_name"));
        return salesFlatInvoiceGrid;
    }

}

