package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesOrderStatusState;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesOrderStatusStateMapper implements RowMapper<SalesOrderStatusState> {

    @Override
    public SalesOrderStatusState mapRow(ResultSet rs, int i) throws SQLException {
        SalesOrderStatusState salesOrderStatusState = new SalesOrderStatusState();
        salesOrderStatusState.setStatus(rs.getString("status"));
        salesOrderStatusState.setState(rs.getString("state"));
        salesOrderStatusState.setIsDefault(rs.getInt("is_default"));
        return salesOrderStatusState;
    }

}

