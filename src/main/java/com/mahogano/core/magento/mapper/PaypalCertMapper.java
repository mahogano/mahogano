package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.PaypalCert;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PaypalCertMapper implements RowMapper<PaypalCert> {

    @Override
    public PaypalCert mapRow(ResultSet rs, int i) throws SQLException {
        PaypalCert paypalCert = new PaypalCert();
        paypalCert.setCertId(rs.getInt("cert_id"));
        paypalCert.setWebsiteId(rs.getInt("website_id"));
        paypalCert.setContent(rs.getString("content"));
        paypalCert.setUpdatedAt(rs.getTimestamp("updated_at") != null ? rs.getTimestamp("updated_at").toLocalDateTime() : null);
        return paypalCert;
    }

}

