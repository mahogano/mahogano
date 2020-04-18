package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesBillingAgreement;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesBillingAgreementMapper implements RowMapper<SalesBillingAgreement> {

    @Override
    public SalesBillingAgreement mapRow(ResultSet rs, int i) throws SQLException {
        SalesBillingAgreement salesBillingAgreement = new SalesBillingAgreement();
        salesBillingAgreement.setAgreementId(rs.getInt("agreement_id"));
        salesBillingAgreement.setCustomerId(rs.getInt("customer_id"));
        salesBillingAgreement.setMethodCode(rs.getString("method_code"));
        salesBillingAgreement.setReferenceId(rs.getString("reference_id"));
        salesBillingAgreement.setStatus(rs.getString("status"));
        salesBillingAgreement.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        salesBillingAgreement.setUpdatedAt(rs.getTimestamp("updated_at") != null ? rs.getTimestamp("updated_at").toLocalDateTime() : null);
        salesBillingAgreement.setStoreId(rs.getInt("store_id"));
        salesBillingAgreement.setAgreementLabel(rs.getString("agreement_label"));
        return salesBillingAgreement;
    }

}

