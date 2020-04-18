package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesBestsellersAggregatedDaily;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesBestsellersAggregatedDailyMapper implements RowMapper<SalesBestsellersAggregatedDaily> {

    @Override
    public SalesBestsellersAggregatedDaily mapRow(ResultSet rs, int i) throws SQLException {
        SalesBestsellersAggregatedDaily salesBestsellersAggregatedDaily = new SalesBestsellersAggregatedDaily();
        salesBestsellersAggregatedDaily.setId(rs.getInt("id"));
        salesBestsellersAggregatedDaily.setPeriod(rs.getTimestamp("period") != null ? rs.getTimestamp("period").toLocalDateTime() : null);
        salesBestsellersAggregatedDaily.setStoreId(rs.getInt("store_id"));
        salesBestsellersAggregatedDaily.setProductId(rs.getInt("product_id"));
        salesBestsellersAggregatedDaily.setProductTypeId(rs.getString("product_type_id"));
        salesBestsellersAggregatedDaily.setProductName(rs.getString("product_name"));
        salesBestsellersAggregatedDaily.setProductPrice(rs.getBigDecimal("product_price"));
        salesBestsellersAggregatedDaily.setQtyOrdered(rs.getBigDecimal("qty_ordered"));
        salesBestsellersAggregatedDaily.setRatingPos(rs.getInt("rating_pos"));
        return salesBestsellersAggregatedDaily;
    }

}

