package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesFlatOrderGrid;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesFlatOrderGridMapper implements RowMapper<SalesFlatOrderGrid> {

    @Override
    public SalesFlatOrderGrid mapRow(ResultSet rs, int i) throws SQLException {
        SalesFlatOrderGrid salesFlatOrderGrid = new SalesFlatOrderGrid();
        salesFlatOrderGrid.setEntityId(rs.getInt("entity_id"));
        salesFlatOrderGrid.setStatus(rs.getString("status"));
        salesFlatOrderGrid.setStoreId(rs.getInt("store_id"));
        salesFlatOrderGrid.setStoreName(rs.getString("store_name"));
        salesFlatOrderGrid.setCustomerId(rs.getInt("customer_id"));
        salesFlatOrderGrid.setBaseGrandTotal(rs.getBigDecimal("base_grand_total"));
        salesFlatOrderGrid.setBaseTotalPaid(rs.getBigDecimal("base_total_paid"));
        salesFlatOrderGrid.setGrandTotal(rs.getBigDecimal("grand_total"));
        salesFlatOrderGrid.setTotalPaid(rs.getBigDecimal("total_paid"));
        salesFlatOrderGrid.setIncrementId(rs.getString("increment_id"));
        salesFlatOrderGrid.setBaseCurrencyCode(rs.getString("base_currency_code"));
        salesFlatOrderGrid.setOrderCurrencyCode(rs.getString("order_currency_code"));
        salesFlatOrderGrid.setShippingName(rs.getString("shipping_name"));
        salesFlatOrderGrid.setBillingName(rs.getString("billing_name"));
        salesFlatOrderGrid.setCreatedAt(rs.getTimestamp("created_at") != null ? rs.getTimestamp("created_at").toLocalDateTime() : null);
        salesFlatOrderGrid.setUpdatedAt(rs.getTimestamp("updated_at") != null ? rs.getTimestamp("updated_at").toLocalDateTime() : null);
        return salesFlatOrderGrid;
    }

}

