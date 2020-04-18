package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesShippingAggregated;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesShippingAggregatedMapper implements RowMapper<SalesShippingAggregated> {

    @Override
    public SalesShippingAggregated mapRow(ResultSet rs, int i) throws SQLException {
        SalesShippingAggregated salesShippingAggregated = new SalesShippingAggregated();
        salesShippingAggregated.setId(rs.getInt("id"));
        salesShippingAggregated.setPeriod(rs.getTimestamp("period") != null ? rs.getTimestamp("period").toLocalDateTime() : null);
        salesShippingAggregated.setStoreId(rs.getInt("store_id"));
        salesShippingAggregated.setOrderStatus(rs.getString("order_status"));
        salesShippingAggregated.setShippingDescription(rs.getString("shipping_description"));
        salesShippingAggregated.setOrdersCount(rs.getInt("orders_count"));
        salesShippingAggregated.setTotalShipping(rs.getBigDecimal("total_shipping"));
        salesShippingAggregated.setTotalShippingActual(rs.getBigDecimal("total_shipping_actual"));
        return salesShippingAggregated;
    }

}

