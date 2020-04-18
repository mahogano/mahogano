package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.TaxOrderAggregatedCreated;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaxOrderAggregatedCreatedMapper implements RowMapper<TaxOrderAggregatedCreated> {

    @Override
    public TaxOrderAggregatedCreated mapRow(ResultSet rs, int i) throws SQLException {
        TaxOrderAggregatedCreated taxOrderAggregatedCreated = new TaxOrderAggregatedCreated();
        taxOrderAggregatedCreated.setId(rs.getInt("id"));
        taxOrderAggregatedCreated.setPeriod(rs.getTimestamp("period") != null ? rs.getTimestamp("period").toLocalDateTime() : null);
        taxOrderAggregatedCreated.setStoreId(rs.getInt("store_id"));
        taxOrderAggregatedCreated.setCode(rs.getString("code"));
        taxOrderAggregatedCreated.setOrderStatus(rs.getString("order_status"));
        taxOrderAggregatedCreated.setPercent(rs.getFloat("percent"));
        taxOrderAggregatedCreated.setOrdersCount(rs.getInt("orders_count"));
        taxOrderAggregatedCreated.setTaxBaseAmountSum(rs.getFloat("tax_base_amount_sum"));
        return taxOrderAggregatedCreated;
    }

}

