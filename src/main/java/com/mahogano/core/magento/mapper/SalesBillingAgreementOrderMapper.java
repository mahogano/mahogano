package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesBillingAgreementOrder;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesBillingAgreementOrderMapper implements RowMapper<SalesBillingAgreementOrder> {

    @Override
    public SalesBillingAgreementOrder mapRow(ResultSet rs, int i) throws SQLException {
        SalesBillingAgreementOrder salesBillingAgreementOrder = new SalesBillingAgreementOrder();
        salesBillingAgreementOrder.setAgreementId(rs.getInt("agreement_id"));
        salesBillingAgreementOrder.setOrderId(rs.getInt("order_id"));
        return salesBillingAgreementOrder;
    }

}

