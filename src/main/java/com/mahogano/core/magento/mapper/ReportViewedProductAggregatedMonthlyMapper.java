package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.ReportViewedProductAggregatedMonthly;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReportViewedProductAggregatedMonthlyMapper implements RowMapper<ReportViewedProductAggregatedMonthly> {

    @Override
    public ReportViewedProductAggregatedMonthly mapRow(ResultSet rs, int i) throws SQLException {
        ReportViewedProductAggregatedMonthly reportViewedProductAggregatedMonthly = new ReportViewedProductAggregatedMonthly();
        reportViewedProductAggregatedMonthly.setId(rs.getInt("id"));
        reportViewedProductAggregatedMonthly.setPeriod(rs.getTimestamp("period") != null ? rs.getTimestamp("period").toLocalDateTime() : null);
        reportViewedProductAggregatedMonthly.setStoreId(rs.getInt("store_id"));
        reportViewedProductAggregatedMonthly.setProductId(rs.getInt("product_id"));
        reportViewedProductAggregatedMonthly.setProductName(rs.getString("product_name"));
        reportViewedProductAggregatedMonthly.setProductPrice(rs.getBigDecimal("product_price"));
        reportViewedProductAggregatedMonthly.setViewsNum(rs.getInt("views_num"));
        reportViewedProductAggregatedMonthly.setRatingPos(rs.getInt("rating_pos"));
        return reportViewedProductAggregatedMonthly;
    }

}

