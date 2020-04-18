package com.mahogano.core.magento.mapper;

import com.mahogano.core.magento.entity.SalesPaymentTransaction;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesPaymentTransactionMapper implements RowMapper<SalesPaymentTransaction> {

    @Override
    public SalesPaymentTransaction mapRow(ResultSet rs, int i) throws SQLException {
        SalesPaymentTransaction salesPaymentTransaction = new SalesPaymentTransaction();
        salesPaymentTransaction.setTransactionId(rs.getInt("transaction_id"));
        salesPaymentTransaction.setParentId(rs.getInt("parent_id"));
        salesPaymentTransaction.setOrderId(rs.getInt("order_id"));
        salesPaymentTransaction.setPaymentId(rs.getInt("payment_id"));
        salesPaymentTransaction.setTxnId(rs.getString("txn_id"));
        salesPaymentTransaction.setParentTxnId(rs.getString("parent_txn_id"));
        salesPaymentTransaction.setTxnType(rs.getString("txn_type"));
        salesPaymentTransaction.setIsClosed(rs.getInt("is_closed"));
        salesPaymentTransaction.setAdditionalInformation(rs.getBytes("additional_information"));
        salesPaymentTransaction.setCreatedAt(rs.getTimestamp("created_at") != null ? rs.getTimestamp("created_at").toLocalDateTime() : null);
        return salesPaymentTransaction;
    }

}

