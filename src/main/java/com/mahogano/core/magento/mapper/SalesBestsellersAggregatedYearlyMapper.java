package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesBestsellersAggregatedYearly;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesBestsellersAggregatedYearlyMapper implements RowMapper<SalesBestsellersAggregatedYearly> {

    @Override
    public SalesBestsellersAggregatedYearly mapRow(ResultSet rs, int i) throws SQLException {
        SalesBestsellersAggregatedYearly salesBestsellersAggregatedYearly = new SalesBestsellersAggregatedYearly();
        salesBestsellersAggregatedYearly.setId(rs.getInt("id"));
        salesBestsellersAggregatedYearly.setPeriod(rs.getTimestamp("period") != null ? rs.getTimestamp("period").toLocalDateTime() : null);
        salesBestsellersAggregatedYearly.setStoreId(rs.getInt("store_id"));
        salesBestsellersAggregatedYearly.setProductId(rs.getInt("product_id"));
        salesBestsellersAggregatedYearly.setProductTypeId(rs.getString("product_type_id"));
        salesBestsellersAggregatedYearly.setProductName(rs.getString("product_name"));
        salesBestsellersAggregatedYearly.setProductPrice(rs.getBigDecimal("product_price"));
        salesBestsellersAggregatedYearly.setQtyOrdered(rs.getBigDecimal("qty_ordered"));
        salesBestsellersAggregatedYearly.setRatingPos(rs.getInt("rating_pos"));
        return salesBestsellersAggregatedYearly;
    }

}

