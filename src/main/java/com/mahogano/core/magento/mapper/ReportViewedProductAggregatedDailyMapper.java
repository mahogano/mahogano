package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.ReportViewedProductAggregatedDaily;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReportViewedProductAggregatedDailyMapper implements RowMapper<ReportViewedProductAggregatedDaily> {

    @Override
    public ReportViewedProductAggregatedDaily mapRow(ResultSet rs, int i) throws SQLException {
        ReportViewedProductAggregatedDaily reportViewedProductAggregatedDaily = new ReportViewedProductAggregatedDaily();
        reportViewedProductAggregatedDaily.setId(rs.getInt("id"));
        reportViewedProductAggregatedDaily.setPeriod(rs.getTimestamp("period") != null ? rs.getTimestamp("period").toLocalDateTime() : null);
        reportViewedProductAggregatedDaily.setStoreId(rs.getInt("store_id"));
        reportViewedProductAggregatedDaily.setProductId(rs.getInt("product_id"));
        reportViewedProductAggregatedDaily.setProductName(rs.getString("product_name"));
        reportViewedProductAggregatedDaily.setProductPrice(rs.getBigDecimal("product_price"));
        reportViewedProductAggregatedDaily.setViewsNum(rs.getInt("views_num"));
        reportViewedProductAggregatedDaily.setRatingPos(rs.getInt("rating_pos"));
        return reportViewedProductAggregatedDaily;
    }

}

