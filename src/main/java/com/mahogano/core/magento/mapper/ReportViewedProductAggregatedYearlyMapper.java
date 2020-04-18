package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.ReportViewedProductAggregatedYearly;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReportViewedProductAggregatedYearlyMapper implements RowMapper<ReportViewedProductAggregatedYearly> {

    @Override
    public ReportViewedProductAggregatedYearly mapRow(ResultSet rs, int i) throws SQLException {
        ReportViewedProductAggregatedYearly reportViewedProductAggregatedYearly = new ReportViewedProductAggregatedYearly();
        reportViewedProductAggregatedYearly.setId(rs.getInt("id"));
        reportViewedProductAggregatedYearly.setPeriod(rs.getTimestamp("period") != null ? rs.getTimestamp("period").toLocalDateTime() : null);
        reportViewedProductAggregatedYearly.setStoreId(rs.getInt("store_id"));
        reportViewedProductAggregatedYearly.setProductId(rs.getInt("product_id"));
        reportViewedProductAggregatedYearly.setProductName(rs.getString("product_name"));
        reportViewedProductAggregatedYearly.setProductPrice(rs.getBigDecimal("product_price"));
        reportViewedProductAggregatedYearly.setViewsNum(rs.getInt("views_num"));
        reportViewedProductAggregatedYearly.setRatingPos(rs.getInt("rating_pos"));
        return reportViewedProductAggregatedYearly;
    }

}

