package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.PaypalSettlementReport;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PaypalSettlementReportMapper implements RowMapper<PaypalSettlementReport> {

    @Override
    public PaypalSettlementReport mapRow(ResultSet rs, int i) throws SQLException {
        PaypalSettlementReport paypalSettlementReport = new PaypalSettlementReport();
        paypalSettlementReport.setReportId(rs.getInt("report_id"));
        paypalSettlementReport.setReportDate(rs.getTimestamp("report_date") != null ? rs.getTimestamp("report_date").toLocalDateTime() : null);
        paypalSettlementReport.setAccountId(rs.getString("account_id"));
        paypalSettlementReport.setFilename(rs.getString("filename"));
        paypalSettlementReport.setLastModified(rs.getTimestamp("last_modified") != null ? rs.getTimestamp("last_modified").toLocalDateTime() : null);
        return paypalSettlementReport;
    }

}

