package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.ReportComparedProductIndex;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReportComparedProductIndexMapper implements RowMapper<ReportComparedProductIndex> {

    @Override
    public ReportComparedProductIndex mapRow(ResultSet rs, int i) throws SQLException {
        ReportComparedProductIndex reportComparedProductIndex = new ReportComparedProductIndex();
        reportComparedProductIndex.setIndexId(rs.getLong("index_id"));
        reportComparedProductIndex.setVisitorId(rs.getInt("visitor_id"));
        reportComparedProductIndex.setCustomerId(rs.getInt("customer_id"));
        reportComparedProductIndex.setProductId(rs.getInt("product_id"));
        reportComparedProductIndex.setStoreId(rs.getInt("store_id"));
        reportComparedProductIndex.setAddedAt(rs.getTimestamp("added_at").toLocalDateTime());
        return reportComparedProductIndex;
    }

}

