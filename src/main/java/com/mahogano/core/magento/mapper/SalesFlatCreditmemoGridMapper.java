package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesFlatCreditmemoGrid;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesFlatCreditmemoGridMapper implements RowMapper<SalesFlatCreditmemoGrid> {

    @Override
    public SalesFlatCreditmemoGrid mapRow(ResultSet rs, int i) throws SQLException {
        SalesFlatCreditmemoGrid salesFlatCreditmemoGrid = new SalesFlatCreditmemoGrid();
        salesFlatCreditmemoGrid.setEntityId(rs.getInt("entity_id"));
        salesFlatCreditmemoGrid.setStoreId(rs.getInt("store_id"));
        salesFlatCreditmemoGrid.setStoreToOrderRate(rs.getBigDecimal("store_to_order_rate"));
        salesFlatCreditmemoGrid.setBaseToOrderRate(rs.getBigDecimal("base_to_order_rate"));
        salesFlatCreditmemoGrid.setGrandTotal(rs.getBigDecimal("grand_total"));
        salesFlatCreditmemoGrid.setStoreToBaseRate(rs.getBigDecimal("store_to_base_rate"));
        salesFlatCreditmemoGrid.setBaseToGlobalRate(rs.getBigDecimal("base_to_global_rate"));
        salesFlatCreditmemoGrid.setBaseGrandTotal(rs.getBigDecimal("base_grand_total"));
        salesFlatCreditmemoGrid.setOrderId(rs.getInt("order_id"));
        salesFlatCreditmemoGrid.setCreditmemoStatus(rs.getInt("creditmemo_status"));
        salesFlatCreditmemoGrid.setState(rs.getInt("state"));
        salesFlatCreditmemoGrid.setInvoiceId(rs.getInt("invoice_id"));
        salesFlatCreditmemoGrid.setStoreCurrencyCode(rs.getString("store_currency_code"));
        salesFlatCreditmemoGrid.setOrderCurrencyCode(rs.getString("order_currency_code"));
        salesFlatCreditmemoGrid.setBaseCurrencyCode(rs.getString("base_currency_code"));
        salesFlatCreditmemoGrid.setGlobalCurrencyCode(rs.getString("global_currency_code"));
        salesFlatCreditmemoGrid.setIncrementId(rs.getString("increment_id"));
        salesFlatCreditmemoGrid.setOrderIncrementId(rs.getString("order_increment_id"));
        salesFlatCreditmemoGrid.setCreatedAt(rs.getTimestamp("created_at") != null ? rs.getTimestamp("created_at").toLocalDateTime() : null);
        salesFlatCreditmemoGrid.setOrderCreatedAt(rs.getTimestamp("order_created_at") != null ? rs.getTimestamp("order_created_at").toLocalDateTime() : null);
        salesFlatCreditmemoGrid.setBillingName(rs.getString("billing_name"));
        return salesFlatCreditmemoGrid;
    }

}

