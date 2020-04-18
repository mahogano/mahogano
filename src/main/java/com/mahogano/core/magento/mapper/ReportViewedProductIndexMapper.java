package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.ReportViewedProductIndex;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReportViewedProductIndexMapper implements RowMapper<ReportViewedProductIndex> {

    @Override
    public ReportViewedProductIndex mapRow(ResultSet rs, int i) throws SQLException {
        ReportViewedProductIndex reportViewedProductIndex = new ReportViewedProductIndex();
        reportViewedProductIndex.setIndexId(rs.getLong("index_id"));
        reportViewedProductIndex.setVisitorId(rs.getInt("visitor_id"));
        reportViewedProductIndex.setCustomerId(rs.getInt("customer_id"));
        reportViewedProductIndex.setProductId(rs.getInt("product_id"));
        reportViewedProductIndex.setStoreId(rs.getInt("store_id"));
        reportViewedProductIndex.setAddedAt(rs.getTimestamp("added_at").toLocalDateTime());
        return reportViewedProductIndex;
    }

}

