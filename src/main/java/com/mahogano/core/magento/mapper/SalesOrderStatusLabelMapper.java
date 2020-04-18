package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesOrderStatusLabel;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesOrderStatusLabelMapper implements RowMapper<SalesOrderStatusLabel> {

    @Override
    public SalesOrderStatusLabel mapRow(ResultSet rs, int i) throws SQLException {
        SalesOrderStatusLabel salesOrderStatusLabel = new SalesOrderStatusLabel();
        salesOrderStatusLabel.setStatus(rs.getString("status"));
        salesOrderStatusLabel.setStoreId(rs.getInt("store_id"));
        salesOrderStatusLabel.setLabel(rs.getString("label"));
        return salesOrderStatusLabel;
    }

}

