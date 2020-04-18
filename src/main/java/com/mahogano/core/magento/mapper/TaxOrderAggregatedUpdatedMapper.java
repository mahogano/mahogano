package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.TaxOrderAggregatedUpdated;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaxOrderAggregatedUpdatedMapper implements RowMapper<TaxOrderAggregatedUpdated> {

    @Override
    public TaxOrderAggregatedUpdated mapRow(ResultSet rs, int i) throws SQLException {
        TaxOrderAggregatedUpdated taxOrderAggregatedUpdated = new TaxOrderAggregatedUpdated();
        taxOrderAggregatedUpdated.setId(rs.getInt("id"));
        taxOrderAggregatedUpdated.setPeriod(rs.getTimestamp("period") != null ? rs.getTimestamp("period").toLocalDateTime() : null);
        taxOrderAggregatedUpdated.setStoreId(rs.getInt("store_id"));
        taxOrderAggregatedUpdated.setCode(rs.getString("code"));
        taxOrderAggregatedUpdated.setOrderStatus(rs.getString("order_status"));
        taxOrderAggregatedUpdated.setPercent(rs.getFloat("percent"));
        taxOrderAggregatedUpdated.setOrdersCount(rs.getInt("orders_count"));
        taxOrderAggregatedUpdated.setTaxBaseAmountSum(rs.getFloat("tax_base_amount_sum"));
        return taxOrderAggregatedUpdated;
    }

}

