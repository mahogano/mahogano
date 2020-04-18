package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesOrderStatus;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesOrderStatusMapper implements RowMapper<SalesOrderStatus> {

    @Override
    public SalesOrderStatus mapRow(ResultSet rs, int i) throws SQLException {
        SalesOrderStatus salesOrderStatus = new SalesOrderStatus();
        salesOrderStatus.setStatus(rs.getString("status"));
        salesOrderStatus.setLabel(rs.getString("label"));
        return salesOrderStatus;
    }

}

