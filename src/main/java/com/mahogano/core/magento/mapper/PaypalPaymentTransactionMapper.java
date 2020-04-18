package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.PaypalPaymentTransaction;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PaypalPaymentTransactionMapper implements RowMapper<PaypalPaymentTransaction> {

    @Override
    public PaypalPaymentTransaction mapRow(ResultSet rs, int i) throws SQLException {
        PaypalPaymentTransaction paypalPaymentTransaction = new PaypalPaymentTransaction();
        paypalPaymentTransaction.setTransactionId(rs.getInt("transaction_id"));
        paypalPaymentTransaction.setTxnId(rs.getString("txn_id"));
        paypalPaymentTransaction.setAdditionalInformation(rs.getBytes("additional_information"));
        paypalPaymentTransaction.setCreatedAt(rs.getTimestamp("created_at") != null ? rs.getTimestamp("created_at").toLocalDateTime() : null);
        return paypalPaymentTransaction;
    }

}

