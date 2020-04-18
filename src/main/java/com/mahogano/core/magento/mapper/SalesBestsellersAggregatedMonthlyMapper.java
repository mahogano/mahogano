package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesBestsellersAggregatedMonthly;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesBestsellersAggregatedMonthlyMapper implements RowMapper<SalesBestsellersAggregatedMonthly> {

    @Override
    public SalesBestsellersAggregatedMonthly mapRow(ResultSet rs, int i) throws SQLException {
        SalesBestsellersAggregatedMonthly salesBestsellersAggregatedMonthly = new SalesBestsellersAggregatedMonthly();
        salesBestsellersAggregatedMonthly.setId(rs.getInt("id"));
        salesBestsellersAggregatedMonthly.setPeriod(rs.getTimestamp("period") != null ? rs.getTimestamp("period").toLocalDateTime() : null);
        salesBestsellersAggregatedMonthly.setStoreId(rs.getInt("store_id"));
        salesBestsellersAggregatedMonthly.setProductId(rs.getInt("product_id"));
        salesBestsellersAggregatedMonthly.setProductTypeId(rs.getString("product_type_id"));
        salesBestsellersAggregatedMonthly.setProductName(rs.getString("product_name"));
        salesBestsellersAggregatedMonthly.setProductPrice(rs.getBigDecimal("product_price"));
        salesBestsellersAggregatedMonthly.setQtyOrdered(rs.getBigDecimal("qty_ordered"));
        salesBestsellersAggregatedMonthly.setRatingPos(rs.getInt("rating_pos"));
        return salesBestsellersAggregatedMonthly;
    }

}

