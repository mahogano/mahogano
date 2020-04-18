package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.LogCustomer;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LogCustomerMapper implements RowMapper<LogCustomer> {

    @Override
    public LogCustomer mapRow(ResultSet rs, int i) throws SQLException {
        LogCustomer logCustomer = new LogCustomer();
        logCustomer.setLogId(rs.getInt("log_id"));
        logCustomer.setVisitorId(rs.getLong("visitor_id"));
        logCustomer.setCustomerId(rs.getInt("customer_id"));
        logCustomer.setLoginAt(rs.getTimestamp("login_at").toLocalDateTime());
        logCustomer.setLogoutAt(rs.getTimestamp("logout_at") != null ? rs.getTimestamp("logout_at").toLocalDateTime() : null);
        logCustomer.setStoreId(rs.getInt("store_id"));
        return logCustomer;
    }

}

